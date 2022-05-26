package src.lab1_2;
import java.util.ArrayList;
import java.util.Scanner;

// Из варианта 2 - задание 1 и 2

public class Program {
    public static void main(String[] args) {
        System.out.println("Введите n:");
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        System.out.println("Введите " + n + " чисел");
        int[] arr = new int[n];
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();

        for (int i=0; i<n; i++){
            arr[i] = console.nextInt();
        }
        int min = arr[0];
        int max = arr[0];

        for (int j : arr) {
            if (j < min) {
                min = j;
            }
            if (j > max) {
                max = j;
            }
            if (j % 2 == 0){
                even.add(j);
            }
            else {
                odd.add(j);
            }
        }
        System.out.println("Нечетные: " + odd);
        System.out.println("Четные: " + even);
        System.out.println("Наибольшее: " + max);
        System.out.println("Наименьшее: " + min);
    }
}
