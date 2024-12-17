package estruturaDecisao.exercicio04

import java.util.Scanner

fun main() {
    // Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

    val sc = Scanner(System.`in`)

    print("Digite uma letra: ")
    val letter: Char = sc.next()[0].uppercaseChar()

    if (letter in "AEIOU") {
        println("Você escreveu uma vogal")
    } else {
        println("Você escreveu uma consoante")
    }
    sc.close()
}