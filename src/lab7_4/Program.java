package src.lab7_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {
    public static void main(String[] args) {
        // 6. Вывести в заданном тексте все слова, расположив их в алфавитном порядке.
        String str = "aaaa bbb hhh tttt ee c d dd eee ffffff";
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(str.split(" ")));
        Collections.sort(arr);
        System.out.println(arr);

        // 7. Подсчитать, сколько слов в заданном тексте начинается с прописной буквы.
        String text = "Aaaaaa bbbb Ccccc Dddd Eeee fFFf ggg aAAaa";
        Pattern pattern = Pattern.compile("\\b[A-ZА-Я]");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.results().count());
    }
}
