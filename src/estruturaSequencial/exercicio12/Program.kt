package estruturaSequencial.exercicio12

import java.util.Locale
import java.util.Scanner

fun main() {
    /*
    Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal,
    usando a seguinte fórmula: (72.7*altura) - 58
    */

    val sc = Scanner(System.`in`).useLocale(Locale.US)

    print("Informe a sua altura: ")
    val height: Double = sc.nextDouble()

    val idealWeight: Double = (72.7 * height) - 58
    println("Seu peso ideal é: ${String.format(Locale.US, "%.2f", idealWeight)}")
    sc.close()
}