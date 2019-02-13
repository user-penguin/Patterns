package model.decorator;

import model.Car;
import model.car_component.Differential;

public class UnlockCentralSelect extends BaseSuperSelect {
    UnlockCentralSelect(SuperSelect superSelect) {
        super(superSelect);
    }

    @Override
    public Car transformDifferential(Car car) {
        car.setCentralDifferential(new Differential(true, true, false));
        return car;
    }
}
