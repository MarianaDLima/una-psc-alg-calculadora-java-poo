package br.com.una.calculadoraPoo;

import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        Scanner scan = new Scanner(System.in);
        String sair = "";

        System.out.println("Informe o primeiro numero inteiro: ");
        cal.setNumero1(scan.nextInt());

        System.out.println("Informe o segundo numero inteiro : ");
        cal.setNumero2(scan.nextInt());

        System.out.println("para sair do programa Digite 'Q'. ");
        sair = scan.nextLine();
        while (!sair.equals("Q")) {
            if (sair.equals("Q")) {
                System.out.println("Calculo encerrado.");
            } else {
                cal.realizarSoma();
                cal.realizarSubtracao();
                cal.realizarMultiplicacao();
                cal.realizarDivisao();
                cal.realizarPotencia();
                cal.realizarRaiz();

                System.out.println("Informe o primeiro numero inteiro: ");
                cal.setNumero1(scan.nextInt());
                System.out.println("Informe o segundo numero inteiro: ");
                cal.setNumero2(scan.nextInt());

                System.out.println("para sair do programa Digite 'Q'. ");
                sair = scan.nextLine();


            }
        }


    }
}
