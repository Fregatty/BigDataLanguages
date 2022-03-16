package src.lab3_4_2;

public class Client {
    Specification spec;
    int balance;
    Bill bill;

    public Client(Specification spec, int balance){
        this.spec = spec;
        this.balance = balance;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
