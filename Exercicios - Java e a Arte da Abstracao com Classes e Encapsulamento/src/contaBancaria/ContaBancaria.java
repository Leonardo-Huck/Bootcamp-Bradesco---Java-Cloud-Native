package contaBancaria;

import com.sun.source.tree.WhileLoopTree;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numeroConta;
        String titularConta;
        double saldo;

        System.out.println("------------- Simulador de conta Bancária --------------------");
        System.out.println("Informe os dados para criação da conta");
        System.out.println("Numero da conta: ");
        numeroConta = scanner.next();
        System.out.println("Nome do titular: ");
        titularConta = scanner.next();
        System.out.println("Saldo da conta: ");
        saldo = scanner.nextDouble();
        Conta conta = new Conta(numeroConta, titularConta, saldo);

        int flag = 9;
        do {
            System.out.println("\nEscolha uma opção: ");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Consultar Cheque Especial");
            System.out.println("3 - Sacar");
            System.out.println("4 - Depositar");
            System.out.println("5 - Pagar um Boleto");
            System.out.println("0 - Sair");
            flag = scanner.nextInt();

            if (flag == 1) conta.ConsultarSaldo();
            if (flag == 2) conta.ConsultarChequeEspecial();
            if (flag == 3){
                System.out.println("Informe o valor a ser sacado: R$ ");
                double valorSaque=scanner.nextDouble();
                conta.Sacar(valorSaque);
            }
            if (flag == 4){
                System.out.println("Informe o valor a ser depositado: R$ ");
                double valorDeposito = scanner.nextDouble();
                conta.Depositar(valorDeposito);
            }
            if (flag == 5){
                System.out.println("Informe os dados do boleto ");
                System.out.println("Código de barras: ");
                String codigoBarras = scanner.next();
                System.out.println("Valor do boleto: ");
                double valorBoleto = scanner.nextDouble();
                conta.PagarBoleto(valorBoleto, codigoBarras);
            }

        }while (flag != 0);
    }
}
