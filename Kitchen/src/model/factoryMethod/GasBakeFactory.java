package model.factoryMethod;

import model.bake.GasBake;
import model.bake.Bake;

public class GasBakeFactory extends BakeFactory {
    @Override
    public Bake CreateBake() {
        return new GasBake();
    }
}
