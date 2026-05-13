package aplicacao;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

public class JogoImpl
        extends UnicastRemoteObject
        implements Jogo {

    private int numeroSecreto;

    private int turno = 1;

    private boolean encerrado = false;

    private String historico = "";

    protected JogoImpl()
            throws RemoteException {

        numeroSecreto =
                new Random().nextInt(100) + 1;

        historico +=
                "Jogo iniciado!\n";
    }

    @Override
    public synchronized String jogar(
            int palpite,
            int jogador
    ) throws RemoteException {

        if (encerrado) {
            return "JOGO_ENCERRADO";
        }

        if (jogador != turno) {
            return "ESPERE";
        }

        historico +=
                "\nJogador "
                        + jogador
                        + " jogou "
                        + palpite;

        if (palpite == numeroSecreto) {

            encerrado = true;

            historico +=
                    "\n\nJogador "
                            + jogador
                            + " venceu!";

            return "VENCEU";
        }

        String resposta;

        if (palpite < numeroSecreto) {

            resposta = "MAIOR";

            historico +=
                    "\nO número é MAIOR";

        } else {

            resposta = "MENOR";

            historico +=
                    "\nO número é MENOR";
        }

        turno = (turno == 1) ? 2 : 1;

        return resposta;
    }

    @Override
    public synchronized String obterHistorico()
            throws RemoteException {

        return historico;
    }

    @Override
    public synchronized int obterTurno()
            throws RemoteException {

        return turno;
    }

    @Override
    public synchronized boolean jogoEncerrado()
            throws RemoteException {

        return encerrado;
    }
}