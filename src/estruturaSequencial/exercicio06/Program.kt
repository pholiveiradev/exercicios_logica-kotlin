package estruturaSequencial.exercicio06

import java.util.*
import kotlin.math.PI
import kotlin.math.pow

fun main() {
    // Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

    val sc = Scanner(System.`in`).useLocale(Locale.US)

    print("Digite o valor do raio: ")
    val ray: Double = sc.nextDouble()

    val areaCircle: Double = PI * ray.pow(2.0)
    println("Área do círculo = ${String.format(Locale.US, "%.2f", areaCircle)}")
    sc.close()
}