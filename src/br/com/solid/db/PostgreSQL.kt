package br.com.solid.db

class PostgreSQL : DBConnection {

    override fun conectar() {
        println("Conectado ao banco de dados PostgreSQL")
    }
}