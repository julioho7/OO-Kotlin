package one.digitalinnovarion.digionebank.testes

import one.digitalinnovarion.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("Modelo 1: ${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("Modelo 2: ${it.name} - ${it.descricao}")
    }

    val pf = ClienteTipo.PF
    println("Modelo 3: ${pf.name} - ${pf.descricao}")

    val pj = ClienteTipo.PJ
    println("Modelo 3: ${pj.name} - ${pj.descricao}")
}