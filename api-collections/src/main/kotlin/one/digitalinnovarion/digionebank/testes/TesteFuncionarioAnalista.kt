package one.digitalinnovarion.digionebank.testes

import one.digitalinnovarion.digionebank.Analista
import one.digitalinnovarion.digionebank.Funcionario

fun main() {
    val joao = Analista(nome = "Joao Pedro", cpf = "123456789", salario = 2000.0)
    imprimeRelatorioFuncionario.imprime(joao)

}