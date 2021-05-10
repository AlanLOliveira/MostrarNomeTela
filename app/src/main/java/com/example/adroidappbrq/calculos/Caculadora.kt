package com.example.adroidappbrq.calculos

fun main (args: Array<String>){

    print("Digite o primeiro número: ")
    var num1 : Int = readLine() !!.toInt()
    print("Digite o segundo número: ")
    var num2 : Int = readLine() !!.toInt()
    print("A soma é ${somar(num1, num2)}")

}

fun somar (num1: Int, num2: Int) = num1+num2

fun multiplicar (num1: Int, num2: Int) = num1*num2

fun dividir (num1: Int, num2: Int) = num1/num2


