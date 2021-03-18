package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Banco

fun main(){
    val digiOneBank = Banco(numero = 12, nome = "DigiOne")
//    val digiOneBank = Banco("DigiOne", 12)

    println(digiOneBank.info())

    val banco2 = digiOneBank.copy(nome = "Banco2", numero = 15)
    println(banco2.info())

    //banco2.nome = "outro nome" // isso da erro pq uma vez instanciado, esse objeto só pode ser alterado numa cópia
}