package model.factory_method;

import model.Car;
import model.SUV;
import model.factory_method.CarFactory;

public class SUVFactory extends CarFactory {
    @Override
    Car createCar() {
        return new SUV();
    }
}
