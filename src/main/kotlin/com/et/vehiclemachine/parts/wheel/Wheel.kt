package com.et.vehiclemachine.parts.wheel

import com.et.vehiclemachine.parts.Part

class Wheel(
    val type: Type
) : Part {
    override val price: Int
        get() = when (this.type) {
            Type.ALUMINIUM -> 75
            Type.CARBON -> 150
            Type.STEEL -> 125
        }

    override val totalCost = price

    enum class Type { CARBON, STEEL, ALUMINIUM }
}