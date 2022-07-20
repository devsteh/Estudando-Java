package loops_estruturas_repeticao;

import java.util.Scanner;

/*Criar um programa que leia 5 números, informar o maior número e a média entre eles.*/
public class Ex3MaiorMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;


        int count = 0;
        do{
            System.out.println("Numero: ");
            numero = scan.nextInt();

            soma = soma + numero;


            if (numero > maior) maior = numero;
            count = count + 1;
        }while(count < 5);

        System.out.println("Maior numero digitado: " + maior);
        System.out.println("Media: " + (soma/5));
    }
}
