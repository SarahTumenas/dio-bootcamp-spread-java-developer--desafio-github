package Loops;

/*
faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário
Ex : 5! =120
 */

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        int numero;

        Scanner scanner= new Scanner(System.in);

        System.out.println("Qual o número que deseja calcular o fatorial? ");
        numero = scanner.nextInt();

        int multiplicacao = 1;

        for (int i = numero; i >= 1; i --){
            multiplicacao *= i;
        }

        System.out.println(numero + "!= " + multiplicacao);
    }

}
