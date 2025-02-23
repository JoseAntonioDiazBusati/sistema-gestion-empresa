# Ejercicio 10: Sistema de Gestión de Personal en una Empresa

## Requisitos

### Clase Base: Persona

#### Propiedades:
- `nombre` (String)
- `edad` (Int)

#### Métodos:
- `toString()`: Devuelve una cadena con información básica sobre la persona.  
  **Ejemplo:** "Nombre: Julia, Edad: 24".
- `celebrarCumple()`: Incrementa la edad en 1 y retorna un mensaje de felicitación.  
  **Ejemplo:** "Feliz cumpleaños Julia! Ahora tienes 25 años.".

---

### Clase Derivada: Empleado (de Persona)

#### Propiedades:
- `salarioBase` (Double)
  - Se debe permitir la construcción de un empleado con un argumento de tipo `Int` en esta propiedad.
- `porcentajeImpuestos` (Double)
  - Se debe permitir la construcción de un empleado con un argumento de tipo `Int` en esta propiedad.
  - Valor por defecto: **10.0**.

#### Métodos:
- `calcularSalario()`: Devuelve el `salarioBase` aplicando los impuestos.
- `toString()`: Devuelve una cadena que incluye la información de `Persona` y detalles adicionales del `Empleado`.  
  **Ejemplo:** "Nombre: Julia, Edad: 24, Salario: 28273.47€" (con 2 posiciones decimales para el salario).
- `trabajar()`: Retorna un mensaje que indica que el empleado está trabajando.  
  **Ejemplo:** "Pablo está trabajando en la empresa.".

---

### Clase Derivada: Gerente (de Empleado)

#### Propiedades:
- `bonus` (Double)
- `exentoImpuestos` (Boolean)
  - Por defecto, los gerentes **no** estarán exentos de impuestos.
- Sobrescribir `porcentajeImpuestos` para que los gerentes siempre tengan un **33.99%** de impuestos.

#### Métodos:
- `calcularSalario()`: Devuelve el `salarioBase` más el `bonus`, aplicando los impuestos solo al salario base o sin aplicar impuestos si `exentoImpuestos` es `true`.
- `toString()`: Devuelve una cadena que incluye la información de `Persona`, `Empleado` y detalles específicos del `Gerente`.
- `administrar()`: Retorna un mensaje que indica que el gerente está administrando.  
  **Ejemplo:** "Ana está administrando la empresa.".

---

## Uso en la Función `main()`

1. Crear una `Persona`, un `Empleado` y un `Gerente`.
2. Realizar distintas pruebas con cada uno:
   - Mostrar su información.
   - Ejecutar los métodos disponibles.

Este ejercicio permite aplicar el concepto de **herencia** y **polimorfismo** en la gestión de personal dentro de una empresa.

