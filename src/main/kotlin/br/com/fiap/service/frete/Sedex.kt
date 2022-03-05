package br.com.fiap.service.frete

class Sedex : Frete {
    override fun calculaPreco(distancia: Int) : Double{
        return distancia * 1.45 + 12
    }
}