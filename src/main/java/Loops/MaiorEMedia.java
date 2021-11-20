package Loops;

 /*
 Faça um programa que leia 5 número e informe o maior número.
 E também informe a média desses números
  */

import java.util.Scanner;

public class MaiorEMedia {
 public static void main(String[] args) {

   Scanner scan = new Scanner(System.in);

   int numero;
   int maior = 0;
   int soma = 0;



   int count = 0;
   do {

    System.out.println("Digite o número: ");
    numero = scan.nextInt();

    soma += numero;

    if(numero > maior) maior = numero;

    ++ count;

  } while (count < 5);

     System.out.println("O maior número digitado foi: " + maior);
     System.out.println("A média dos números digitados foi: " + (soma/5));

 }

}
