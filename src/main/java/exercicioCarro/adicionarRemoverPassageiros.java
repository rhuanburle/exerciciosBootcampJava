package exercicioCarro;

import java.util.Scanner;

public class adicionarRemoverPassageiros {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Scanner subiram = new Scanner(System.in);
        Scanner desceram = new Scanner(System.in);

        System.out.println("Quantos passageiros subiram?");
        carro.passageiros += subiram.nextInt();

        System.out.println("Quantos passageiros desceram?");
        carro.passageiros -= desceram.nextInt();

        System.out.printf("O carro é um %s e tem %d pessoa/s dentro dele",(carro.getMarca()),(carro.getPassageiros()));
    }
}