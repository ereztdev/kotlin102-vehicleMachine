package com.et.vehiclemachine.parts

import com.et.vehiclemachine.parts.seat.Seat

class Chassis(
    val type: Type,
    seatFactory: Seat.factory
) : Part {
    val seats: List<Seat> = listOf(
        seatFactory.createSeat(),
        seatFactory.createSeat(),
        seatFactory.createSeat(),
        seatFactory.createSeat(),
    )
    override val price: Int
        get() = when (this.type) {
            Type.SEDAN -> 2500
            Type.PICKUP -> 1750
            Type.SUV -> 4000
            Type.VAN -> 4500
        }
    override val totalCost: Int
        get() = price + seats.sumOf { it.totalCost }

    enum class Type { VAN, SEDAN, SUV, PICKUP }
}