import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // Declaramos o vetor e as variaveis auxliares
        int[] vetor = {15, 21, 6, 14, 31, 13, 11, 9};
        int atual;
        int j;

        System.out.println(Arrays.toString(vetor));


        // Percorremos o vetor a partir da segunda posição comprarando com todas as anteriores e trocando caso
        // necessário ou enquanto houver elementos para comparar
        for (int i = 1; i < vetor.length; i++) {
            atual = vetor[i];
            j = i - 1;
            while (j >= 0 && vetor[j] >= atual) {
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = atual;
        }
        System.out.println(Arrays.toString(vetor));
    }
}
