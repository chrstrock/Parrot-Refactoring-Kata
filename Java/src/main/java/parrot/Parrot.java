package parrot;

public abstract class Parrot {

    protected final boolean isNailed;

    protected Parrot(boolean isNailed) {
        this.isNailed = isNailed;
    }

    public abstract double getSpeed();

    protected double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    protected double getLoadFactor() {
        return 9.0;
    }

    protected double getBaseSpeed() {
        return 12.0;
    }

    public abstract String getCry();
}
