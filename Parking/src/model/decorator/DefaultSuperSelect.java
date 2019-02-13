package model.decorator;

import model.Car;

public class DefaultSuperSelect implements SuperSelect {
    @Override
    public Car transformDifferential(Car car) {
        return car;
    }
}
