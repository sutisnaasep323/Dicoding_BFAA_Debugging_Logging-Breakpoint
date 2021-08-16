package com.example.myunittesting

class CuboidModel {

    private var length : Double = 0.0
    private var widht : Double = 0.0
    private var height : Double = 0.0

    fun save(length: Double, widht: Double, height: Double){
        this.length = length // parameter length dimasukkan ke variabel length
        this.widht = widht
        this.height = height
    }

    fun getVolume(): Double = length * widht * height // rumus volume

    fun getSurfaceArea(): Double {
        val lw = length * widht // panjnag * lebar
        val wh = widht * height // lebar * tinggi
        val lh = length * height // panjang * tinggi

        return 2 * (lw + wh + lh)
    }

    fun getCircumference(): Double = 4 * (length + widht + height)

}