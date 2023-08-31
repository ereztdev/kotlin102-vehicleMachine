package com.et.vehiclemachine.parts

class WheelBase(
    val size: Size,
    val chassis: Chassis
) : Part {
    val wheels: List<Wheel> = listOf(
        Wheel(), Wheel(), Wheel(), Wheel()
    )
    
    override val price: Int
        get() = when(this.size) {
            Size.LARGE -> 15250
            Size.MEDIUM -> 9750
            Size.SMALL -> 5250
        }
    override val totalCost: Int
        get() = price + wheels.sumOf { it.totalCost } + chassis.totalCost

    enum class Size { SMALL, MEDIUM, LARGE }
}