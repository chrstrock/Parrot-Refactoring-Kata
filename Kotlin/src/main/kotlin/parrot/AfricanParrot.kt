package parrot

class AfricanParrot : Parrot{
    constructor(numberOfCoconuts: Int, voltage: Double, isNailed: Boolean) : super(
        type = ParrotTypeEnum.AFRICAN,
        numberOfCoconuts,
        voltage,
        isNailed
    )
}