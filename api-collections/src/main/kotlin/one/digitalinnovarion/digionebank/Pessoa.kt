package one.digitalinnovarion.digionebank

class Pessoa {
    var nome: String = "Julio Henrique de Oliveira"
    var cpf: String = "095.458.469-41"
}

fun main() {
    val julio = Pessoa()
    println("O nome da criatura é ${julio.nome}")
    println("O CPF da criatura é ${julio.cpf}")
}