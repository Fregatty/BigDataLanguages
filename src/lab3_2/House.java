package src.lab3_2;

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

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRoom_count(int room_count) {
        this.room_count = room_count;
    }

    public void setSquare(int square) {
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
