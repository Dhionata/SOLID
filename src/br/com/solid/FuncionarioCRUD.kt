package br.com.solid

class FuncionarioCRUD {

    fun salvar(conexaoBancoDeDados: DBConnection, funcionario: Funcionario) {
        conexaoBancoDeDados.conectar()
        println("Salvando funcionário ${funcionario.nome} com a conexão ${conexaoBancoDeDados.javaClass.simpleName}")
    }
}