package estruturaDecisao.exercicio07

import java.util.*

fun main() {
    // Faça um Programa que leia três números e mostre o maior e o menor deles.

    val sc = Scanner(System.`in`)

    print("Informe o primeiro número: ")
    val num1: Int = sc.nextInt()
    print("Informe o segundo número: ")
    val num2: Int = sc.nextInt()
    print("Informe o terceiro número: ")
    val num3: Int = sc.nextInt()

    when {
        num1 > num2 && num1 > num3 -> println("O $num1 é o maior número")
        num2 > num1 && num2 > num3 -> println("O $num2 é o maior número")
        num3 > num1 && num3 > num2 -> println("O $num3 é o maior número")
    }

    when {
        num1 < num2 && num1 < num3 -> println("O $num1 é o menor número")
        num2 < num1 && num2 < num3 -> println("O $num2 é o menor número")
        num3 < num1 && num3 < num2 -> println("O $num3 é o menor número")
    }
    sc.close()
}