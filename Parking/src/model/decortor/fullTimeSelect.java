// обёртка в фулл-тайм внедорожник с выключенными блокировками
package model.decortor;

import model.Car;
import model.car_component.Differential;

public class fullTimeSelect extends BaseSuperSelect {
    fullTimeSelect(SuperSelect superSelect) {
        super(superSelect);
    }

    @Override
    public Car transformDifferential(Car car) {
        car.setFrontDifferential(new Differential(true, true, false));
        car.setCentralDifferential(new Differential(true, true, false));
        car.setRearDifferential(new Differential(true, true, false));
        return car;
    }
}
