package estruturaSequencial.exercicio17

import java.util.*
import kotlin.math.ceil

fun main() {
    /*
    Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada.
    Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros,
    que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
    Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
    a. comprar apenas latas de 18 litros;
    b. comprar apenas galões de 3,6 litros;
    c. misturar latas e galões, de forma que o desperdício de tinta seja menor.
    Acrescente 10% de folga e sempre arredonde os valores para cima, isto é, considere latas cheias.
    */

    val sc = Scanner(System.`in`).useLocale(Locale.US)

    print("Digite o tamanho em metros quadrados da área a ser pintada: ")
    val squareMeters: Double = sc.nextDouble()

    val litersPaint: Double = squareMeters / 6 * 1.1

    val paintCans: Int = ceil(litersPaint / 18).toInt()
    val totalPriceCans: Double = paintCans * 80.0

    val paintGallons: Int = ceil(litersPaint / 3.6).toInt()
    val totalPriceGallons: Double = paintGallons * 25.0

    val cansForMix: Int = (litersPaint / 18).toInt()
    val remainingLiters: Double = litersPaint - (cansForMix * 18)
    val gallonsForMix: Int = ceil(remainingLiters / 3.6).toInt()

    val totalPriceMix: Double = (cansForMix * 80.0) + (gallonsForMix * 25.0)

    println("Somente latas: $paintCans, total: R$ $totalPriceCans")
    println("Somente galões: $paintGallons, total: R$ $totalPriceGallons")
    println("Latas: $cansForMix e Galões: $gallonsForMix, total: R$ $totalPriceMix")
    sc.close()
}