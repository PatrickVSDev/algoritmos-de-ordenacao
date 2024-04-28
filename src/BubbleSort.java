import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] vetor = {9,8,6,12,4,3,7};
        int aux;

        System.out.println(Arrays.toString(vetor));

        // Utilizamos 2 laços de repetição para executar o algoritmo
        // Um deles percorre todos os elementos e o outro compara elemento a elemento.
        // Comparamos elementos consecutivos e trocamos, caso necessário.
        for (int i = 0; i < vetor.length-1; i++) {
            for (int j = 0; j < vetor.length-1; j++) {
                if (vetor[j] > vetor[j+1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(vetor));
    }
}
