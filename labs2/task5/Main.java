import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int[][] a = fillRandomMatrix(n, n, -9, 9);
        printMatrix(a, "Матрица A:");

        double mean = geometricMeanOfNegativeSubDiagonal(a);
        if (Double.isNaN(mean)) {
            System.out.println("Нет отрицательных элементов");
        } else {
            System.out.println("Среднее геометрическое: " + mean);
        }
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

    private static double geometricMeanOfNegativeSubDiagonal(int[][] a) {
        double product = 1.0;
        int count = 0;
        for (int i = 1; i < a.length; i++) {
            int value = a[i][i - 1];
            if (value < 0) {
                product *= Math.abs(value);
                count++;
            }
        }
        if (count == 0) {
            return Double.NaN;
        }
        return Math.pow(product, 1.0 / count);
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
}
