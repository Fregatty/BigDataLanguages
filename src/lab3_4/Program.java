package src.lab3_4;

import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        HashMap<Integer, Service> services = new HashMap<>();

        services.put(0, new Service(10, "Кабельное ТВ"));
        services.put(1, new Service(20, "Белый IP"));
        services.put(2, new Service(30, "Выделенный канал"));

        Client client1 = new Client(1234);
        Client client2 = new Client(5678);

        client1.bill.addService(0, services.get(0));
        client1.bill.addService(1, services.get(1));
        client2.bill.addService(1, services.get(1));
        client2.bill.addService(2, services.get(2));

        client1.pay(20);
        client2.pay(40);

        removeClientService(client1, 1);
        changeNumber(client2, 91011);

        System.out.println(client1.checkBalance());
        System.out.println(client2.checkBalance());

    }

    public static void changeNumber(Client client, int number){
        client.setNumber(number);
    }

    public static void removeClientService(Client client, int id){
        client.bill.removeService(id);
    }
}
