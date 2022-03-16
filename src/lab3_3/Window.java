package src.lab3_3;

import java.util.Objects;

public class Window {
    int glassesCount;

    public Window(int glassesCount){
        this.glassesCount = glassesCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return glassesCount == window.glassesCount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(glassesCount);
    }
}
