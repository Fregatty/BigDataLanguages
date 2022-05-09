package src.lab8;

public class Account {
    public long balance = 0;

    public Account(long balance) {
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    void add(long value) {
        System.out.println("Пополнение " + value);
        this.balance += value;
        System.out.println("Остаток: " + this.balance);
    }

    void withdraw(long value) {
        System.out.println("Списание: " + value);
        if (value > this.balance) {
            throw new IllegalArgumentException("Недостаточно средств");
        }
        this.balance -= value;
        System.out.println("Остаток: " + this.balance);
    }
}
