import java.util.Random;

public class InsertionSortExample {
    public static void main(String[] args) {
        int n = 10000;
        int[] arr = new int[n];
        Random rand = new Random();

        // Llenar el arreglo con números aleatorios
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10000); // Números aleatorios entre 0 y 9999
        }

        // Mostrar la lista desordenada
        System.out.println("Lista desordenada:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        long startTime = System.currentTimeMillis(); // Tiempo inicial

        // Aplicar el algoritmo de ordenamiento por inserción
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        long endTime = System.currentTimeMillis(); // Tiempo final

        // Mostrar la lista ordenada
        System.out.println("Lista ordenada:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        long executionTime = endTime - startTime;
        System.out.println("Tiempo de ejecución: " + executionTime + " milisegundos");
    }
}
