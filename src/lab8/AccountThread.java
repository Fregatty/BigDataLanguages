package src.lab8;

import java.util.Objects;

public class AccountThread implements Runnable{
    final Account res;
    String action;
    long amount;
    AccountThread(Account res, String action, long amount){
        this.res = res;
        this.action = action;
        this.amount = amount;
    }

    @Override
    public void run() {
        synchronized (res) {
            System.out.println(Thread.currentThread().getName());
            if (Objects.equals(action, "withdraw")) {
                try {
                    res.withdraw(amount);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            else if (Objects.equals(action, "add")){
                res.add(amount);
            }
        }
    }
}
