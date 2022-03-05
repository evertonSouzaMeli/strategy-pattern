import br.com.fiap.service.Frete
import br.com.fiap.service.TipoFrete
import java.util.*

fun main(args: Array<String>) {


    val sc = Scanner(System.`in`)

    println("Informe a distancia: ")
    var distancia: Int = sc.nextInt()

    println("Qual o tipo de frete: (1) Normal, (2) Sedex")
    var opcao = sc.nextInt()

    val frete: Frete = Frete(TipoFrete.values()[opcao - 1])
    println("O valor do frete:  R$${frete.calculaPreco(distancia)}")
}