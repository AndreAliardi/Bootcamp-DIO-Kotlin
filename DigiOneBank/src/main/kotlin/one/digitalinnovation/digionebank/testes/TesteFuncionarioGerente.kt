package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Gerente
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val maria = Gerente(nome = "Mairia do Carmo", cpf = "1235645654", salario = 5000.0, "senha123")
    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)
}

