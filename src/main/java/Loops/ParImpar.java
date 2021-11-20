package Loops;

import java.util.Scanner;

/*
Faça um program que peça N números inteiros, calcule e mostre a quantidade de números pares e de números
ímpares
 */
public class ParImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int quantNumeros;
        int numero = 0;
        int quantPar = 0;
        int quantImpar = 0;

        System.out.println("Quantidade de números que serão digitados: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do {

            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPar++;
            else quantImpar++;

           ++ count;

        } while (count < quantNumeros);

        System.out.println("A quantidade de números pares foi: " + quantPar);
        System.out.println("A quantidade de números ímpares foi: " + quantImpar);


    }
}
