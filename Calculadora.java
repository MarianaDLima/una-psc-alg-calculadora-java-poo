package br.com.una.calculadoraPoo;

public class Calculadora {
    public int numero1=0 ,numero2=0 ;
    private int adicao = 0,subtracao = 0,multiplicacao = 0,divisao = 0,potencia = 0, total = 0;
    private double raizQ = 0;

    public Calculadora(int numero1, int numero2, int adicao, int subtracao, int multiplicacao, int divisao, int potencia, int raizQ, int total) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.adicao = adicao;
        this.subtracao = subtracao;
        this.multiplicacao = multiplicacao;
        this.divisao = divisao;
        this.potencia = potencia;
        this.raizQ = raizQ;
        this.total = total;
    }

    public Calculadora (){
    };

    public void realizarSoma(){
        this.total = this.numero1 + this.numero2;
        System.out.println("O valor da soma é: " + total);
    }
    public void realizarSubtracao(){
        this.total = this.numero1 - this.numero2;
        System.out.println("O valor da subtração é: " + total);
    }
    public void realizarMultiplicacao(){
        this.total = this.numero1 * this.numero2;
        System.out.println("O valor da Multiplicação é: " + total);
    }
    public void realizarDivisao(){
        this.total = this.numero1 / this.numero2;
        System.out.println("O valor da divisão é: " + total);
        if(divisao < 0){
            System.out.println("Impossivel realizar uma divisão por 0.");
        }
    }
    public void realizarPotencia(){
        this.total = this.numero1 ^ this.numero2;
        System.out.println("O valor da potencia é: " + total);

    }
    public void realizarRaiz(){
        raizQ = Math.sqrt(this.numero1);
        raizQ = Math.sqrt(numero2);
        System.out.println("O valor da raiz é: " + raizQ);
        if (raizQ < 0 ){
            System.out.println("Não existe raiz de número negativo");
        }

    }


    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
}
