package Exercícios

class produto(val cdp:String, val dcc:String, val etq: Int, val pdc: Double, val mrgc: Double) {
}
// CDP = Código do Produto; DCC = Descrição do Produto; ETQ = Quantidade em Estoque;
// PDC = Preço do Produto; MRGC = Margem de Custo/venda.

fun main (){

    // Teste da class "Produto"
    val teclado = produto(cdp = "333-3",
            dcc = "RGB, ABNT2, USB E ETC.",
            etq = 15,
            pdc = 100.0,
            mrgc = 50.0)

        // Função "venda" caulcula Preço do Produto * Margem de Custo/Venda
        fun venda(produto: produto, pdc: Double, mrgc: Double){
        val alet = pdc * mrgc
        println(alet)
        }

        // Teste da função venda
        venda(teclado, 100.0, 50.0)

}