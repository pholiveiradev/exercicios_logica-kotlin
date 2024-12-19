package estruturaDecisao.exercicio10

import java.util.Scanner

fun main() {
    /*
    Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
    Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.
    */

    val sc = Scanner(System.`in`)

    print("Informe qual turno você estuda (M-matutino ou V-Vespertino ou N- Noturno): ")
    val turn: Char = sc.next()[0].uppercaseChar()

    when {
        turn == 'M' -> println("Bom dia!")
        turn == 'V' -> println("Boa tarde!")
        turn == 'N' -> println("Boa noite!")
        else -> println("Valor inválido")
    }
    sc.close()
}