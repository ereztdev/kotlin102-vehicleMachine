package com.et.vehiclemachine.parts

class Engine : Part {
    val transmission: Transmission = Transmission()
    override val price: Int
        get() = 300
}