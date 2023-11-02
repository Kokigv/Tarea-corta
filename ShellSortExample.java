import java.util.Random;

public class ShellSortExample {

    public static void main(String[] args) {
        int[] array = generateRandomArray(10000);

        System.out.println("Arreglo original:");
        printArray(array);

        long startTime = System.currentTimeMillis();
        shellSort(array);
        long endTime = System.currentTimeMillis();

        System.out.println("Arreglo ordenado:");
        printArray(array);

        System.out.println("Tiempo transcurrido: " + (endTime - startTime) + " milisegundos");
    }

    public static void shellSort(int[] array) {
        int n = array.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }

    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10000); // Rango de valores aleatorios
        }

        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
