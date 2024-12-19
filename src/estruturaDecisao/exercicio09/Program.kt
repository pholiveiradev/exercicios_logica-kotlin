package estruturaDecisao.exercicio09

import java.util.Scanner

fun main() {
    // Faça um Programa que leia três números e mostre-os em ordem decrescente.

    val sc = Scanner(System.`in`)

    print("Digite o primeiro número: ")
    val num1: Int = sc.nextInt()
    print("Digite o segundo número: ")
    val num2: Int = sc.nextInt()
    print("Digite o terceiro número: ")
    val num3: Int = sc.nextInt()

    if (num1 >= num2 && num1 >= num3) {
        if (num2 >= num3) {
            println("Em ordem decrescente: $num1, $num2, $num3")
        } else {
            println("Em ordem decrescente: $num1, $num3, $num2")
        }
    } else if (num2 >= num1 && num2 >= num3) {
        if (num1 >= num3) {
            println("Em ordem decrescente: $num2, $num1, $num3")
        } else {
            println("Em ordem decrescente: $num2, $num3, $num1")
        }
    } else {
        if (num1 >= num2) {
            println("Em ordem decrescente: $num3, $num1, $num2")
        } else {
            println("Em ordem decrescente: $num3, $num2, $num1")
        }
    }
    sc.close()
}