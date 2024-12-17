package estruturaSequencial.exercicio18

import java.util.*

fun main() {
    /*
    Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps),
    calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
    */

    val sc = Scanner(System.`in`).useLocale(Locale.US)

    print("Informe o tamanho do arquivo em MB: ")
    val file: Double = sc.nextDouble()
    print("Informe a velocidade da internet em Mbps: ")
    val internetMbps: Double = sc.nextDouble()

    val internetMBps: Double = internetMbps / 8
    val downloadTimeSeconds: Double = file / internetMBps
    val downloadTimeMinutes: Double = downloadTimeSeconds / 60

    println(
        "O seu arquivo de $file MB vai levar aproximadamente ${
            String.format(
                Locale.US,
                "%.2f",
                downloadTimeMinutes
            )
        } minutos"
    )
    sc.close()
}