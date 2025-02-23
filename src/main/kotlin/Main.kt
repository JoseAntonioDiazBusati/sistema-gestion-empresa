package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val empleado = Empleado("Luis", 29, 30000, 10)
    val gerente = Gerente("Camila", 43, 50000.0, 10000.0)

    println(empleado)
    println(empleado.trabajar())
    println(empleado.celebrarCumple())
    println(gerente)
    println(gerente.administrar())
    println(gerente.celebrarCumple())
}