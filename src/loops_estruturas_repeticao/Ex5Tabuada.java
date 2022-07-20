package loops_estruturas_repeticao;

import java.util.Scanner;

/*Criar um programa gerador de tabuada, capaz de gerar qualquer número inteiro entre 1 a 10.
* O usuário deve informar de qual número ele deseja ver a tabuada.*/
public class Ex5Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tabuada;
        int count = 0;

        System.out.println("Digite o numero correspondente a tabuada que deseja ver: ");
        tabuada = scan.nextInt();

        System.out.println("Tabuada de: " + tabuada);

        /*
        Resolução em FOR - Mesmo efeito de resultado.
        System.out.println("Tabuada de: " + tabuada);

        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada + "X" + i + "=" + (tabuada*i));
        }*/

        do{
            System.out.println(tabuada + " X " + count + " = " + (tabuada*count));
            count = count + 1;
        }while (count <= 10);

    }
}
