package estruturaDecisao.exercicio05

import java.util.*

fun main() {
    /*
    Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:
    - A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
    - A mensagem "Reprovado", se a média for menor do que sete;
    - A mensagem "Aprovado com Distinção", se a média for igual a dez.
    */

    val sc = Scanner(System.`in`).useLocale(Locale.US)

    print("Informe a sua primeira nota: ")
    val grade1: Double = sc.nextDouble()
    print("Informe a sua segunda nota: ")
    val grade2: Double = sc.nextDouble()

    val average: Double = (grade1 + grade2) / 2
    if (average == 10.0) {
        println("Aprovado com distinção")
    } else if (average >= 7.0) {
        println("Aprovado")
    } else {
        println("Reprovado")
    }
    sc.close()
}