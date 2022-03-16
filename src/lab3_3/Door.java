package src.lab3_3;

import java.util.Objects;

public class Door {
    DoorState state = DoorState.OPEN;

    public void useKey(){
        if (state == DoorState.OPEN){
            state = DoorState.CLOSE;
        }
        else {
            state = DoorState.OPEN;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return state == door.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(state);
    }
}
