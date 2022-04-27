package src.lab7_2;

import java.util.ArrayList;
import java.util.HashSet;

public class Program {
    public static void main(String[] args) {
        // 6. Напечатать без повторения слова текста, у которых первая и последняя буквы совпадают.
        String text = "aaa aba aba bbb baa daa";
        String[] split = text.split(" ");
        HashSet<String> set = new HashSet<>();
        for (String w: split){
            if (w.matches("(.).*\\1")) {
                set.add(w);
            }
        }
        System.out.println(set);

        // 7. В тексте найти и напечатать все слова максимальной и все слова минимальной длины.
        String str = "aaaaaa b c d dd eee ffffff";
        String[] splitStr = str.split(" ");
        ArrayList<String> maxLen = new ArrayList<>();
        ArrayList<String> minLen = new ArrayList<>();
        int minLength = 9999;
        int maxLength = 0;
        for (String w: splitStr){
            if (w.length() < minLength) minLength = w.length();
            if (w.length() > maxLength) maxLength = w.length();
        }
        for (String w: splitStr){
            if (w.length() == maxLength) maxLen.add(w);
            if (w.length() == minLength) minLen.add(w);
        }
        System.out.println("Минимальная длина:");
        System.out.println(minLen);
        System.out.println("Максимальная длина:");
        System.out.println(maxLen);
    }
}
