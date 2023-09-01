package com.et.vehiclemachine.parts.seat

import com.et.vehiclemachine.parts.Part

class Seat private constructor(
    val upholstry: Upholstery
) : Part {
    override val price: Int
        get() = when (this.upholstry) {
            Upholstery.CLOTH -> 1200
            Upholstery.LEATHER -> 2500
        }

    override val totalCost = price

    enum class Upholstery { LEATHER, CLOTH }

    class factory(val upholstry: Upholstery) {
        fun createSeat(): Seat {
            return Seat(upholstry)
        }
    }
}