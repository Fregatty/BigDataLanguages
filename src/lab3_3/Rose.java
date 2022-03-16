package src.lab3_3;

import java.util.Objects;

public class Rose {
    Bud bud;
    FlowerState state = FlowerState.GROWING;

    public Rose(String color){
        bud = new Bud(color);
    }

    public void bloom(){
        this.state = FlowerState.BLOOM;
    }

    public void wither(){
        state = FlowerState.WITHER;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rose rose = (Rose) o;
        return bud.equals(rose.bud) && state == rose.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bud, state);
    }

    @Override
    public String toString() {
        return "Rose{" +
                "bud=" + bud +
                ", state=" + state +
                '}';
    }

    public void printColor(){
        System.out.println(bud.color);
    }
}
