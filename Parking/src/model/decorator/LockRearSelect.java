package model.decorator;

import model.Car;
import model.car_component.Differential;

public class LockRearSelect extends BaseSuperSelect {
    LockRearSelect(SuperSelect superSelect) {
        super(superSelect);
    }

    @Override
    public Car transformDifferential(Car car) {
        car.setRearDifferential(new Differential(true, true, true));
        return car;
    }
}
