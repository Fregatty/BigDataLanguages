package src.lab3_4;

import java.util.HashMap;

public class Bill {
    public HashMap<Integer, Service> activeServices = new HashMap<>();
    public int sum;

    public void addService(int id, Service service){
        activeServices.put(id, service);
        sum += service.price;
    }
    public void removeService(int id){
        sum -= activeServices.get(id).price;
        activeServices.remove(id);
    }

    public int getSum() {
        return sum;
    }
}
