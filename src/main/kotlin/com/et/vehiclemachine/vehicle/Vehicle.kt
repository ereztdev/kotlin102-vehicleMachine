package com.et.vehiclemachine.vehicle

import com.et.vehiclemachine.parts.Engine
import com.et.vehiclemachine.parts.WheelBase

class Vehicle(
    wheelBase: WheelBase,
    engine: Engine
) {
    val price = wheelBase.totalCost + engine.totalCost
}