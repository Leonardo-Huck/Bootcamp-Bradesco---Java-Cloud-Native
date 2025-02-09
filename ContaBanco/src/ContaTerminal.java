import java.io.InputStream;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor informe o número da conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Por favor informe o número da agencia: (ex: 067-8)");
        agencia = scanner.next();

        System.out.println("Por favor informe o nome do cliente: ");
        nomeCliente = scanner.next();

        System.out.println("Por favor informe o saldo da conta: ");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %S, obrigado por criar uma conta em nosso banco,\n" +
                "sua agência é %s, conta %d e seu saldo de R$%.2f já está disponível para saque!", nomeCliente, agencia, numeroConta, saldo);
        scanner.close();

    }
}