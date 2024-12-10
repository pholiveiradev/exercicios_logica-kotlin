package estruturaSequencial.exercicio08

import java.util.*

fun main() {
    /*
    Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
    Calcule e mostre o total do seu salário no referido mês.
    */

    val sc = Scanner(System.`in`).useLocale(Locale.US)

    print("Quanto você ganha por hora? ")
    val valueHour: Double = sc.nextDouble()

    print("Quantas horas você trabalha por mês? ")
    val hoursWorkedMonth: Double = sc.nextDouble()

    val salary: Double = hoursWorkedMonth * valueHour
    println("Salário = R$${String.format(Locale.US, "%.2f", salary)}")
    sc.close()
}