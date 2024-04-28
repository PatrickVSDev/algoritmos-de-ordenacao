import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] vetor = {9,8,6,12,4,3,7};
        int posMenor;
        int aux;

        System.out.println(Arrays.toString(vetor));

        // Percorremos o vetor com dois laços de repetição. Um para percorrer
        // todos os elementos e outra para descobrir o menor dentre os elementos
        // restantes. Fazemos a troca caso necessário.
        for (int i = 0; i < vetor.length; i++) {
            posMenor = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[posMenor]) {
                    posMenor = j;
                }
            }
            if (posMenor != i) {
                aux = vetor[posMenor];
                vetor[posMenor] = vetor[i];
                vetor[i] = aux;
            }
        }
        System.out.println(Arrays.toString(vetor));
    }
}
