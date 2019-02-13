package model;

import model.car_component.Differential;

public class Sedan implements Car {
    private Differential frontDifferential;
    private Differential centralDifferential;
    private Differential rearDifferential;

    Sedan() {
        frontDifferential = new Differential(false, false, false);
        centralDifferential = new Differential(true, true, true);
        rearDifferential = new Differential(true, true, false);
    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }

    @Override
    public void runAhead() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

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
}
