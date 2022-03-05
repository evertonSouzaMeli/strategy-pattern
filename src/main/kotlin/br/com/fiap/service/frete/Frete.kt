package br.com.fiap.service.frete

interface Frete{
    open fun calculaPreco(distancia: Int) : Double
}