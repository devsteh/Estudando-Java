package arrays;
/*Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.*/
public class Ex1OrdemInversa {
    public static void main(String[] args) {
        //Necessário classificar o tipo dos dado do vetor ao fazer sua criação.
        //Array de 6 elementos  e 5 posições.
        int [] vetor = {0, -5, 15, 50, 8, 4};

        //Retorna quantidade de elementos
        //System.out.println(vetor.length);
        System.out.print("Vetor: ");
        int count = 0;
        while(count < (vetor.length)) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.print("\nVetor: ");
        for(int i = (vetor.length - 1);i >= 0; i--){
            System.out.print(vetor[i] + " ");
        }
    }
}
