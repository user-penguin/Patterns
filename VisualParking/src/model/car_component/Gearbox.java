package model.car_component;

public class Gearbox {
    public int currentGear;
    public int countOfGear;

    public Gearbox(int countOfGear) {
        this.countOfGear = countOfGear;
        this.currentGear = 0;
    }
}
