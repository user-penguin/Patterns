package model.builder;

import model.SUV;
import model.Sedan;

public class BuildDirector {
    public SUV makeSUV(SUVBuilder suvBuilder) {
        suvBuilder.setFrontDiff();
        suvBuilder.setCentralDiff();
        suvBuilder.setRearDiff();
        suvBuilder.setControlSystem();
        suvBuilder.setSecurityComplex();
        suvBuilder.setGearbox();
        suvBuilder.setWheel();
        return suvBuilder.getResult();
    }

    public Sedan makeSedan(RWDSedanBuilder sedanBuilder) {
        sedanBuilder.setFrontDiff();
        sedanBuilder.setCentralDiff();
        sedanBuilder.setRearDiff();
        sedanBuilder.setSecurityComplex();
        sedanBuilder.setControlSystem();
        sedanBuilder.setGearbox();
        sedanBuilder.setWheel();
        return sedanBuilder.getResult();
    }
}
