package br.com.solid

class PostgreSQL : DBConnection {

    override fun conectar() {
        println("Conectado ao banco de dados PostgreSQL")
    }
}