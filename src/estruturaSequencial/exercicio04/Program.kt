package estruturaSequencial.exercicio04

import java.util.*

fun main() {
    // Faça um Programa que peça as 4 notas bimestrais e mostre a média.

    val sc = Scanner(System.`in`).useLocale(Locale.US)

    print("Informe a nota do primeiro bimestre: ")
    val grade1: Double = sc.nextDouble()
    print("Informe a nota do segundo bimestre: ")
    val grade2: Double = sc.nextDouble()
    print("Informe a nota do terceiro bimestre: ")
    val grade3: Double = sc.nextDouble()
    print("Informe a nota do quarto bimestre: ")
    val grade4: Double = sc.nextDouble()

    val average: Double = (grade1 + grade2 + grade3 + grade4) / 4
    println("Média = ${String.format(Locale.US, "%.2f", average)}")
    sc.close()
}