package model;

public final class SingletonKitchen {
    private static SingletonKitchen instance;
    public int countOfBake;

    private SingletonKitchen(int countOfBake) {
        this.countOfBake = countOfBake;
    }

    public static SingletonKitchen getInstance(int countOfBake) {
        if (instance == null) {
            instance = new SingletonKitchen(countOfBake);
        }
        return instance;
    }
}
