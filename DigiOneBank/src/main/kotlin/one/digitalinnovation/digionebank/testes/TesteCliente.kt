package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Cliente
import one.digitalinnovation.digionebank.ClienteTipo
import java.util.*

fun main() {
    val jose = Cliente(
        nome = "Jose da Silva",
        cpf = "123.123.123.77",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )

    println(jose)

    TesteAutenticacao().autentica(jose)

}