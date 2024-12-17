package estruturaDecisao.exercicio03

import java.util.Scanner

fun main() {
    /*
    Faça um Programa que verifique se uma letra digitada é "F" ou "M".
    Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
    */

    val sc = Scanner(System.`in`)

    print("Informe seu sexo (M - Masculino, F - Feminino): ")
    val gender: Char = sc.next()[0]

    if (gender == 'M' || gender == 'm') {
        println("Masculino")
    } else if (gender == 'F' || gender == 'f') {
        println("Feminino")
    } else {
        println("Sexo inválido")
    }
    sc.close()
}