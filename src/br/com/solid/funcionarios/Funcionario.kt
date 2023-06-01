package br.com.solid.funcionarios

abstract class Funcionario(var nome: String, override var lucro: Int) : Contrato {
    override fun toString(): String {
        return "Nome: $nome\nSalário: $lucro"
    }
}

//I - Interface, B filha de A pode ser usado para substituir A.
fun printFuncionario(funcionario: Funcionario) {
    if (funcionario is Motorista) {
        val motorista: Motorista = funcionario
        motorista.dirigir("carro")
    }
}