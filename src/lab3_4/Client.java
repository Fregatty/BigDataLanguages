package src.lab3_4;

public class Client {
    public boolean status = true;
    public int number;
    public int balance = 0;
    public Bill bill = new Bill();

    public Client(int number){
        this.number = number;
    }

    public void switchStatus(){
        status = !status;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void pay(int sum){
        balance += sum;
    }

    public int getBalance() {
        return balance;
    }

    public boolean checkBalance(){
        if (balance >= bill.sum){
            balance -= bill.sum;
            status = true;
        }
        else {
            status = false;
        }
        return status;
    }
}
