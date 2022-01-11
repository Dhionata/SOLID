package br.com.solid.funcionarios

abstract class Funcionario(var nome: String, override var lucro: Int) : Contrato {}