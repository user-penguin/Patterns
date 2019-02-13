package model.decortor;

import model.Car;
import model.car_component.Differential;

public class FWDSelect extends BaseSuperSelect {
    FWDSelect(SuperSelect superSelect) {
        super(superSelect);
    }

    @Override
    public Car transformDifferential(Car car) {
        car.setFrontDifferential(new Differential(true, true, false));
        car.setCentralDifferential(new Differential(false, false, false));
        car.setRearDifferential(new Differential(false, false, false));
        return car;
    }
}
