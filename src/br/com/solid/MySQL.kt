package br.com.solid

class MySQL : DBConnection {
    override fun conectar() {
        println("Conectado ao banco de dados MySQL")
    }
}