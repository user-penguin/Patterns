package model.factoryMethod;

import model.bake.ElectroBake;
import model.bake.Bake;

public class ElectroBakeFactory extends BakeFactory {
    @Override
    public Bake CreateBake() {
        return new ElectroBake();
    }
}
