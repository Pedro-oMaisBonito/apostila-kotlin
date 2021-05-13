package Exercícios

class cliente(val nome: String,
              val sal: Double,
              val nConta: String,
              val saldo: Double) {



    fun layout () {
        if (sal >= 1500.0) {
            println("+       RELAÇÕES DE CLIENTES/SALDO             PAG: 21")
            println(" NÚMERO-CONTA ${nConta}       NOME ${nome}                    SALDO: ${saldo}  ")
            println("             TOTAL EM CONTA CORRENTE ${sal}                  ")
        } else{
            println("+       RELAÇÕES DE CLIENTES/SALDO             PAG: 21")
            println(" NÚMERO-CONTA ${nConta}       NOME ${nome}                    SALDO: Saldo menor que mil, consultar gerente  ")
            println("             TOTAL EM CONTA CORRENTE ${sal}                  ")
        }
    }
}


fun main() {


        // Clientes do Banco
    val ronaldo = cliente(nome = "Ronaldo", sal = 3000.0, nConta = "333-666", saldo = 5000.0)
    val fatima = cliente(nome = "Fátima ", sal = 2500.0, nConta = "555-555", saldo = 7500.0)
    val wagner = cliente(nome = "Wagner", sal = 1300.0, nConta = "666-666", saldo = 1100.0)
    val neto = cliente(nome = "Lucas", sal = 950.0, nConta = "777-777", saldo = 500.0)

    ronaldo.layout()
    neto.layout()




}







