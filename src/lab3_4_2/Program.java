package src.lab3_4_2;

public class Program {
    public static void main(String[] args) {
        Specification specification = new Specification(5, MaterialType.ADVANCED);
        Client client = new Client(specification, 500000);
        createBill(client);
        Project project = createProject(specification);
    }

    public static void createBill(Client client){
        int designing_cost = client.spec.house.floor_count * client.spec.house.material.getCost();
        int building_cost = designing_cost * 2;
        Bill bill = new Bill(building_cost, designing_cost);
        client.setBill(bill);
    }

    public static Project createProject(Specification spec){
        int persons_number = spec.house.floor_count;
        Brigade brigade = new Brigade(persons_number);
        return new Project(spec, brigade);
    }
}
