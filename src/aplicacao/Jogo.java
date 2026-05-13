package aplicacao;


import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Jogo extends Remote {
    String jogar(int palpite, int jogador) throws RemoteException;
}
