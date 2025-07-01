package application;

import java.util.Scanner;

public class ExemploMenu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        var opcao = 0;

        int valor1, valor2, operador;

        System.out.print("Informe o primeiro valor: ");
        valor1 = scan.nextInt();
        System.out.print("Informe o segundo valor: ");
        valor2 = scan.nextInt();

        System.out.println("Escolha a opção de 1 a 4, e 5 para sair:");
        opcao = scan.nextInt();

        while (opcao != 5) {
            if (opcao == 1) {
                operador = valor1 + valor2;
                System.out.println("Adição: " + operador);
            } else if (opcao == 2) {
                operador = valor1 - valor2;
                System.out.println("Subtração: " + operador);
            } else if (opcao == 3) {
                operador = valor1 * valor2;
                System.out.println("Multiplicação: " + operador);
            } else if (opcao == 4) {
                operador = valor1 / valor2;
                System.out.println("Subtração: " + operador);
            }
            opcao = scan.nextInt();
        }

    }
}

