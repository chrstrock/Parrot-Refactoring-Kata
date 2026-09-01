package parrot

import kotlin.math.max
import kotlin.math.min

open class Parrot {

    protected val type: ParrotTypeEnum
    protected val numberOfCoconuts: Int
    protected val voltage: Double
    protected val isNailed: Boolean

    constructor(type: ParrotTypeEnum, numberOfCoconuts: Int, voltage: Double, isNailed: Boolean) {
        this.type = type
        this.numberOfCoconuts = numberOfCoconuts
        this.voltage = voltage
        this.isNailed = isNailed
    }

    protected val loadFactor: Double
        get() = 9.0

    protected val baseSpeed: Double
        get() = 12.0

    protected fun getBaseSpeed(voltage: Double): Double = min(24.0, voltage * baseSpeed)

    val cry: String
        get() = when (type) {
            ParrotTypeEnum.EUROPEAN -> "Sqoork!"
            ParrotTypeEnum.AFRICAN -> "Sqaark!"
            ParrotTypeEnum.NORWEGIAN_BLUE ->
                if (voltage > 0) "Bzzzzzz"
                else "..."
        }
    val speed: Double
        get() = when (type) {
            ParrotTypeEnum.EUROPEAN -> baseSpeed
            ParrotTypeEnum.AFRICAN -> max(0.0, baseSpeed - loadFactor * numberOfCoconuts)
            ParrotTypeEnum.NORWEGIAN_BLUE -> if (isNailed) 0.0 else getBaseSpeed(voltage)
        }
}
