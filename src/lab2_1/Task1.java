package src.lab2_1;

import java.util.Calendar;
import java.util.Formatter;
import java.util.HashSet;
import java.util.Scanner;

// Задание 6 и 7

public class Task1 {
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
        int n = console.nextInt();
        System.out.println("Введите " + n + " строк");
        String[] arr = new String[n];
        HashSet<Character> charset = new HashSet<>();

        for (int i=0; i<n; i++){
            arr[i] = console.next();
        }

        for (String j: arr) {
            boolean flag = true;
            int char_code = 0;
            for (char ch : j.toCharArray()) {
                if ((int) ch > char_code) {
                    char_code = ch;
                } else {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("Слово с возрастанием кодов: " + j);
                break;
            }
        }
        for (String j: arr) {
            charset.clear();
            for (char ch : j.toCharArray()) {
                charset.add(ch);
            }
            if (charset.size() == j.length()) {
                System.out.println("Слово с различными символами: " + j);
                break;
            }
        }
    }
}
