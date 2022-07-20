package loops_estruturas_repeticao;

import java.util.Scanner;

/*Criar um programa que peça N números inteiros, calcule e mostre a quantidade de números ímpares.*/
public class Ex4ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0;
        int quantImpares = 0;
        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();

        int count = 0;
        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count = count + 1;
        }while (count < quantNumeros);
        System.out.println("Quantidade Pares: " + quantPares);
        System.out.println("Quantidade Impares: " + quantImpares);
    }
}
