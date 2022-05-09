package src.lab9_1;

import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        // 2. Задана коллекция строк.
        // Вернуть первый элемент коллекции, а также существуют ли все совпадения с шаблоном.
        // Шаблон можно выбрать произвольно.
        List<String> strings = Arrays.asList("String 1", "String 2", "Str");
        String str = strings.stream().findFirst().orElse(" ");
        boolean isAll = strings.stream().allMatch((s) -> s.contains("Str"));
        System.out.println(str + " " + isAll);

        //3. Задана коллекция чисел. Вернуть сумму нечетных чисел.
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        Integer sumOdd = list.stream().filter(o -> o % 2 != 0).reduce(Integer::sum).orElse(0);
        System.out.println(sumOdd);
    }
}
