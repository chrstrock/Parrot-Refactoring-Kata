package parrot

class EuropeanParrot : Parrot {
    constructor(numberOfCoconuts: Int, voltage:Double, isNailed: Boolean) :
            super(type = ParrotTypeEnum.EUROPEAN,
                numberOfCoconuts = numberOfCoconuts,
                isNailed = isNailed
                    ){
                this.voltage = voltage
            }

    private var voltage: Double
    override val speed: Double = baseSpeed
    override val cry: String = "Sqoork!"
}
