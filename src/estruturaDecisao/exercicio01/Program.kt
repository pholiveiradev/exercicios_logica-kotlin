package estruturaDecisao.exercicio01

import java.util.Scanner

fun main() {
    // Faça um Programa que peça dois números e imprima o maior deles.

    val sc = Scanner(System.`in`)

    print("Digite um número: ")
    val num1: Int = sc.nextInt()
    print("Digite um número: ")
    val num2: Int = sc.nextInt()

    val greaterValue: Int = if (num1 > num2) num1 else num2
    println("O número $greaterValue é maior")
    sc.close()

}