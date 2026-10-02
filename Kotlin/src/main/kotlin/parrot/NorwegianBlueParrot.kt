package parrot

import kotlin.math.min

class NorwegianBlueParrot(numberOfCoconuts: Int, private var voltage: Double, isNailed: Boolean) : Parrot(
    type = ParrotTypeEnum.NORWEGIAN_BLUE,
    numberOfCoconuts,
    isNailed
) {


    override val speed: Double = if (isNailed) {
        0.0
    } else {
        min(24.0, this.voltage * baseSpeed)
    }
    override val cry: String =
        if (this.voltage > 0) "Bzzzzzz"
        else "..."

}