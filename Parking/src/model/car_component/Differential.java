package model.car_component;

public class Differential {
    boolean isExist;
    boolean isTurnedOn;
    boolean isLocked;

    public Differential(boolean isExist, boolean isTurnedOn, boolean isLocked) {
        this.isExist = isExist;
        this.isTurnedOn = isTurnedOn;
        this.isLocked = isLocked;
    }
}
