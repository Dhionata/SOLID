package br.com.solid.funcionarios

class Motorista(nome: String, lucro: Int, override var localizacao: ArrayList<Double>) : Funcionario(nome, lucro),
    Rastreavel {
    // sobrecarga de métodos não existe em Kotlin, mas podemos criar valores default para os parâmetros.
    fun dirigir(veiculo: String = "moto") {
        println(
            "$nome está dirigindo ${
                if (veiculo == "moto") {
                    "uma"
                } else {
                    "um"
                }
            } $veiculo"
        )
    }

    override fun toString(): String {
        return super.toString() + "\nLocalização: $localizacao"
    }
}
