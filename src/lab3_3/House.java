package src.lab3_3;

import java.util.Arrays;

public class House {
    Door[] doors = new Door[2];
    Window[] windows = new Window[3];

    public House(){
        for (int i = 0; i < 2; i++){
            doors[i] = new Door();
        }
        for (int i = 0; i < 3; i++){
            windows[i] = new Window(i);
        }
    }

    public void getDoorsCount(){
        System.out.println("Количество дверей: " + doors.length);
    }

    public void getWindowsCount(){
        System.out.println("Количество окон: " + windows.length);
    }

    public void closeDoors(){
        System.out.println("Закрываем все двери...");
        Arrays.stream(doors).filter(c -> c.state == DoorState.OPEN).forEach(Door::useKey);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return Arrays.equals(doors, house.doors) && Arrays.equals(windows, house.windows);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(doors);
        result = 31 * result + Arrays.hashCode(windows);
        return result;
    }
}
