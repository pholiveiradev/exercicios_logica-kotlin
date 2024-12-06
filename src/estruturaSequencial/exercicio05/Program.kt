package estruturaSequencial.exercicio05

import java.util.*

fun main() {
    // Faça um Programa que converta metros para centímetros.

    val sc = Scanner(System.`in`).useLocale(Locale.US)

    print("Digite o valor em metros: ")
    val meters: Double = sc.nextDouble()

    val centimeters: Double = meters * 100.0
    println("$meters metros é igual a = ${String.format(Locale.US, "%.2f", centimeters)} cm")
    sc.close()
}