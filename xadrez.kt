package Exercícios

fun xadrez(){

    var i = 0
    var total: ULong = 0UL
    var graos: ULong = 1UL



    while( i < 64){
            i++

            if(i > 1){
                graos = graos * 2UL
                total = total + graos

                println(" $i Total de grãos: $total ")
            }
    }


}

fun main(){

    xadrez()



}