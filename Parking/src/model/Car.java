package model;

import model.car_component.Differential;

public interface Car {
    public void startEngine();
    public void stopEngine();
    public void runAhead();
    public void stop();
    public void turnLeft();
    public void turnRight();
    // методы для работы с дифференциалами
    public void setFrontDifferential(Differential differential);
    public void setCentralDifferential(Differential differential);
    public void setRearDifferential(Differential differential);
}
