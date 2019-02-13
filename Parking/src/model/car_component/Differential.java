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

    public Differential() {
        this.isExist = false;
        this.isTurnedOn = false;
        this.isLocked = false;
    }

    public void install() {
        this.isExist = true;
    }

    public void uninstall() {
        this.isExist = false;
    }

    public void lock() {
        this.isLocked = true;
    }

    public void unlock() {
        this.isLocked = false;
    }

    public void turnOn() {
        this.isTurnedOn = true;
    }

    public void turnOff() {
        this.isTurnedOn = false;
    }
}
