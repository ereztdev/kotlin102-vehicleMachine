package com.et.vehiclemachine.parts

class WheelBase(
    val size: Size,
    val chassis: Chasis
) : Part {
    val chasis: Chasis = Chasis()
    val wheels: List<Wheel> = listOf(
        Wheel(), Wheel(), Wheel(), Wheel()
    )
    
    override val price: Int
        get() = when(this.size) {
            Size.LARGE -> 15250
            Size.MEDIUM -> 9750
            Size.SMALL -> 5250
        }

    enum class Size { SMALL, MEDIUM, LARGE }
}