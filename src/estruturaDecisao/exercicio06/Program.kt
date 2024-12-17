package estruturaDecisao.exercicio06

import java.util.Scanner

fun main() {
    // Faça um Programa que leia três números e mostre o maior deles.

    val sc = Scanner(System.`in`)

    print("Informe o primeiro número: ")
    val num1: Int = sc.nextInt()
    print("Informe o segundo número: ")
    val num2: Int = sc.nextInt()
    print("Informe o terceiro número: ")
    val num3: Int = sc.nextInt()

    if (num1 > num2 && num1 > num3) {
        println("O $num1 é o maior número")
    } else if (num2 > num1 && num2 > num3) {
        println("O $num2 é o maior número")
    } else {
        println("O $num3 é o maior número")
    }
    sc.close()
}