package model;

public class BaseReostatDecorator implements Reostat {
    private Reostat wrappee;

    BaseReostatDecorator(Reostat reostat) {
        wrappee = reostat;
    }

    @Override
    public void setPower(int power) {

    }
}
