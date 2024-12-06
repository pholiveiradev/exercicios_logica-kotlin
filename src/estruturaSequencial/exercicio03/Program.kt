package estruturaSequencial.exercicio03

import java.util.Scanner

fun main() {
    // Faça um Programa que peça dois números e imprima a soma.

    val sc = Scanner(System.`in`)

    print("Informe o primeiro número: ")
    val num1: Int = sc.nextInt()

    print("Informe o segundo número: ")
    val num2: Int = sc.nextInt()

    val sum: Int = num1 + num2
    println("Soma = $sum")
    sc.close()
}