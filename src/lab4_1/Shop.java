package src.lab4_1;

import java.util.ArrayList;

public class Shop {
    ArrayList<Aisle> aisles = new ArrayList<Aisle>();

    public void addAisle(String department, String product, String service){
        aisles.add(new Aisle(department, product, service));
    }

    public class Aisle {
        String department;
        String product;
        String service;

        public Aisle(String department, String product, String service){
            this.department = department;
            this.product = product;
            this.service = service;
        }
    }

}
