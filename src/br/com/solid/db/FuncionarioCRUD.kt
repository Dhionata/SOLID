package br.com.solid.db

import br.com.solid.funcionarios.Funcionario

class FuncionarioCRUD {
    fun salvar(conexaoBancoDeDados: DBConnection, funcionario: Funcionario) {
        conexaoBancoDeDados.conectar()
        println("Salvando funcionário ${funcionario.nome} com a conexão ${conexaoBancoDeDados.javaClass.simpleName}")
    }
}