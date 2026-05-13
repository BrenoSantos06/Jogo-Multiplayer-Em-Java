package aplicacao;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.Random;

public class JogoImpl extends UnicastRemoteObject implements Jogo {

    private int numeroSecreto;
    private int turno = 1;
    private boolean fimDeJogo = false;

    protected JogoImpl() throws RemoteException {
        numeroSecreto = new Random().nextInt(100) + 1;
    }

    public synchronized String jogar(int palpite, int jogador) throws RemoteException {

        if (fimDeJogo) {
            return "O jogo acabou!";
        }

        if (jogador != turno) {
            return "Não é sua vez!";
        }

        if (palpite == numeroSecreto) {
            fimDeJogo = true;
            return "Jogador " + jogador + " venceu!";
        }

        String resposta;

        if (palpite < numeroSecreto) {
            resposta = "MAIOR";
        } else {
            resposta = "MENOR";
        }

        turno = (turno == 1) ? 2 : 1;

        return resposta;
    }
}