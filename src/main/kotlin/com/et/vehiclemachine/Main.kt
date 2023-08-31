package com.et.vehiclemachine

import com.et.vehiclemachine.parts.Chassis
import com.et.vehiclemachine.parts.Engine
import com.et.vehiclemachine.parts.Transmission
import com.et.vehiclemachine.parts.WheelBase
import com.et.vehiclemachine.vehicle.Vehicle


fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val v = Vehicle(
        WheelBase(
            WheelBase.Size.MEDIUM,
            Chassis(
                Chassis.Type.SEDAN
            )
        ),
        Engine(
            Engine.Type.PETROL,
            Transmission(Transmission.Type.AUTOMATIC)
        )
    )
    println("car cost is a base of ${v.price}")

}