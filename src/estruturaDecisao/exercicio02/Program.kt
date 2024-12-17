package estruturaDecisao.exercicio02

import java.util.Scanner

fun main() {
    // Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

    val sc = Scanner(System.`in`)

    print("Digite um número: ")
    val num1: Int = sc.nextInt()

    val positiveOrNegative: String = if (num1 > 0) "Positivo" else "Negativo"
    println("O número $num1 é $positiveOrNegative")
    sc.close()
}