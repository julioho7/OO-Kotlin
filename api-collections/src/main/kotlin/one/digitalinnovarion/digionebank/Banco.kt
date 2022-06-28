package one.digitalinnovarion.digionebank

data class Banco(
    val nome: String,
    val numero: Int
) {
    fun info() = "Banco: $nome - Código Banco: $numero"
}
