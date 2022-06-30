package one.digitalinnovarion.digionebank.testes

import one.digitalinnovarion.digionebank.Analista
import one.digitalinnovarion.digionebank.Funcionario

fun main() {
    val maria = Analista(nome = "Maria das Dores", cpf = "123456789", salario = 5000.0)
    imprimeRelatorioFuncionario.imprime(maria)
}
