package src.lab1;
import java.util.Objects;
import java.util.Scanner;

// Номер в списке - 16
// Задание 4 и 5


public class Program {
    public static String sample_password = "abcd1234";

    public static void main(String[] args) {
        System.out.println("Введите пароль:");
        Scanner console = new Scanner(System.in);
        String password = console.nextLine();
        if (Objects.equals(password, sample_password)) {
            System.out.println("Пароли совпадают");
        }
        else {
            System.out.println("Пароли не совпадают");
        }

        int sum = 0;
        int mul = 1;

        System.out.println("Аргументы командной строки:");
        for (String arg : args) {
            sum += Integer.parseInt(arg);
            mul *= Integer.parseInt(arg);
            System.out.print(arg + ' ');
            System.out.println();
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + mul);
    }
}
