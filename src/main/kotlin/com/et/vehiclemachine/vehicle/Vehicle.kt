package com.et.vehiclemachine.vehicle

import com.et.vehiclemachine.parts.Engine
import com.et.vehiclemachine.parts.WheelBase

class Vehicle {
    val wheelBase: WheelBase = WheelBase()
    val engine: Engine = Engine()

    val price: Int
        get() {
            var cost = 0
            cost += wheelBase.price
            cost += wheelBase.chasis.price
            cost += wheelBase.wheels.sumOf { it.price }
            cost += wheelBase.chasis.seats.sumOf { it.price }
            cost += engine.price
            cost += engine.transmission.price

            return cost
        }
}