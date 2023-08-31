package com.et.vehiclemachine.parts

class Transmission(
    val type: Type
) : Part {
    override val price: Int
        get() = when (this.type) {
            Type.MANUAL -> 1250
            Type.AUTOMATIC -> 2000
        }

    override val totalCost = price

    enum class Type { AUTOMATIC, MANUAL }
}