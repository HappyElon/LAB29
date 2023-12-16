package ru.mirea.LAB29.task1;

import java.util.Scanner;

public class RoadsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int roadCount = countRoads(matrix);

        System.out.println(roadCount);
    }

    private static int countRoads(int[][] matrix) {
        int roadCount = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                roadCount += matrix[i][j];
            }
        }
        return roadCount / 2;
    }
}

