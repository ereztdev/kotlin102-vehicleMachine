package com.et.vehiclemachine.parts

class Chassis(val type: Type) : Part {
    override val price: Int
        get() = when (this.type) {
            Type.SEDAN -> 2500
            Type.PICKUP -> 1750
            Type.SUV -> 4000
            Type.VAN -> 4500
        }
    override val totalCost: Int
        get() = price + seats.sumOf { it.price }

    val seats: List<Seat> = listOf(
        Seat(), Seat(), Seat(), Seat(),
    )

    enum class Type { VAN, SEDAN, SUV, PICKUP }
}