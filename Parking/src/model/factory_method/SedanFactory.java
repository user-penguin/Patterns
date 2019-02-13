package model.factory_method;

import model.Car;
import model.Sedan;
import model.factory_method.CarFactory;

public class SedanFactory extends CarFactory {
    @Override
    Car createCar() {
        return new Sedan();
    }
}
