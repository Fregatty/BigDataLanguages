package src.lab5_4;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) throws Exception {
        try {

            Path inputPath = Paths.get("src/lab5_4/data/Prog.java");

            List<String> strings = Files.readAllLines(inputPath, StandardCharsets.UTF_8);
            ArrayList<String> outList = new ArrayList<>();

            for (String s : strings) {
                String changed = s.trim().replaceAll(" +", " ");
                outList.add(changed);
            }

            Files.createDirectories(Paths.get("src/lab5_4/output"));
            Path outPath = Paths.get("src/lab5_4/output/Hello_linted.txt");

            Files.write(outPath, outList, StandardCharsets.UTF_8);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Произошла ошибка I/O");
            e.printStackTrace();
        }

        try {
            Path inputPath = Paths.get("src/lab5_4/data/Prog.java");

            List<String> strings = Files.readAllLines(inputPath, StandardCharsets.UTF_8);
            ArrayList<String> outList = new ArrayList<>();
            Stream<String> stream = Files.lines(inputPath);
            stream.forEach(line -> deleteWords(line, outList));

            Files.createDirectories(Paths.get("src/lab5_4/output"));
            Path outPath = Paths.get("src/lab5_4/output/Hello_trimmed.txt");

            Files.write(outPath, outList, StandardCharsets.UTF_8);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Произошла ошибка I/O");
            e.printStackTrace();
        }
    }

    static void deleteWords(String str, ArrayList<String> outList) {
        int deleted = 0;
        int max_deleted = 0;
        str = str.trim().replaceAll(" +", " ");

        String result = "";

        String[] words = str.split("\\s");

        if (words.length % 2 == 0) {
            max_deleted = words.length;
        }
        else {
            max_deleted = words.length - 1;
        }

        for(String w:words){
            if (deleted == max_deleted) break;
            if (w.length() >= 3 && w.length() <= 5) {
                deleted += 1;
            }
            else {
                result = result.concat(w + ' ');
            }
        }
        outList.add(result);
    }
}
