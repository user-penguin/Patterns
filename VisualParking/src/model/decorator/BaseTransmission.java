package model.decorator;

import model.car_component.Differential;

public class BaseTransmission implements TransmissionSelect {
    TransmissionSelect wrappee;

    public BaseTransmission(TransmissionSelect transmissionSelect) {
        this.wrappee = transmissionSelect;
    }
    @Override
    public void setFrontDiff(Differential differential) {
        wrappee.setFrontDiff(differential);
    }

    @Override
    public void setCentralDiff(Differential differential) {
        wrappee.setCentralDiff(differential);
    }

    @Override
    public void setReartDiff(Differential differential) {
        wrappee.setReartDiff(differential);
    }
}
