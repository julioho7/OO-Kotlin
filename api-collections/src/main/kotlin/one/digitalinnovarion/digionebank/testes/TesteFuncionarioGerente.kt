package one.digitalinnovarion.digionebank.testes

import one.digitalinnovarion.digionebank.Gerente
import one.digitalinnovarion.digionebank.Funcionario

fun main() {
    val maria = Gerente(nome = "Maria das Dores", cpf = "123456789", salario = 5000.0, senha = "senha3")

    imprimeRelatorioFuncionario.imprime(maria)

    TesteAuntenticacao().autentica(maria)
}
