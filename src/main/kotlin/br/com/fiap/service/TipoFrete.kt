package br.com.fiap.service

import br.com.fiap.service.frete.Frete
import br.com.fiap.service.frete.Normal
import br.com.fiap.service.frete.Sedex

enum class TipoFrete {
    NORMAL { override fun obterFrete(): Frete { return Normal() } },
    SEDEX  { override fun obterFrete(): Frete { return Sedex()  } };

    abstract fun obterFrete() : Frete
}