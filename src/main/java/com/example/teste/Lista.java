package com.example.teste;

import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        menu();
        Scanner in = new Scanner(System.in);
        String opcaoMenu = in.nextLine().toLowerCase();

        while (!(opcaoMenu.equals("0") || opcaoMenu.equals("fechar"))){
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
}
