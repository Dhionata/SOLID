package br.com.solid

class Pintor(nome: String, lucro: Int) : Funcionario(nome, lucro), Contrato {
    fun pintar() {
        println("$nome está pintando")
    }
}
