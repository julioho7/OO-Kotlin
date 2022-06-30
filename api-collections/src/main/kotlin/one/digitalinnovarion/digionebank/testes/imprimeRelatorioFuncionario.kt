package one.digitalinnovarion.digionebank.testes

import one.digitalinnovarion.digionebank.Funcionario

class imprimeRelatorioFuncionario {
    companion object {
        fun imprime(funcionario: Funcionario) {
            println(funcionario.toString())
        }
    }
}