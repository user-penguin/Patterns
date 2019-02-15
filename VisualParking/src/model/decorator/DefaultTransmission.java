package model.decorator;

import model.Car;
import model.car_component.Differential;

public class DefaultTransmission implements TransmissionSelect {
    private Car car;

    public DefaultTransmission(Car car) {
        this.car = car;
    }

    @Override
    public void setFrontDiff(Differential differential) {
        this.car.setFrontDifferential(differential);
    }

    @Override
    public void setCentralDiff(Differential differential) {
        this.car.setCentralDifferential(differential);
    }

    @Override
    public void setReartDiff(Differential differential) {
        this.car.setRearDifferential(differential);
    }
}
