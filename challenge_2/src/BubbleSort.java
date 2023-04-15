import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        for (int i = 0; i < (n - 1); i++) {
            swapped = false;

            for (int j = 0; j < (n - i - 1); j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        bubbleSort(array);

        System.out.println("Vetor ordenado:");
        System.out.println(Arrays.toString(array));

        scanner.close();
    }
}
