package model.decortor;

import model.Car;
import model.car_component.Differential;

public class UnlockRearSelect extends BaseSuperSelect {
    UnlockRearSelect(SuperSelect superSelect) {
        super(superSelect);
    }

    @Override
    public Car transformDifferential(Car car) {
        car.setRearDifferential(new Differential(true, true, false));
        return car;
    }
}
