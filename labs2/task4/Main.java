import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 6;
        int[][] matrix = fillRandomMatrix(rows, cols, 0, 9);
        int[] b = countEvenPerRow(matrix);

        printMatrix(matrix, "Матрица:");
        printVector(b, "Вектор B:");
    }

    private static int[][] fillRandomMatrix(int rows, int cols, int min, int max) {
        int[][] matrix = new int[rows][cols];
        int range = max - min + 1;
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = min + random.nextInt(range);
            }
        }
        return matrix;
    }

    private static int[] countEvenPerRow(int[][] matrix) {
        int[] result = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

    private static void printMatrix(int[][] matrix, String message) {
        System.out.println(message);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (j > 0) {
                    System.out.print(" ");
                }
                System.out.print(matrix[i][j]);
            }
            System.out.println();
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
