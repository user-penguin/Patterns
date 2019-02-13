package model.decorator;

import model.car_component.Differential;

public class DiffExister extends BaseTransmission {
    public DiffExister(TransmissionSelect transmissionSelect) {
        super(transmissionSelect);
    }

    @Override
    public void setFrontDiff(Differential differential) {
        differential.install();
        super.setFrontDiff(differential);
    }

    @Override
    public void setCentralDiff(Differential differential) {
        differential.install();
        super.setCentralDiff(differential);
    }

    @Override
    public void setReartDiff(Differential differential) {
        differential.install();
        super.setReartDiff(differential);
    }
}
