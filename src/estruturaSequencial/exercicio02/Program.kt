package estruturaSequencial.exercicio02

import java.util.Scanner

fun main() {
    // Faça um Programa que peça um número e então mostre a mensagem: O número informado foi [número].

    val sc = Scanner(System.`in`)

    print("Informe um número: ")
    val num: Int = sc.nextInt()

    println("O número informado foi $num")
    sc.close()
}