package model.decorator;

import model.car_component.Differential;

public interface TransmissionSelect {
    public void setFrontDiff(Differential differential);
    public void setCentralDiff(Differential differential);
    public void setReartDiff(Differential differential);
}
