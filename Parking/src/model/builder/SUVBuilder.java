package model.builder;

import model.SUV;
import model.car_component.Gearbox;
import model.car_component.Wheel;

public class SUVBuilder implements CarBuilder {
    private SUV result;

    @Override
    public void reset() {
        this.result = new SUV();
    }

    @Override
    public void setGearbox() {
        this.result.setGearbox(new Gearbox(5));
    }

    @Override
    public void setWheel() {
        Wheel[] wheels = new Wheel[4];
        for (Wheel wheel: wheels) {
            wheel.width = 240;
            wheel.radius = 15;
            wheel.profile = 90;
        }
    }

    public SUV getResult() {
        return this.result;
    }
}
