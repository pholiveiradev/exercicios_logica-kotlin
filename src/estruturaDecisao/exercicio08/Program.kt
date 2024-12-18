package estruturaDecisao.exercicio08

import java.util.*

fun main() {
    /*
    Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
    sabendo que a decisão é sempre pelo mais barato.
    */

    val sc = Scanner(System.`in`).useLocale(Locale.US)

    print("Informe o preço do produto 1: ")
    val product1: Double = sc.nextDouble()
    print("Informe o preço do produto 2: ")
    val product2: Double = sc.nextDouble()
    print("Informe o preço do produto 3: ")
    val product3: Double = sc.nextDouble()

    when {
        product1 < product2 && product1 < product3 -> println("Compre o produto de R$ $product1")
        product2 < product1 && product2 < product3 -> println("Compre o produto de R$ $product2")
        product3 < product1 && product3 < product2 -> println("Compre o produto de R$ $product3")
    }
    sc.close()
}