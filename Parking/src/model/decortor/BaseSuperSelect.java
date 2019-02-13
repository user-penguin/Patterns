package model.decortor;

import model.Car;

public class BaseSuperSelect implements SuperSelect {
    private SuperSelect wrappee;

    BaseSuperSelect(SuperSelect superSelect) {
        wrappee = superSelect;
    }

    @Override
    public Car transformDifferential(Car car) {
        return wrappee.transformDifferential(car);
    }
}
