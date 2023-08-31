package com.et.vehiclemachine.parts

class Engine (
    val type: Type,
    val transmission: Transmission
) : Part {
    override val price: Int
        get() = when(this.type) {
            Type.ELECTRIC->6500
            Type.DIESEL->2300
            Type.HYBRID->4000
            Type.PETROL->3500
        }
    override val totalCost: Int
        get() = price + transmission.totalCost

    enum class Type { PETROL, DIESEL, HYBRID, ELECTRIC }
}