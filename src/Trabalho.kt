fun main() {

    // QUESTÃO 1 - when + Null Safety
    val produto = 100.0
    val cupom: String? = "PROMO20"

    val desconto = when (cupom) {
        "PROMO10" -> produto - 10
        "PROMO20" -> produto - 20
        else -> produto
    }

    println("Questão 1 - Valor final: R$ $desconto")


    // QUESTÃO 2 - for + Elvis + if/else
    val enderecos = listOf(
        "Rua A, 100",
        null,
        "Avenida B, 200"
    )

    println("\nQuestão 2:")

    for (endereco in enderecos) {
        val enderecoFinal = endereco ?: "Endereço Desconhecido"

        if (enderecoFinal == "Endereço Desconhecido") {
            println("Entrega Pendente: Falta de dados")
        } else {
            println("Rota traçada para: $enderecoFinal")
        }
    }


    // QUESTÃO 3 - Safe Call + Elvis + if/else
    val bio: String? = "Olá, eu sou uma criança!"

    val tamanhoBio = bio?.length ?: 0

    println("\nQuestão 3:")

    if (tamanhoBio <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }


    // QUESTÃO 4 - for + if + soma
    val transacoes = listOf<Double?>(
        50.0,
        null,
        120.5,
        null,
        10.0
    )

    var total = 0.0

    println("\nQuestão 4:")

    for (valor in transacoes) {
        if (valor != null) {
            total += valor
        } else {
            println("Transação ignorada")
        }
    }

    println("Valor total processado: R$ $total")


    // QUESTÃO 5 - Elvis + when
    val nota: Int? = 5
    val notaFinal = nota ?: 0

    println("\nQuestão 5:")

    when (notaFinal) {
        5 -> println("Excelente corrida!")
        4 -> println("Boa corrida.")
        1, 2, 3 -> println("Precisamos melhorar.")
        0 -> println("Nenhuma avaliação fornecida.")
    }


    // QUESTÃO 6 - Lambda + it + if
    val calcularGorjeta: (Double?) -> Double = {

        if (it == null || it < 0) {
            0.0
        } else {
            it
        }
    }

    println("\nQuestão 6:")

    println("Gorjeta 1: R$ ${calcularGorjeta(null)}")
    println("Gorjeta 2: R$ ${calcularGorjeta(-5.0)}")
    println("Gorjeta 3: R$ ${calcularGorjeta(15.0)}")


    // QUESTÃO 7 - for + Safe Call + Elvis + múltiplas condições
    val emails = listOf(
        "joao@email.com",
        null,
        "",
        "maria@email.com"
    )

    var contasInvalidas = 0

    println("\nQuestão 7:")

    for (email in emails) {

        val tamanhoEmail = email?.length ?: 0

        if (email == null || tamanhoEmail == 0) {
            contasInvalidas++
            println("Conta inválida: será deletada.")
        } else {
            println("Conta válida: $email")
        }
    }

    println("Contas que precisam ser apagadas: $contasInvalidas")
}