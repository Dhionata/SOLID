package br.com.solid.funcionarios

class Chefe(nome: String, lucro: Int) : Funcionario(nome, lucro) {
    fun cozinhar() {
        println("$nome está cozinhando")
    }
}