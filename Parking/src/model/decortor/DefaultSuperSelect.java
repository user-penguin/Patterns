package model.decortor;

import model.Car;
import model.car_component.Differential;

public class DefaultSuperSelect implements SuperSelect {
    @Override
    public Car transformDifferential(Car car) {
        return car;
    }
}
