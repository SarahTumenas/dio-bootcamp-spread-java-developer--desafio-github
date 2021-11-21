package Arrays;
/*
Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazenando-os num vetor.
Ao final mostre os numeros, seus sucessores e antecessores.
 */

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random= new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i ++) {

            int number = random.nextInt(100);
            numerosAleatorios[i] = number;

        }

        System.out.print("Números Aleatórios: ");

        for (int number: numerosAleatorios) {

            System.out.print(number + " ");

        }

        System.out.print("\nNúmeros Sucessores dos Aleatórios: ");

        for (int number: numerosAleatorios) {

            System.out.print((number + 1)+ " ");

        }

        System.out.print("\nNúmeros Antecessores dos Aleatórios: ");

        for (int number: numerosAleatorios) {

            System.out.print((number - 1)+ " ");

        }

    }


}
