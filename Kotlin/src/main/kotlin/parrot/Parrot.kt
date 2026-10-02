package parrot

abstract class Parrot {

    protected val type: ParrotTypeEnum
    protected val numberOfCoconuts: Int
    protected val isNailed: Boolean

    constructor(type: ParrotTypeEnum, numberOfCoconuts: Int, isNailed: Boolean) {
        this.type = type
        this.numberOfCoconuts = numberOfCoconuts
        this.isNailed = isNailed
    }

    protected val baseSpeed: Double
        get() = 12.0

    abstract val cry: String
    abstract val speed: Double
}
