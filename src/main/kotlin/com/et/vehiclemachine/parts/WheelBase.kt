package com.et.vehiclemachine.parts

import com.et.vehiclemachine.parts.wheel.Wheel
import com.et.vehiclemachine.parts.wheel.WheelFactory

class WheelBase(
    val size: Size,
    val chassis: Chassis,
    wheelFactory: WheelFactory
) : Part {
    val wheels: List<Wheel> = listOf(
        wheelFactory.createWheel(),
        wheelFactory.createWheel(),
        wheelFactory.createWheel(),
        wheelFactory.createWheel(),
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