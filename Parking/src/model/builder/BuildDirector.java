package model.builder;

import model.SUV;
import model.Sedan;

public class BuildDirector {
    public SUV makeSUV(SUVBuilder suvBuilder) {
        suvBuilder.reset();
        suvBuilder.setGearbox();
        suvBuilder.setWheel();
        return suvBuilder.getResult();
    }

    public Sedan makeSedan(SedanBuilder sedanBuilder) {
        sedanBuilder.reset();
        sedanBuilder.setGearbox();
        sedanBuilder.setWheel();
        return sedanBuilder.getResult();
    }
}
