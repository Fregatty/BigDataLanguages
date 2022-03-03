package src.lab2_1;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Formatter f = new Formatter();
        Calendar c = Calendar.getInstance();

        System.out.println(f.format(
                        "Тарасов%nВремя получения задания: 18 февраля 2022 5:25 pm%nВремя сдачи задания: %te %tB %tY %tl:%tM %tp",
                        c, c, c, c, c, c
                )
        );
        System.out.println("Введите n:");
        Scanner console = new Scanner(System.in);
        Random rnd = new Random(System.currentTimeMillis());
        int n = console.nextInt();
        int[][] matr = new int[n][n];
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                matr[i][j] = -n + rnd.nextInt(n - (-n) + 1);
            }
        }
        int max_sum = 0;
        for (int i=0; i<n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += Math.abs(matr[i][j]);
            }
            if (sum > max_sum) {
                max_sum = sum;
            }
        }
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(matr[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.println("Норма матрицы: " + max_sum);
        rotateMatrix90Degrees(matr);
        System.out.println("Поворот на 90 градусов:");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(matr[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
        rotateMatrix90Degrees(matr);
        System.out.println("Поворот на 180 градусов:");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(matr[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
        rotateMatrix90Degrees(matr);
        System.out.println("Поворот на 270 градусов:");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(matr[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    private static void rotateMatrix90Degrees(int[][] matrix) {
        int n = matrix.length;

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i=0; i<n; i++) {
            int low = 0, high = n-1;
            while(low < high)
            {
                int temp = matrix[low][i];
                matrix[low][i] = matrix[high][i];
                matrix[high][i] = temp;
                low++;
                high--;
            }
        }
    }
}
