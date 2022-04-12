package src.lab6_1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class Program {
    public static void main(String[] args) throws Exception {
        try {
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(
                    Paths.get("src/lab6_1/data/input.txt"), StandardCharsets.UTF_8));
            System.out.println("List before sorting: \n" + lines);
            Collections.sort(lines);
            System.out.println("List after sorting: \n" + lines);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Произошла ошибка I/O");
            e.printStackTrace();
        }
    }
}
