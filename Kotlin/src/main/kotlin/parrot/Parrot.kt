package parrot

import kotlin.math.min

abstract class Parrot {

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

    abstract val cry: String
    abstract val speed: Double
}
