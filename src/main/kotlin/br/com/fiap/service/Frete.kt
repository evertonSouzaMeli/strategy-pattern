package br.com.fiap.service

class Frete(
    val tipoFrete: TipoFrete
) {

    fun calculaPreco(distancia: Int) : Double{
        var preco: Double = 0.0
        if(tipoFrete == TipoFrete.NORMAL)
            preco = distancia * 1.25 + 10
        else if(tipoFrete == TipoFrete.SEDEX)
            preco = distancia * 1.45 + 12
        return preco
    }
}