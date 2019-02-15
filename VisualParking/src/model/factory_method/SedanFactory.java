package model.factory_method;

import model.Car;
import model.Sedan;
import model.car_component.Differential;
import model.decorator.BaseTransmission;
import model.decorator.DefaultTransmission;
import model.decorator.DiffExister;
import model.decorator.DiffTurnOner;

public class SedanFactory extends CarFactory {
    @Override
    public Car createCar() {
        Sedan sedan = new Sedan();
        BaseTransmission customingTransmission = new DiffExister(new DiffTurnOner(new DefaultTransmission(sedan)));
        customingTransmission.setReartDiff(new Differential());
        return sedan;
    }
}
