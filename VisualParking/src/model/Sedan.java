package model;

import model.car_component.Differential;
import model.car_component.Gearbox;
import model.car_component.SecurityComplex;
import model.car_component.Wheel;
import model.observer.SmartDevice;

public class Sedan implements Car {
    private Differential frontDifferential;
    private Differential centralDifferential;
    private Differential rearDifferential;
    private ControlSystem controlSystem;
    private Wheel[] wheels;
    private Gearbox gearbox;
    private SecurityComplex securityComplex;

    public Sedan() {
        frontDifferential = new Differential();
        centralDifferential = new Differential();
        rearDifferential = new Differential();
        controlSystem = new ControlSystem();
    }

    // полный контсруктор для билдера
    public Sedan(Differential frDiff, Differential cenDiff, Differential rrDiff, ControlSystem controlSystems,
                 Wheel[] wheels, Gearbox gearbox, SecurityComplex security) {
        this.frontDifferential = frDiff;
        this.centralDifferential = cenDiff;
        this.rearDifferential = rrDiff;
        this.controlSystem = controlSystems;
        this.wheels = wheels;
        this.gearbox = gearbox;
        this.securityComplex = security;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }

    public void setGearbox(Gearbox gearbox) {
        this.gearbox = gearbox;
    }

    @Override
    public void startEngine() {
        controlSystem.startEngine();
    }

    @Override
    public void stopEngine() {
        controlSystem.stopEngine();
    }

    @Override
    public void lightsOn() {
        controlSystem.flashlightTurnOn();
    }

    @Override
    public void lightsOff() {
        controlSystem.flashlightTurnOff();
    }

    @Override
    public void setFrontDifferential(Differential differential) {
        this.frontDifferential = differential;
    }

    @Override
    public void setCentralDifferential(Differential differential) {
        this.centralDifferential = differential;
    }

    @Override
    public void setRearDifferential(Differential differential) {
        this.rearDifferential = differential;
    }

    @Override
    public Differential getFrontDifferential() {
        return frontDifferential;
    }

    @Override
    public Differential getCentralDifferential() {
        return centralDifferential;
    }

    @Override
    public Differential getRearDifferential() {
        return rearDifferential;
    }

    @Override
    public void subscribe(SmartDevice smartDevice) {

    }

    @Override
    public void unsubscribe(SmartDevice smartDevice) {

    }

    @Override
    public void notifySubscribers() {

    }
}
