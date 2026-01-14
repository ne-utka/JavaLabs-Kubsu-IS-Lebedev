public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 0, -2, 5, 0, 1, -4, 0, 2};
        int[] x = compressAndSquareNonZero(arr);
        selectionSort(x);
        printVector(x, "Результат:");
    }

    private static int[] compressAndSquareNonZero(int[] arr) {
        int count = 0;
        for (int value : arr) {
            if (value != 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int idx = 0;
        for (int value : arr) {
            if (value != 0) {
                result[idx++] = value * value;
            }
        }
        return result;
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
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
