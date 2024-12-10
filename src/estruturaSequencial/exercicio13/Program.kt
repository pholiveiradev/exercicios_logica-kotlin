package estruturaSequencial.exercicio13

import java.util.*

fun main() {
    /*
    Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
    a. Para homens: (72.7*h) - 58
    b. Para mulheres: (62.1*h) - 44.7
    */

    val sc = Scanner(System.`in`).useLocale(Locale.US)

    print("Informe a sua altura: ")
    val height: Double = sc.nextDouble()

    val formulaMan: Double = 72.7 * height - 58
    val formulaWoman: Double = 62.1 * height - 44.7

    println("Peso ideal para homens: ${String.format(Locale.US, "%.2f", formulaMan)}")
    println("Peso ideal para mulheres: ${String.format(Locale.US, "%.2f", formulaWoman)}")
    sc.close()
}