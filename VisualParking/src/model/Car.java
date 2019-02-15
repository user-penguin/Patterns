package model;

import model.car_component.Differential;
import model.observer.SmartDevice;

public interface Car {
    public void startEngine();
    public void stopEngine();
    public void lightsOn();
    public void lightsOff();

    // методы для работы с дифференциалами
    public void setFrontDifferential(Differential differential);
    public void setCentralDifferential(Differential differential);
    public void setRearDifferential(Differential differential);

    public Differential getFrontDifferential();
    public Differential getCentralDifferential();
    public Differential getRearDifferential();

    // методы для наблюдателя
    public void subscribe(SmartDevice smartDevice);
    public void unsubscribe(SmartDevice smartDevice);
    public void notifySubscribers();
}
