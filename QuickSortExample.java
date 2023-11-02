import java.util.Random;

public class QuickSortExample {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10000); // Llena el arreglo con valores aleatorios
        }

        System.out.println("Arreglo original:");
        printArray(arr);

        long startTime = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long endTime = System.currentTimeMillis();

        System.out.println("\nArreglo ordenado:");
        printArray(arr);

        System.out.println("\nTiempo de ejecución: " + (endTime - startTime) + " milisegundos");
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
