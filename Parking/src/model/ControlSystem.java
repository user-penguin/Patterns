// отдельный блок управления автомобилем
// для реализации паттерна делегирование

package model;

public class ControlSystem {
    private boolean isEngineStart;
    private boolean isFlashlightOn;

    public ControlSystem() {
        this.isEngineStart = false;
        this.isFlashlightOn = false;
    }

    public void startEngine() {
        this.isEngineStart = true;
    }

    public void stopEngine() {
        this.isEngineStart = false;
    }

    public void flashlightTurnOn() {
        this.isFlashlightOn = true;
    }

    public void flashlightTurnOff() {
        this.isFlashlightOn = false;
    }
}
