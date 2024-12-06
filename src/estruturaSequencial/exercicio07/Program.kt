package estruturaSequencial.exercicio07

import java.util.*
import kotlin.math.pow

fun main() {
    // Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

    val sc = Scanner(System.`in`).useLocale(Locale.US)

    print("Digite o lado do quadrado: ")
    val side: Double = sc.nextDouble()

    val areaSquare: Double = side.pow(2.0)
    val double: Double = areaSquare * 2.0

    println("Dobro da área do quadrado: ${String.format(Locale.US, "%.2f", double)}")
    sc.close()

}