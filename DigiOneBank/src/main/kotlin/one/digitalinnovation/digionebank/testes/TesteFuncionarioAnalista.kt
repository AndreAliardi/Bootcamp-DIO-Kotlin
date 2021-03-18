package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Pessoa

fun main(){
    val joao = Analista("Joao Pedro", "123123123", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}