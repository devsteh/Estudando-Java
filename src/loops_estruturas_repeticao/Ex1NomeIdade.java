package loops_estruturas_repeticao;
//Criar um programa onde o usuário entrada de seu nome e idade.
//O programa deve para ao ser digitado 0 no nome.
import java.util.Scanner;

public class Ex1NomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while (true){
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Programa encerrado.");
    }
}
