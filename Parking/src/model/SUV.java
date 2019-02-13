package model;

import model.car_component.Differential;

public class SUV implements Car {
    private Differential frontDifferential;
    private Differential centralDifferential;
    private Differential rearDifferential;

    SUV() {
        frontDifferential = new Differential(true, true, false);
        centralDifferential = new Differential(true, true, false);
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
/*
[]         []
[]----X----[]
[]    |    []
      |
      0
      |
      |
[]    |    []
[]----X----[]
[]         []
*/