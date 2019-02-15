package model.factory_method;

import model.Car;
import model.SUV;
import model.car_component.Differential;
import model.decorator.BaseTransmission;
import model.decorator.DefaultTransmission;
import model.decorator.DiffExister;
import model.decorator.DiffTurnOner;

public class SUVFactory extends CarFactory {
    @Override
    public Car createCar() {
        SUV suv = new SUV();
        BaseTransmission customingTransmission = new DiffExister(new DiffTurnOner(new DefaultTransmission(suv)));
        customingTransmission.setReartDiff(new Differential());
        customingTransmission.setCentralDiff(new Differential());
        customingTransmission.setFrontDiff(new Differential());
        return new SUV();
    }
}
