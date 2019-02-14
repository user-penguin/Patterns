package model.builder;

import model.ControlSystem;
import model.Sedan;
import model.car_component.Differential;
import model.car_component.Gearbox;
import model.car_component.SecurityComplex;
import model.car_component.Wheel;

public class FWDSedanBuilder implements CarBuilder {
    private Differential frontDifferential;
    private Differential centralDifferential;
    private Differential rearDifferential;
    private ControlSystem controlSystem;
    private Wheel[] wheels;
    private Gearbox gearbox;
    private SecurityComplex securityComplex;

    @Override
    public void setFrontDiff() {
        this.frontDifferential = new Differential(true, true, false);
    }

    @Override
    public void setCentralDiff() {
        this.centralDifferential = new Differential(false, false, false);
    }

    @Override
    public void setRearDiff() {
        this.rearDifferential = new Differential(false, false, false);
    }

    @Override
    public void setControlSystem() {
        this.controlSystem = new ControlSystem();
    }

    @Override
    public void setGearbox() {
        this.gearbox = new Gearbox(6);
    }

    @Override
    public void setWheel() {
        Wheel[] wheels = new Wheel[4];
        for (Wheel wheel: wheels) {
            wheel.profile = 45;
            wheel.radius = 17;
            wheel.width = 225;
        }
        this.wheels = wheels;
    }

    @Override
    public void setSecurityComplex() {
        this.securityComplex = new SecurityComplex();
    }

    public Sedan getResult() {
        return new Sedan(frontDifferential, centralDifferential, rearDifferential, controlSystem, wheels,
                gearbox, securityComplex);
    }
}
