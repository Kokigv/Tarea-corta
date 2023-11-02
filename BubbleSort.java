import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        int n = 10000;
        int[] arr = new int[n];

        // Genera una lista aleatoria de 10,000 elementos
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(100000); // Números aleatorios entre 0 y 99,999
        }

        System.out.println("Lista desordenada:");
        // Muestra la lista desordenada
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        long startTime = System.currentTimeMillis();
        bubbleSort(arr); // Ordena la lista utilizando Bubble Sort
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("\nLista ordenada:");
        // Muestra la lista ordenada
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nTiempo de ejecución: " + duration + " milisegundos");
    }

    // Implementación de Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambia arr[j] y arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
