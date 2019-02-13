package model.decortor;

import model.Car;
import model.car_component.Differential;

public class LockCentralSelect extends BaseSuperSelect {
    LockCentralSelect(SuperSelect superSelect) {
        super(superSelect);
    }

    @Override
    public Car transformDifferential(Car car) {
        car.setCentralDifferential(new Differential(true, true, true));
        return car;
    }
}
