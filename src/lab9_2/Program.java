package src.lab9_2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        // 2. Задана коллекция
        // Отсортировать по имени в обратном алфавитном порядке.
        Collection<People> peoples = Arrays.asList(
                new People("Ivan", 16),
                new People("Petr", 23),
                new People("Maria", 42)
        );
        List<People> list = peoples.stream().sorted(Comparator.comparing(People::getName, Comparator.reverseOrder())).toList();
        System.out.println(list);

        // 3. Коллекция из 2 задания. Отсортировать по возрасту.
        List<People> listAge = peoples.stream().sorted(Comparator.comparingInt(People::getAge)).toList();
        System.out.println(listAge);
    }
}
