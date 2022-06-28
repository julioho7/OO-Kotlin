package one.digitalinnovarion.digionebank

//Classe Pessoa que irá conter os dados de uma pessoa.
class Pessoa {
    var nome: String = "Julio Henrique de Oliveira"
    var cpf: String = "123.456.789-10" //Dessa forma, não é possível no Main selecionar esse variável
    private set

    //Esse declaração de uma classe dentro de outra classe não é recomendado.
    inner class Endereco {
        var rua: String = "Rua Teste, 123"
    }
}

//Classe principal
fun main() {
    val julio = Pessoa()

    //julio.cpf = "123" Como o set está private, não conseguimos setar nada nas variáveis

    println("O nome da criatura é: ${julio.nome}")
    println("O CPF da criatura é: ${julio.cpf}")

    //Como puxar da classe inner, dentro da classe Pessoas.
    println("O endereço da criatura é: ${julio.Endereco().rua}")

}