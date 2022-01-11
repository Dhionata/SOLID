package br.com.solid

abstract class Funcionario(var nome: String, override var lucro: Int) : Contrato {}