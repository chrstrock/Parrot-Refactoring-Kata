package parrot;

public enum ParrotTypeEnum {

    EUROPEAN,
    AFRICAN,
    NORWEGIAN_BLUE;

    public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        return switch (type) {
            case EUROPEAN -> new EuropeanParrot(isNailed);
            case AFRICAN -> new AfricanParrot(numberOfCoconuts, isNailed);
            case NORWEGIAN_BLUE -> new NorwegianBlueParrot(voltage, isNailed);
        };
    }
}
