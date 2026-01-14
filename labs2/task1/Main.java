import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = fillRandomIntVector(30, 100, 200);
        printVector(arr, "Исходный вектор:");
        sortArray(arr);
        printVector(arr, "Отсортированный вектор:");
    }

    private static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static int[] fillRandomIntVector(int size, int min, int max) {
        int[] arr = new int[size];
        int range = max - min + 1;
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = min + random.nextInt(range);
        }
        return arr;
    }

    private static void printVector(int[] arr, String message) {
        System.out.println(message);
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
