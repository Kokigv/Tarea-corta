import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        int[] lista = new int[10000];
        Random random = new Random();
        for (int i = 0; i < lista.length; i++) {
            lista[i] = random.nextInt(10000); 
        }

        System.out.println("Lista original:");
        imprimirLista(lista);

        long startTime = System.currentTimeMillis();

        selectionSort(lista);

        long endTime = System.currentTimeMillis();

        System.out.println("Lista ordenada:");
        imprimirLista(lista);

        long tiempoTranscurrido = endTime - startTime;
        System.out.println("Tiempo transcurrido: " + tiempoTranscurrido + " ms");
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void imprimirLista(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
