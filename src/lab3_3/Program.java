package src.lab3_3;

public class Program {
    public static void main(String[] args) {
        House house = new House();
        house.getDoorsCount();
        house.getWindowsCount();
        System.out.println("Состояние дверей: ");
        for (int i = 0; i < house.doors.length; i++){
            System.out.println(house.doors[i].state);
        }
        house.closeDoors();
        System.out.println("Состояние дверей: ");
        for (int i = 0; i < house.doors.length; i++){
            System.out.println(house.doors[i].state);
        }
    }
}
