package model.decorator;

import model.car_component.Differential;

public class DiffLocker extends BaseTransmission {
    public DiffLocker(TransmissionSelect transmissionSelect) {
        super(transmissionSelect);
    }

    @Override
    public void setFrontDiff(Differential differential) {
        differential.lock();
        super.setFrontDiff(differential);
    }

    @Override
    public void setCentralDiff(Differential differential) {
        differential.lock();
        super.setCentralDiff(differential);
    }

    @Override
    public void setReartDiff(Differential differential) {
        differential.lock();
        super.setReartDiff(differential);
    }
}
