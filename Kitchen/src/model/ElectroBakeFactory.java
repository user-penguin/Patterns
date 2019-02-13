package model;

public class ElectroBakeFactory extends BakeFactory {
    @Override
    public IBake CreateBake() {
        return new ElectroBake();
    }
}
