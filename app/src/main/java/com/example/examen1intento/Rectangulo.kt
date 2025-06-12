package com.example.examen1intento

class Rectangulo(private val base: Double, private val altura: Double) {
    fun calcularArea(): Double = base * altura
    fun calcularPerimetro(): Double = 2 * (base + altura)
}
