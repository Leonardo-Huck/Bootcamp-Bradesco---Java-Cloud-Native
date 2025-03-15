package contaBancaria;

public class Conta {
    private String numero;
    private String titular;
    private double chequeEspecial;
    private double chequeEspecialUsado = 0;
    private double chequeEspecialDisponivel;

    private double saldo;

    public Conta(String numero, String titular, double saldo) {
        this.saldo = saldo;
        if (saldo <= 500)
            this.chequeEspecial = 50.00;
        else
            this.chequeEspecial = saldo*0.5;
        chequeEspecialDisponivel = chequeEspecial;
        this.numero = numero;
        this.titular = titular;
    }

    public void ConsultarSaldo(){
        System.out.println("Saldo:");
        System.out.println("Saldo ....................... " + saldo);
        System.out.println("ChequeEspecial .............. " + chequeEspecialDisponivel);
        System.out.println("Total ....................... " + (saldo+chequeEspecialDisponivel));
    }
    public void ConsultarChequeEspecial(){
        System.out.println("Cheque Especial:");
        System.out.println("Cheque Especial ............... " +chequeEspecial);
        System.out.println("Valor Utilizado ............... " +chequeEspecialUsado);
        System.out.println("Valor Disponivel ......................... " +chequeEspecialDisponivel);

        if (chequeEspecialUsado > 0){
            System.out.println("Atenção será debitado R$" +(chequeEspecialUsado *0.2)+" da sua conta referente ao uso do cheque especial");
        }
    }
    public void Depositar(double valor){
        double taxa = chequeEspecialUsado*0.2;
        if (valor > 0){
            if (valor >= taxa){
                double valorADepositar = valor - taxa;
                if (taxa > 0) System.out.println("Realizamos a cobrança de R$" + taxa + " referente ao uso do cheque especial");
                if (valorADepositar > chequeEspecialUsado){
                    saldo += valorADepositar - chequeEspecialUsado;
                    chequeEspecialUsado = 0;
                    chequeEspecialDisponivel = chequeEspecial;
                } else {
                    chequeEspecialUsado -= valorADepositar;
                    chequeEspecialDisponivel = chequeEspecial - chequeEspecialUsado;
                }
                System.out.println("Deposito de R$" + valorADepositar + " realizado com sucesso");
            }else {
                chequeEspecialUsado -= valor;
                chequeEspecialDisponivel = chequeEspecial - chequeEspecialUsado;
                System.out.println("Deposito de R$" + valor + " realizado com sucesso");
            }
        }else
            System.out.println("Valor a depositar deve ser maior do que 0");
    }
    public void Sacar(double valor){
        if ((saldo+chequeEspecialDisponivel) >= valor) {
            if (valor > saldo) {
                chequeEspecialUsado += valor - saldo;
                chequeEspecialDisponivel = chequeEspecial - chequeEspecialUsado;
                saldo = 0;
            }else
                saldo -= valor;
            System.out.println("O valor de R$" + valor + " foi debitado da conta com sucesso!");
        }else
            System.out.println("Saldo insuficiente para realizar a transação!");
    }
    public void PagarBoleto(double valorBoleto, String codBarra) {
        double saldo = this.saldo + this.chequeEspecialDisponivel;
        if (valorBoleto <= saldo ){
            if (valorBoleto > saldo){
                double valorADebitar = valorBoleto - saldo;
                this.saldo = 0;
                chequeEspecialUsado += valorADebitar;
                chequeEspecialDisponivel = chequeEspecial - chequeEspecialUsado;
            }else if(valorBoleto < this.saldo) {
                this.saldo -= valorBoleto;
            }else {
                double valorADebitar = valorBoleto - this.saldo;
                this.saldo = 0;
                chequeEspecialUsado += valorADebitar;
                chequeEspecialDisponivel = chequeEspecial - chequeEspecialUsado;
            }
            System.out.println("Boleto pago com sucesso!");
        }else
            System.out.println("Saldo insuficiente para realizar a transação!");
    }
}
