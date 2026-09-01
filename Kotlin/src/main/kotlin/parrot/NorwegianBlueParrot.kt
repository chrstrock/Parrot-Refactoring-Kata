package parrot

class NorwegianBlueParrot : Parrot {
    constructor(numberOfCoconuts: Int, voltage: Double, isNailed: Boolean) : super(
        type = ParrotTypeEnum.NORWEGIAN_BLUE,
        numberOfCoconuts,
        voltage,
        isNailed
    )
}