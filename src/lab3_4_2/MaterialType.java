package src.lab3_4_2;

public enum MaterialType {
    BASIC(100),
    ADVANCED(1000),
    EXCQUISITE(10000);


    private int cost;

    MaterialType(int cost){
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
