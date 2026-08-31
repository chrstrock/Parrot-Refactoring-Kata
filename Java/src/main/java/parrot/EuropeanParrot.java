package parrot;

public class EuropeanParrot extends Parrot {

    protected boolean isNailed;

    public EuropeanParrot() {
        super();
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
