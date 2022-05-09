package src.lab8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Program2 {
    public static void main(String[] args) {
        // 1. Реализовать многопоточное приложение “Банк”. Имеется банковский счет.
        // Сделать синхронным пополнение и снятие денежных средств на счет/со счет случайной суммой.
        // При каждой операции (пополнения или снятие) вывести текущий баланс счета.
        // В том случае, если денежных средств недостаточно – вывести сообщение.

        Random rand = new Random();
        List<String> actions = Arrays.asList("withdraw", "add");

        Account account = new Account(2000);
        for (int i = 0; i < 5; i++){
            String action = actions.get(rand.nextInt(actions.size()));
            long amount = rand.nextInt(3000);
            Thread t;
            t = new Thread(new AccountThread(account, action, amount));
            t.setName("Поток " + i);
            t.start();
        }
    }
}
