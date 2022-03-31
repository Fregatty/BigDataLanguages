package src.lab5_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Program {
    public static void main(String[] args) throws Exception {
        try {
            TreeMap<String, Integer> wordsList = new TreeMap<>();
            TreeMap<Integer, String> sorted = new TreeMap<>();

            wordsList.put("мне", 0);
            wordsList.put("как", 0);
            wordsList.put("у", 0);

            System.out.println("Стихотворение Ахматовой");

            File poem = new File("src/lab5_3/data/ahm.txt");

            Scanner reader = new Scanner(poem, StandardCharsets.UTF_8);

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                String[] words = data.split("\\s");

                for(String w:words){
                    if (wordsList.containsKey(w)) {
                        int count = wordsList.get(w);
                        wordsList.put(w, count+1);
                    }
                }
                System.out.println();
            }
            System.out.print("\n");

            System.out.println("Стихотворение обработано");

            for(Map.Entry<String,Integer> entry : wordsList.entrySet()) {
                sorted.put(entry.getValue(), entry.getKey());
            }

            reader.close();

            for(Map.Entry<Integer,String> entry : sorted.entrySet()) {
                System.out.println(entry.getValue() + ' ' + entry.getKey());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода/вывода");
            e.printStackTrace();
        }


        try {
            System.out.println("Стихотворение Н. Заболоцкого");

            File poem = new File("src/lab5_3/data/poem_orig.txt");

            String output_poem = "src/lab5_3/data/poem_fin.txt";

            FileWriter writer = new FileWriter(output_poem, StandardCharsets.UTF_8);

            Scanner reader = new Scanner(poem, StandardCharsets.UTF_8);

            while (reader.hasNextLine()) {
                System.out.print(".");
                String data = reader.nextLine();
                writer.write(capitalizeWords(data));
                writer.write("\n");
            }
            System.out.print("\n");

            System.out.println("Стихотворение обработано");

            writer.close();
            reader.close();


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Произошла ошибка ввода/вывода");
            e.printStackTrace();
        }

    }

    static String capitalizeWords(String str) {
        if (str.isEmpty()) return "";

        String[] words = str.split("\\s");
        StringBuilder capitalizeWord = new StringBuilder();

        for(String w:words){
            String first = w.substring(0,1);
            String others = w.substring(1);
            capitalizeWord.append(first.toUpperCase()).append(others).append(" ");
        }

        return capitalizeWord.toString().trim();
    }
}
