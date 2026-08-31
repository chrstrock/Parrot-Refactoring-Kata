package parrot;

public class AfricanParrot extends Parrot {
    protected int numberOfCoconuts;
    protected final double loadFactor = 9.0;

    protected AfricanParrot(int numberOfCoconuts) {
        super();
        this.numberOfCoconuts = numberOfCoconuts;
    }

    @Override
    public double getSpeed() {
        return Math.max(0, getBaseSpeed() - loadFactor * numberOfCoconuts);
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }
}
