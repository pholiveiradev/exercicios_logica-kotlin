package estruturaSequencial.exercicio10

import java.util.*

fun main() {
    /*
    Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
    */

    val sc = Scanner(System.`in`).useLocale(Locale.US)

    print("Informe a temperatura em celsius: ")
    val celsius: Double = sc.nextDouble()

    val formulaFahrenheit: Double = (celsius * 9 / 5) + 32
    println("Temperatura em fahrenheit: ${String.format(Locale.US, "%.2f", formulaFahrenheit)}")
    sc.close()
}