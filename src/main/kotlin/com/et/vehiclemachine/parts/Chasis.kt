package com.et.vehiclemachine.parts

class Chasis: Part {
    override val price: Int
        get() = 2000

    val seats: List<Seat> = listOf(
        Seat(), Seat(), Seat(), Seat(),
    )
}