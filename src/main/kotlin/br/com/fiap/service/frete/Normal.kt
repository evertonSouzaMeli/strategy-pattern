package br.com.fiap.service.frete

class Normal : Frete {
    override fun calculaPreco(distancia: Int) : Double{
        return distancia * 1.25 + 10
    }
}