package br.com.solid.funcionarios

class Pintor(nome: String, lucro: Int) : Funcionario(nome, lucro) {
    fun pintar() {
        println("$nome está pintando")
    }
}