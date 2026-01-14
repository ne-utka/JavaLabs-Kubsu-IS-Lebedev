import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = fillRandomIntVector(30, -99, 99);
        double[] reciprocal = createReciprocalFraction(arr);
        int[] repeats = extractRepeatingElements(arr);

        printVector(arr, "Исходный массив:");
        printVector(reciprocal, "Обратные значения:");
        printVector(repeats, "Повторяющиеся элементы:");
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

    private static double[] createReciprocalFraction(int[] arr) {
        double[] result = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            try {
                result[i] = 1.0 / arr[i];
            } catch (ArithmeticException e) {
                result[i] = 0.0;
            }
        }
        return result;
    }

    private static int[] extractRepeatingElements(int[] arr) {
        int[] counts = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counts[i]++;
                }
            }
        }

        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (counts[i] > 1) {
                size++;
            }
        }

        int[] result = new int[size];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (counts[i] > 1) {
                result[idx++] = arr[i];
            }
        }
        return result;
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

    private static void printVector(double[] arr, String message) {
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
