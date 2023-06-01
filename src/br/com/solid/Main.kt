package br.com.solid

import br.com.solid.db.FuncionarioCRUD
import br.com.solid.db.MySQL
import br.com.solid.db.PostgreSQL
import br.com.solid.funcionarios.*

fun main() {

    val funcionario = Motorista("João", 123, arrayListOf(2.0, 3.0))
    funcionario.dirigir()
    println(funcionario)

    val funcionario2: Funcionario = Motorista("Dhionatã", 300, arrayListOf(2.0, 3.0))
    printFuncionario(funcionario)
    print(funcionario2)

    val funcionario3 = Chefe("Hangel", 1000)
    funcionario3.cozinhar()
    println(funcionario3)

    val funcionario4 = Jardineiro("Miguel", 500)
    funcionario4.jardinar()
    println(funcionario4)

    val funcionario5 = Pintor("Kafka", 500)
    funcionario5.pintar()
    println(funcionario5)

    val funcionarioCRUD = FuncionarioCRUD()

    val mySQL = MySQL()
    val postgreSQL = PostgreSQL()

    funcionarioCRUD.salvar(mySQL, funcionario)
    funcionarioCRUD.salvar(postgreSQL, funcionario2)
    funcionarioCRUD.salvar(postgreSQL, funcionario3)
}
