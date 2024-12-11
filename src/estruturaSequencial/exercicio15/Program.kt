package estruturaSequencial.exercicio15

import java.util.*

fun main() {
    /*
    Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
    Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
    8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
    a. salário bruto.
    b. quanto pagou ao INSS.
    c. quanto pagou ao sindicato.
    d. o salário líquido.
    e. calcule os descontos e o salário líquido, conforme a tabela abaixo:
    */

    val sc = Scanner(System.`in`).useLocale(Locale.US)

    print("Informe o quanto você ganha por hora: ")
    val valueHour: Double = sc.nextDouble()

    print("Informe o número de horas trabalhadas: ")
    val hoursWorked: Double = sc.nextDouble()

    val grossSalary: Double = valueHour * hoursWorked
    val incomeTax: Double = grossSalary * 0.11
    val inss: Double = grossSalary * 0.08
    val union: Double = grossSalary * 0.05
    val netSalary: Double = grossSalary - incomeTax - inss - union

    println("Seu salário bruto: R$ ${String.format(Locale.US, "%.2f", grossSalary)}")
    println("Quanto você pagou de INSS: R$ ${String.format(Locale.US, "%.2f", incomeTax)}")
    println("Quanto você pagou ao sindicato: R$ ${String.format(Locale.US, "%.2f", inss)}")
    println("Seu salário líquido: R$ ${String.format(Locale.US, "%.2f", netSalary)}")
    sc.close()
}