/* Синглтон */
package model;

public final class Garage {
    private static Garage instance;
    private Garage() {
        instance = new Garage();
    }

    public Garage getInstance() {
        if (instance == null) {
            instance = new Garage();
        }
        return instance;
    }
}
