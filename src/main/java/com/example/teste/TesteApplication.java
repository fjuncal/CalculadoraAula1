package com.example.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class TesteApplication {

    public static void main(String[] args) {
        menu();

        Scanner in = new Scanner(System.in);
        String opcaoMenu = in.nextLine().toLowerCase();

        while (!(opcaoMenu.equals("0") || opcaoMenu.equals("fechar"))) {

            if (opcaoMenu.equals("1") || opcaoMenu.equals("soma")) {
                double primeiroOperador = getPrimeiroOperador(in);
                double segundoOperador = getSegundoOperador(in);
                System.out.println("O resultado da soma é: " + soma(primeiroOperador, segundoOperador));
            } else if (opcaoMenu.equals("2") || opcaoMenu.equals("subtração")) {
                double primeiroOperador = getPrimeiroOperador(in);
                double segundoOperador = getSegundoOperador(in);
                System.out.println("O resultado da subtração é: " + subtracao(primeiroOperador, segundoOperador));
            } else if (opcaoMenu.equals("3") || opcaoMenu.equals("divisão")) {
                double primeiroOperador = getPrimeiroOperador(in);
                double segundoOperador = getSegundoOperador(in);
                System.out.println("O resultado da divisão é: " + divisao(primeiroOperador, segundoOperador));
            } else if (opcaoMenu.equals("4") || opcaoMenu.equals("multiplicação")) {
                Long primeiroOperador = (long) getPrimeiroOperador(in);
                Long segundoOperador = (long) getSegundoOperador(in);
                System.out.println("O resultado da multiplicação é: " + multiplicacao(primeiroOperador, segundoOperador));
            } else {
                System.out.println("Opção inválida");
            }
            menu();

            in = new Scanner(System.in);
            opcaoMenu = in.nextLine().toLowerCase();
        }

    }

    private static void menu() {
        System.out.println("----------------------------------");
        System.out.println("CALCULADORA DO JF");
        System.out.println("----------------------------------");
        System.out.println("MENU: ");
        System.out.println("----------------------------------");
        System.out.println("1 - Soma ");
        System.out.println("2 - Subtração ");
        System.out.println("3 - Divisão ");
        System.out.println("4 - Multiplicação ");
        System.out.println("0 - Fechar ");
        System.out.println("Escolha uma opção (número da opção ou a escrita): ");
    }

    private static double getSegundoOperador(Scanner in) {
        System.out.println("Informe o segundo operador: ");
        return in.nextDouble();
    }

    private static double getPrimeiroOperador(Scanner in) {
        System.out.println("Informe o primeiro operador: ");
        return in.nextDouble();
    }

    public static Double soma(Double primeiroOperador, Double segundoOperador){
        return primeiroOperador + segundoOperador;
    }

    public static Double subtracao(Double primeiroOperador, Double segundoOperador){
        return primeiroOperador - segundoOperador;
    }

    public static Double divisao(Double primeiroOperador, Double segundoOperador){
        if (segundoOperador.equals(0.0)){
            System.out.println("Não é possivel Dividir nenhum número por zero");
            return 0.0;
        }
        return primeiroOperador / segundoOperador;
    }

    public static Long multiplicacao(Long primeiroOperador, Long segundoOperador){
        return primeiroOperador * segundoOperador;
    }

}
