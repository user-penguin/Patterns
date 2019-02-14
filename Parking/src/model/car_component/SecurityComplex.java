package model.car_component;

public class SecurityComplex {
    private int channel;
    private String secretCode;
    private boolean isOpened;

    public SecurityComplex() {
        this.channel = 1;
        this.secretCode = "abama";
        this.isOpened = false;
    }

    public boolean isEquals(String word1, String word2) {
        if (word1.compareTo(word2) == 0)
            return true;
        return false;
    }

    private void setSecretCode(String code) {
        this.secretCode = code;
    }

    private void setChannel(int channel) {
        this.channel = channel;
    }

    public boolean unlockCar(String code) {
        if (isEquals(code, this.secretCode)) {
            this.isOpened = true;
            return true;
        }
        return false;
    }

    public boolean changePass(String oldPass, String newPass) {
        if (isEquals(oldPass, this.secretCode)) {
            this.secretCode = newPass;
            return true;
        }
        return false;
    }

    public boolean changeChannel(String pass, int channel) {
        if (isEquals(pass, this.secretCode)) {
            this.channel = channel;
            return true;
        }
        return false;
    }
}
