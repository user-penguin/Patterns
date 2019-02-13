package model;

public class GasBakeFactory extends BakeFactory {
    @Override
    public IBake CreateBake() {
        return new GasBake();
    }
}
