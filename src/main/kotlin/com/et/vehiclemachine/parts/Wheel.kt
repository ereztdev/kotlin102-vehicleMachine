package com.et.vehiclemachine.parts

class Wheel: Part {
    override val price: Int
        get() = 200
    override val totalCost = price
}