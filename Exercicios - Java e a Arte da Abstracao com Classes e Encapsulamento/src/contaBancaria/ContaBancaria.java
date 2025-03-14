package contaBancaria;

public class ContaBancaria {
    public static void main(String[] args) {
        Conta teste = new Conta("001", "Leonardo", 501 );

        teste.Sacar(100);
        teste.Sacar(500);
        teste.Sacar(100);

        teste.ConsultarSaldo();
        teste.ConsultarChequeEspecial();

        teste.Sacar(51);
        teste.Depositar(1);
        teste.Sacar(1);
        teste.Depositar(200);

        teste.ConsultarSaldo();
        teste.ConsultarChequeEspecial();

        teste.Depositar(300);
        teste.PagarBoleto(100, "000001");
        teste.PagarBoleto(100, "000002");
        teste.PagarBoleto(200, "000003");

        teste.ConsultarSaldo();
        teste.ConsultarChequeEspecial();

        teste.PagarBoleto(100, "000004");

        teste.ConsultarSaldo();
        teste.ConsultarChequeEspecial();
    }
}
