package Loops;

/*
desenvolva um gerador de tabuada, capaz de gerar a tabuada de quanlquer inteiro entre 1 a 10.
O usuário deverá informar de qual número ele deseja ver a tabuada.
a saída deve ser conforme o exemplo abaixo:

tabuada do 5:
5 X 1 = 5
5 X 2 = 10
...
5 x 10 = 50

 */


import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        byte numero;

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual número de 1 a 10 deseja que seja feita a tabuada? ");
        numero = scan.nextByte();

        for (int i = 1 ; i <= 10; i++ ){

            System.out.println(numero + " X " + i + " = " + (numero*i) );

        }

    }

}
