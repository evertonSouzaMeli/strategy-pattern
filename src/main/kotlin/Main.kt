import br.com.fiap.service.frete.Frete
import br.com.fiap.service.TipoFrete
import br.com.fiap.service.frete.Normal
import br.com.fiap.service.frete.Sedex
import java.util.*

fun main(args: Array<String>) {


    val sc = Scanner(System.`in`)

    println("Informe a distancia: ")
    var distancia: Int = sc.nextInt()

    println("Qual o tipo de frete: (1) Normal, (2) Sedex")
    var opcao = sc.nextInt()
    var tipoFrete = TipoFrete.values()[opcao - 1]

    var frete: Frete? = tipoFrete.obterFrete()

    println("O valor do frete:  R$${frete?.calculaPreco(distancia)}")
}