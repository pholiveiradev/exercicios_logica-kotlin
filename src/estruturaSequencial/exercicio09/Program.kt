package estruturaSequencial.exercicio09

import java.util.*

fun main() {
    /*
    Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
    C = 5 * ((F-32) / 9).
    */

    val sc = Scanner(System.`in`).useLocale(Locale.US)

    print("Informe a temperatura em fahrenheit: ")
    val fahrenheit: Double = sc.nextDouble()

    val formulaCelsius: Double = 5 * ((fahrenheit - 32) / 9)
    print("Temperatura em celsius: ${String.format(Locale.US, "%.2f", formulaCelsius)}")
    sc.close()
}