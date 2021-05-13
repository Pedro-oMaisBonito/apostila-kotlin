package Exercícios

import onlyMostBeautiful.finishComand

fun main() {

    // Peoples
    var numeroDeMulheres = 0
    var numeroDeHomens = 0
    var numeroDeSalarios = 0
    // Wage
    // maior salário

    var mWage = 0
    var somaSalario = 0

    // Salário Mulher
    var salarioMulherMenorQueCem = 0


    // Ages
    var maiorIdade = Int.MIN_VALUE
    var menorIdade = Int.MAX_VALUE


    // Here, number of people is request.
    println("Quantas pessoas são?")
    val numeroDePessoas = readLine()!!.toInt()

    for (pessoa in 1..numeroDePessoas) {

        // Sex...
        println("How is the sex? Only M or F")
        val sex = readLine()!!.toString()

        if (sex == "F"){
            numeroDeMulheres++
        } else if (sex == "M"){
            numeroDeHomens++
        }

        // Wage...
        println("How is the wage?")
        val salario = readLine()!!.toDouble()
        if (salario > 0) {
            numeroDeSalarios++
        }
        somaSalario = somaSalario + salario


        // Age...
        println("Hos is the age")
        val idade = readLine()!!.toInt()
        println("Next People")


        // Woman Wage < 100.0
        if(sex == "M" || salario < 100.0){
            salarioMulherMenorQueCem++
        }

        // > and < Age
        if(idade < menorIdade){
            menorIdade = idade
        } else if (idade > maiorIdade){
            maiorIdade = idade
        }
    }

    val mediaSalario = somaSalario / numeroDePessoas

     // Exit...
    finishComand()
    println("Quantidade de homens: ${numeroDeHomens}")
    finishComand()
    println("Quantidade de mulheres com salário menor que R$100.0: ${salarioMulherMenorQueCem}")
    finishComand()
    println("A Menor idade é: ${menorIdade}")
    println("A Maior idade é: ${maiorIdade}")
    finishComand()
    println("A Média de salários é: ${mediaSalario}")
    finishComand()
}

// if (sexo !== "M" || sexo !== "F"){
//println("Error, please only M or F")}

