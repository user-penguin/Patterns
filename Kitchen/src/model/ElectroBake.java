package model;

public class ElectroBake implements IBake {
    private boolean Cell1;
    private boolean Cell2;
    private boolean Cell3;
    private boolean Cell4;

    public ElectroBake() {
        this.Cell1 = false;
        this.Cell2 = false;
        this.Cell3 = false;
        this.Cell4 = false;
    }
    @Override
    public void turnOnFirstCell() {
        this.Cell1 = true;
    }

    @Override
    public void turnOnSecondCell() {
        this.Cell2 = true;
    }

    @Override
    public void turnOnFThirdCell() {
        this.Cell3 = true;
    }

    @Override
    public void turnOnFourthCell() {
        this.Cell4 = true;
    }

    @Override
    public void turnOffFirstCell() {
        this.Cell1 = false;
    }

    @Override
    public void turnOffSecondCell() {
        this.Cell2 = false;
    }

    @Override
    public void turnOffFThirdCell() {
        this.Cell3 = false;
    }

    @Override
    public void turnOffFourthCell() {
        this.Cell4 = false;
    }
}
