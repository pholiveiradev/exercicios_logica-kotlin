package estruturaSequencial.exercicio11

import java.util.*
import kotlin.math.pow

fun main() {
    /*
    Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
    a. o produto do dobro do primeiro com metade do segundo .
    b. a soma do triplo do primeiro com o terceiro.
    c. o terceiro elevado ao cubo.
    */

    val sc = Scanner(System.`in`).useLocale(Locale.US)

    print("Digite um número inteiro: ")
    val num1: Int = sc.nextInt()
    print("Digite mais um número inteiro: ")
    val num2: Int = sc.nextInt()

    print("Digite um número real: ")
    val num3: Double = sc.nextDouble()

    val productDouble: Int = num1 * 2 + (num2 / 2)
    val sumTriple: Double = num1 * 3 + num3
    val thirdCube: Double = num3.pow(3.0)

    println("O produto do dobro do primeiro com metade do segundo: $productDouble")
    println("A soma do triplo do primeiro com o terceiro: ${String.format(Locale.US, "%.2f", sumTriple)}")
    println("O terceiro elevado ao cubo.: ${String.format(Locale.US, "%.2f", thirdCube)}")
    sc.close()
}