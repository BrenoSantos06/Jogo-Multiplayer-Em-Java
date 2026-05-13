package aplicacao;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) throws Exception {

        Registry registry = LocateRegistry.getRegistry("localhost");

        Jogo jogo = (Jogo) registry.lookup("Jogo");

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem Vindo ao Jogo da Adivinhação!");
        System.out.println("Neste jogo, você deve acertar o numero secreto de 1 a 100!");
        System.out.print("Você é jogador 1 ou 2? ");
        int jogador = sc.nextInt();

        while (true) {

            System.out.print("Digite seu palpite: ");
            int palpite = sc.nextInt();

            String resposta = jogo.jogar(palpite, jogador);

            System.out.println(resposta);

            if (resposta.contains("venceu") || resposta.contains("acabou")) {
                break;
            }
        }

        sc.close();
    }
}