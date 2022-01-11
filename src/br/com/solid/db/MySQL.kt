package br.com.solid.db

class MySQL : DBConnection {
    override fun conectar() {
        println("Conectado ao banco de dados MySQL")
    }
}