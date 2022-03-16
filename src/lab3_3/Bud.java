package src.lab3_3;

import java.util.Objects;

public class Bud {
    public String color;

    public Petal[] petals;

    public Bud(String color) {
        this.color = color;
        petals = new Petal[5];

        for(int i = 0; i < 5; i++){
            petals[i] = new Petal();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bud bud = (Bud) o;
        return color.equals(bud.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Bud{" +
                "color='" + color + '\'' +
                '}';
    }
}
