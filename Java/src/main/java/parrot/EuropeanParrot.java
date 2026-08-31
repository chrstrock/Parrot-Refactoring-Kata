package parrot;

public class EuropeanParrot extends Parrot {

    public EuropeanParrot(boolean isNailed) {
        super(isNailed);
    }

    @Override
    public double getSpeed() {
        return getBaseSpeed();
    }

    @Override
    public String getCry() {
        return "Sqoork!";
    }
}
