package parrot;

public class NorwegianBlueParrot extends Parrot {

    protected double voltage;

    public NorwegianBlueParrot(double voltage, boolean isNailed) {
        super(isNailed);
        this.voltage = voltage;
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }

    @Override
    public String getCry() {
        return voltage > 0 ? "Bzzzzzz" : "...";
    }
}
