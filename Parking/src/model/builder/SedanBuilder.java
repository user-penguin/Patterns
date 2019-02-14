package model.builder;

import model.Sedan;
import model.car_component.Gearbox;
import model.car_component.Wheel;
import model.factory_method.SedanFactory;

public class SedanBuilder implements CarBuilder {
    private Sedan result;
    @Override
    public void reset() {
        result = new Sedan();
    }

    @Override
    public void setGearbox() {
        result.setGearbox(new Gearbox(6));
    }

    @Override
    public void setWheel() {
        Wheel[] wheels = new Wheel[4];
        for (Wheel wheel: wheels) {
            wheel.radius = 17;
            wheel.profile = 60;
            wheel.width = 225;
        }
        this.result.setWheels(wheels);
    }

    public Sedan getResult() {
        return this.result;
    }
}
