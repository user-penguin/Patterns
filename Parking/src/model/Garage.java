/* Синглтон */
package model;

import java.util.ArrayList;

public final class Garage {
    private static Garage instance;
    // машины в гараже
    public ArrayList<Car> cars;
    // приватный конструктор
    private Garage() {
        instance = new Garage();
        this.cars = new ArrayList<>();
    }

    public Garage getInstance() {
        if (instance == null) {
            instance = new Garage();
        }
        return instance;
    }
}
