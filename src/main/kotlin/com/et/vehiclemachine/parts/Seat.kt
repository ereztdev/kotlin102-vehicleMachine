package com.et.vehiclemachine.parts

class Seat:Part {
    override val price: Int
        get() = 500

    override val totalCost = price
}