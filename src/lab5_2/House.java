package src.lab5_2;

public class House {
    int id;
    int number;
    int square;
    int floor;
    int room_count;
    String street, building_type;
    int lifetime;

    public void setId(int id) {
        this.id = id;
    }

    public void setBuilding_type(String building_type) {
        this.building_type = building_type;
    }

    public void setFloor(int floor) throws Exception {
        if (floor <= 0) throw new Exception("Количество этажей должно быть не менее 1");
        this.floor = floor;
    }

    public void setLifetime(int lifetime) throws Exception {
        if (lifetime <= 0) throw new Exception("Время эксплуатации должно быть положительным");
        this.lifetime = lifetime;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRoom_count(int room_count) throws Exception {
        if (room_count <= 0) throw new Exception("Количество комнат должно быть положительным");
        this.room_count = room_count;
    }

    public void setSquare(int square) throws Exception {
        if (square <= 0) throw new Exception("Площадь должна быть положительной");
        this.square = square;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getId() {
        return id;
    }

    public double getSquare() {
        return square;
    }

    public int getFloor() {
        return floor;
    }

    public int getLifetime() {
        return lifetime;
    }

    public int getNumber() {
        return number;
    }

    public int getRoom_count() {
        return room_count;
    }

    public String getBuilding_type() {
        return building_type;
    }

    public String getStreet() {
        return street;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", number=" + number +
                ", square=" + square +
                ", floor=" + floor +
                ", room_count=" + room_count +
                ", street='" + street + '\'' +
                ", building_type='" + building_type + '\'' +
                ", lifetime=" + lifetime +
                '}';
    }
}
