package parrot

import kotlin.math.max

private const val LOAD_FACTOR = 9.0

class AfricanParrot : Parrot{
    constructor(numberOfCoconuts: Int, voltage: Double, isNailed: Boolean) : super(
        type = ParrotTypeEnum.AFRICAN,
        numberOfCoconuts,
        isNailed
    ){
        this.voltage = voltage
    }

    private var voltage: Double
    override val speed: Double = max(0.0, baseSpeed - LOAD_FACTOR * numberOfCoconuts)
    override val cry: String = "Sqaark!"
}