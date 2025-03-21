package carro;

public class Carro {
    private boolean ligado;
    private int marcha;
    private int velocidade;

    public Carro(){
        this.ligado = false;
        this.marcha = 0;
        this.velocidade = 0;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void Ligar(){
        if (!isLigado()){
            if (velocidade == 0 && getMarcha() == 0){
                ligado = true;
                System.out.println("Ligando o carro");
            }else System.out.println("O carro precisa estar parado e em ponto morto para ligar");
        }else System.out.println("O carro já está ligado");
    }
    public void Desligar(){
        if (marcha == 0 && velocidade == 0){
            ligado = false;
            System.out.println("Desligando o carro");
        }else System.out.println("O carro só podera ser desligado quando estiver em ponto morto e parado");
    }
    public void Acelerar(){
        if (isLigado() && velocidade <= 120){
            int marcha = getMarcha();
            if (marcha == 0){
                System.out.println("Não é possivel acelerar o carro em ponto morto");
                return;
            } else if (velocidade >= 0 && velocidade < 20){
                if (marcha == 1) velocidade++;
                else {
                    System.out.println("Para acelerar é preciso estar na 1 marcha");
                    return;
                }
            } else if (velocidade >= 20 && velocidade < 40){
                if (marcha == 2) velocidade++;
                else {
                    System.out.println("Para acelerar é preciso estar na 2 marcha");
                    return;
                }
            }else if (velocidade >= 40 && velocidade < 60){
                if (marcha == 3) velocidade++;
                else {
                    System.out.println("Para acelerar é preciso estar na 3 marcha");
                    return;
                }
            }else if (velocidade >= 60 && velocidade < 80){
                if (marcha == 4) velocidade++;
                else {
                    System.out.println("Para acelerar é preciso estar na 4 marcha");
                    return;
                }
            }else if (velocidade >= 80 && velocidade < 100){
                if (marcha == 5) velocidade++;
                else {
                    System.out.println("Para acelerar é preciso estar na 5 marcha");
                    return;
                }
            }else if (velocidade >= 100 && velocidade <= 119){
                if (marcha == 6) velocidade++;
                else {
                    System.out.println("Para acelerar é preciso estar na 6 marcha");
                    return;
                }
            }else{
                System.out.println("Não é possivel acelerar");
                return;
            }
            System.out.println("Acelerando o carro, velocidade atual: " + getVelocidade());
        }else System.out.println("O carro precisa estar ligado para acelerar");
    }
    public void Diminuir(){
        if (isLigado() && velocidade > 0){
            velocidade--;
            System.out.println("Diminuindo a velocidade, velocidade atual: " + getVelocidade());
        }else if (velocidade == 0) System.out.println("O carro está parado");
        else System.out.println("O carro precisa estar ligado para diminuir");
    }
    public void VirarParaDireita(){
        if (isLigado()){
            if (velocidade > 0 && velocidade <= 40){
                System.out.println("Virando para a direita");
            }else System.out.println("Para virar a velocidade precisa estar entre 1 e 40 km/h");
        }else System.out.println("O carro precisa estar ligado para realizar uma ação");
    }
    public void VirarParaEsquerda(){
        if (isLigado()){
            if (velocidade > 0 && velocidade <= 40){
                System.out.println("Virando para a esquerda");
            }else System.out.println("Para virar a velocidade precisa estar entre 1 e 40 km/h");
        }else System.out.println("O carro precisa estar ligado para realizar uma ação");
    }
    public void AumentarMarcha(){
        if (isLigado()){
            if (getMarcha() < 6){
                marcha++;
                System.out.println("Marcha mudada para: " + getMarcha() + " Marcha");
            }else System.out.println("Não é possivel aumentar a marcha");
        }else System.out.println("O carro precisa estar ligado para aumentar a marcha");
    }
    public void  DiminuirMarcha(){
        if (isLigado()) {
            if (getMarcha() > 0){
                marcha--;
                System.out.println("Marcha mudada para: " + getMarcha() + " Marcha");
            }else System.out.println("Não é possivel diminuir a marcha");
        }else System.out.println("O carro precisa estar ligado para diminuir a marcha");
    }
}
