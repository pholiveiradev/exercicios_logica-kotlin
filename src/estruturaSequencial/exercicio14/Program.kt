package estruturaSequencial.exercicio14

import java.util.*

fun main() {
    /*
    João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que
    ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma
    multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e calcule o
    excesso. Gravar na variável excesso a quantidade de quilos além do limite e na variável multa o valor da multa que João deverá pagar.
    Imprima os dados do programa com as mensagens adequadas.
    */

    val sc = Scanner(System.`in`).useLocale(Locale.US)

    print("Informe o peso da pesca: ")
    val weight: Double = sc.nextDouble()

    val excess: Double = weight - 50.0
    val fine: Double = excess * 4.0
    println("Foram $excess kg em excesso e a sua multa será de R$ ${String.format(Locale.US, "%.2f", fine)}")
    sc.close()
}