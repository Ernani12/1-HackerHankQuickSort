
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuickSortExample {

    public static void main(String[] args) {
        // Criando uma lista de inteiros para ordenar
        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(1);
        arr.add(5);

        // Exibindo a lista original
        System.out.println("Lista original: " + arr);

        // Chamando o método quickSort para ordenar a lista
        quickSort(arr, 0, arr.size() - 1);

        // Exibindo a lista ordenada
        System.out.println("Lista ordenada: " + arr);
    }

    private static List<Integer> quickSort(List<Integer> arr, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivo = particao(arr, inicio, fim);
            quickSort(arr, inicio, indicePivo - 1);
            quickSort(arr, indicePivo + 1, fim);
        }
        return arr;
    }

    private static int particao(List<Integer> arr, int inicio, int fim) {
        int pivo = arr.get(fim);
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (arr.get(j) <= pivo) {
                i++;
                Collections.swap(arr, i, j);
            }
        }

        Collections.swap(arr, i + 1, fim);
        return i + 1;
    }
}