package model.factory_method;

import model.Sedan;
import model.car_component.Differential;
import model.decorator.BaseTransmission;
import model.decorator.DefaultTransmission;
import model.decorator.DiffExister;
import model.decorator.DiffTurnOner;

import static org.junit.Assert.*;

public class SedanFactoryTest {

    @org.junit.Test
    public void createCar() {
        Sedan sedan = new Sedan();
        BaseTransmission customingTransmission = new DiffExister(new DiffTurnOner(new DefaultTransmission(sedan)));
        customingTransmission.setReartDiff(new Differential());
        System.out.println("That's all");
    }
}