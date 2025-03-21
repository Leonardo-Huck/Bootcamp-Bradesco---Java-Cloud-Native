package carro;

import java.util.Scanner;

public class CarroMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();
        var option = -1;

        do {
            System.out.println("\n====Escolha uma das opções====");
            System.out.println("1 - Ligar o Carro");
            System.out.println("2 - Desligar o Carro");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Diminuir");
            System.out.println("5 - Virar para direita");
            System.out.println("6 - Virar para esquerda");
            System.out.println("7 - Verificar velocidade");
            System.out.println("8 - Aumentar a marcha");
            System.out.println("9 - Diminuir a marcha");
            System.out.println("0 - Sair");
            option = scanner.nextInt();

            switch (option){
                case 1 -> carro.Ligar();
                case 2 -> carro.Desligar();
                case 3 -> carro.Acelerar();
                case 4 -> carro.Diminuir();
                case 5 -> carro.VirarParaDireita();
                case 6 -> carro.VirarParaEsquerda();
                case 7 -> System.out.println("A velocidade atual do carro é: " + carro.getVelocidade() + " km/h");
                case 8 -> carro.AumentarMarcha();
                case 9 -> carro.DiminuirMarcha();
                case 0 -> System.exit(0);
                default -> System.out.println("Opção inválida");
            }

        } while (true);

    }
}
