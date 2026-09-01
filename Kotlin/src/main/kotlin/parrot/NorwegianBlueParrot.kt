package parrot

class NorwegianBlueParrot : Parrot {
    constructor(numberOfCoconuts: Int, voltage: Double, isNailed: Boolean) : super(
        type = ParrotTypeEnum.NORWEGIAN_BLUE,
        numberOfCoconuts,
        voltage,
        isNailed
    )

    override val speed: Double = if (isNailed) 0.0 else getBaseSpeed(voltage)
    override val cry: String =
        if (voltage > 0) "Bzzzzzz"
        else "..."
}