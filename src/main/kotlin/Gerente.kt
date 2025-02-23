package org.example


class Gerente(nombre: String, edad: Int, salarioBase: Double, var bonus: Double, var exentoImpuestos: Boolean = false): Empleado(nombre, edad, salarioBase, 33.99) {

    override fun calcularSalario(): Double {
        return if (exentoImpuestos) salarioBase + bonus else (salarioBase * (1 - porcentajeImpuestos / 100)) + bonus
    }

    override fun toString(): String {
        return "${super.toString()}, Bonus: %.2f€, Exento de Impuestos: $exentoImpuestos".format(bonus)
    }

    fun administrar(): String {
        return "$nombre está administrando la empresa."
    }
}
