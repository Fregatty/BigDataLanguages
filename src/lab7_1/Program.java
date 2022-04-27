package src.lab7_1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // 6. После каждого слова текста, заканчивающегося заданной подстрокой, вставить указанное слово.
        String lookup_word = "re";
        String inserted_word = "WORD";
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        System.out.println(text.replaceAll("(" + lookup_word + ")\\b[,. ]", "$1 " + inserted_word + " "));

        // 7.	В зависимости от признака (0 или 1) в каждой строке текста удалить указанный символ везде, где он встречается, или вставить его после k-гo символа.
        String str = "Lorem ipsum dolor sit amet\nconsectetur adipiscing elit\nsed do eiusmod tempor incididunt ut labore\net dolore magna aliqua";
        String[] split = str.split("\n");
        Scanner console = new Scanner(System.in);
        int flag = console.nextInt();
        System.out.println("Введите символ");
        String ch = console.next();
        if (flag == 1){
            System.out.println("Введите номер символа");
            int k = console.nextInt();
            for (String w: split){
                System.out.println(w.substring(0, k) + ch + w.substring(k));
            }
        }
        else {
            for (String w: split){
                System.out.println(w.replaceAll(ch, ""));
            }
        }

    }
}
