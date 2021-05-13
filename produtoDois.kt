package Exercícios

class produtoDois(val CODPROD: String, val QTDMIN: Int, val QTDMAX: Int, val QTDEST: Int) {

    // Função para verificar o estoque!
    fun verificaEstoque(){
        if(QTDEST < QTDMIN){
          val QTDCOMPRAR = (QTDMAX - QTDMIN)
            println("O produto do código ${CODPROD}, está com o estoque baixo. Necessário comprar: ${QTDCOMPRAR} unidades do produto.")

        }
    }
}


fun main (){

    val caneta = produtoDois(CODPROD = "222-2", QTDMIN = 10, QTDMAX = 25, QTDEST = 20)
    val borracha = produtoDois(CODPROD = "111-1", QTDMIN = 20, QTDMAX = 30, QTDEST = 5)


    println(borracha.verificaEstoque())


}