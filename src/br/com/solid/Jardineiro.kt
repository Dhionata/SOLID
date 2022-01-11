package br.com.solid

class Jardineiro(nome: String, lucro: Int) : Funcionario(nome, lucro), Contrato {
    fun jardinar() {
        println("$nome está jardinando")
    }
}