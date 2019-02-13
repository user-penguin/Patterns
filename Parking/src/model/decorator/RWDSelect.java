package model.decorator;

import model.Car;
import model.car_component.Differential;

public class RWDSelect extends BaseSuperSelect {
    RWDSelect(SuperSelect superSelect) {
        super(superSelect);
    }

    @Override
    public Car transformDifferential(Car car) {
        car.setFrontDifferential(new Differential(false, false, false));
        car.setCentralDifferential(new Differential(false, false, false));
        car.setRearDifferential(new Differential(true, true, false));
        return car;
    }
}
