package aplicacao;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Jogo extends Remote {

    String jogar(int palpite, int jogador)
            throws RemoteException;

    String obterHistorico()
            throws RemoteException;

    int obterTurno()
            throws RemoteException;

    boolean jogoEncerrado()
            throws RemoteException;
}