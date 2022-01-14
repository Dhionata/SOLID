package br.com.solid.funcionarios

class Jardineiro(nome: String, lucro: Int) : Funcionario(nome, lucro) {
    fun jardinar() {
        println("$nome está jardinando")
    }
}