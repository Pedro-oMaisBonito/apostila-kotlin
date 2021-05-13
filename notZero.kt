package Exercícios

import onlyMostBeautiful.finishComand
import kotlin.random.Random

fun notZero(){

    println("Put a number")
    // Highest number variable
    var mn = 0
    val generateNumber = readLine()!!.toInt()

    for(i in  0..generateNumber){

        val randomNumber = ((Math.random() * 10).toInt())
        println("Number: $randomNumber ")
        if (randomNumber == 0){
            println("Number 0 was found, the action stopped")
            break
        } // Zero conditional...
        if (randomNumber > mn){
            mn = randomNumber
        } // Highest
    }

    finishComand()
    println("The Highest number is: $mn ")

}

fun main(){

    notZero()

}