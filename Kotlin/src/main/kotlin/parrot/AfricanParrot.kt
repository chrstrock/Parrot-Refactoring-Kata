package parrot

import kotlin.math.max

class AfricanParrot : Parrot{
    constructor(numberOfCoconuts: Int, voltage: Double, isNailed: Boolean) : super(
        type = ParrotTypeEnum.AFRICAN,
        numberOfCoconuts,
        voltage,
        isNailed
    )
    override val speed: Double = max(0.0, baseSpeed - loadFactor * numberOfCoconuts)
    override val cry: String = "Sqaark!"
}