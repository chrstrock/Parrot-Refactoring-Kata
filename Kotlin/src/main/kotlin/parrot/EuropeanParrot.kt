package parrot

class EuropeanParrot : Parrot {
    constructor(numberOfCoconuts: Int, voltage: Double, isNailed: Boolean) :
            super(type = ParrotTypeEnum.EUROPEAN,
                numberOfCoconuts = numberOfCoconuts,
                voltage = voltage,
                isNailed = isNailed
                    )
    override val speed: Double = baseSpeed
    override val cry: String = "Sqoork!"
}
