package model.decorator;

import model.car_component.Differential;

public class DiffTurnOner extends BaseTransmission {
    public DiffTurnOner(TransmissionSelect transmissionSelect) {
        super(transmissionSelect);
    }

    @Override
    public void setFrontDiff(Differential differential) {
        differential.turnOn();
        super.setFrontDiff(differential);
    }

    @Override
    public void setCentralDiff(Differential differential) {
        differential.turnOn();
        super.setCentralDiff(differential);
    }

    @Override
    public void setReartDiff(Differential differential) {
        differential.turnOn();
        super.setReartDiff(differential);
    }
}
