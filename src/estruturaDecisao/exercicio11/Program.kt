package estruturaDecisao.exercicio11

import java.util.*

fun main() {
    /*
    As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores
    e lhe contraram para desenvolver o programa que calculará os reajustes.
    Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no salário atual:
    - salários até R$ 280,00 (incluindo) : aumento de 20%
    - salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
    - salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
    - salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
    - o salário antes do reajuste;
    - o percentual de aumento aplicado;
    - o valor do aumento;
    - o novo salário, após o aumento.
    */

    val sc = Scanner(System.`in`).useLocale(Locale.US)
    var increase: Double = 0.0
    var newSalary: Double = 0.0

    print("Informe o seu salário: ")
    val salary: Double = sc.nextDouble()

    if (salary in 0.0..280.0) {
        increase = salary * 0.2
        newSalary = salary + increase
        println(
            "Seu salário antes do reajuste: R$ ${String.format(Locale.US, "%.2f", salary)}\n" +
                    "Percentual do aumento aplicado: 20%\n" +
                    "Valor do aumento: R$ ${String.format(Locale.US, "%.2f", increase)}\n" +
                    "Seu novo salário: R$ ${String.format(Locale.US, "%.2f", newSalary)}"
        )
    } else if (salary in 280.0..700.0) {
        increase = salary * 0.15
        newSalary = salary + increase
        println(
            "Seu salário antes do reajuste: R$ ${String.format(Locale.US, "%.2f", salary)}\n" +
                    "Percentual do aumento aplicado: 15%\n" +
                    "Valor do aumento: R$ ${String.format(Locale.US, "%.2f", increase)}\n" +
                    "Seu novo salário: R$ ${String.format(Locale.US, "%.2f", newSalary)}"
        )
    } else if (salary in 700.0..1_500.0) {
        increase = salary * 0.10
        newSalary = salary + increase
        println(
            "Seu salário antes do reajuste: R$ ${String.format(Locale.US, "%.2f", salary)}\n" +
                    "Percentual do aumento aplicado: 10%\n" +
                    "Valor do aumento: R$ ${String.format(Locale.US, "%.2f", increase)}\n" +
                    "Seu novo salário: R$ ${String.format(Locale.US, "%.2f", newSalary)}"
        )
    } else {
        increase = salary * 0.05
        newSalary = salary + increase
        println(
            "Seu salário antes do reajuste: R$ ${String.format(Locale.US, "%.2f", salary)}\n" +
                    "Percentual do aumento aplicado: 5%\n" +
                    "Valor do aumento: R$ ${String.format(Locale.US, "%.2f", increase)}\n" +
                    "Seu novo salário: R$ ${String.format(Locale.US, "%.2f", newSalary)}"
        )
    }
    sc.close()
}