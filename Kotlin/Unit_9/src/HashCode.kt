package com.makotogo.learn.kotlin.hashcode

import com.makotogo.learn.kotlin.model.Person

fun hashCodeNumber() {
    println("********** hashCodeNumber() **********")

    val oneHundredByte: Byte = 100
    println("$oneHundredByte: oneHundredByte.hashCode() = ${oneHundredByte.hashCode()}")
    println("${oneHundredByte + oneHundredByte}: (oneHundredByte+oneHundredByte).hashCode() = ${(oneHundredByte + oneHundredByte).hashCode()}")

    val twoHundredShort: Short = 200
    println("$twoHundredShort: twoHundredShort.hashCode() = ${twoHundredShort.hashCode()}")
    println("${twoHundredShort + twoHundredShort}: (twoHundredShort+twoHundredShort).hashCode() = ${(twoHundredShort + twoHundredShort).hashCode()}")

    val twoHundredInt = 200
    println("$twoHundredInt: twoHundredInt.hashCode() = ${twoHundredInt.hashCode()}")
    println("${twoHundredInt + twoHundredInt}: (twoHundredInt+threeHundredInt).hashCode() = ${(twoHundredInt + twoHundredInt).hashCode()}")

    val twoHundredLong = 200L
    println("$twoHundredLong: twoHundredLong.hashCode() = ${twoHundredLong.hashCode()}")
    println("${(twoHundredLong + twoHundredLong)} (twoHundredLong+threeHundredLong).hashCode() = ${(twoHundredLong + twoHundredLong).hashCode()}")

    val twoHundredFloat = 200.0f
    println("$twoHundredFloat: twoHundredFloat.hashCode() = ${twoHundredFloat.hashCode()}")

    val twoHundredDouble = 200.0
    println("$twoHundredDouble: twoHundredDouble.hashCode() = ${twoHundredDouble.hashCode()}")
}

fun hashCodeChar() {
    println("********** hashCodeChar() **********")

    val aChar = 'a'
    println("$aChar: aChar.hashCode() = ${aChar.hashCode()}")

    val AChar = 'A'
    println("$AChar: AChar.hashCode() = ${AChar.hashCode()}")

    val lcurlyBraceChar = '{'
    println("$lcurlyBraceChar: lcurlyBraceChar.hashCode() = ${lcurlyBraceChar.hashCode()}")

    val rcurlyBraceChar = '}'
    println("$rcurlyBraceChar: rcurlyBraceChar.hashCode() = ${rcurlyBraceChar.hashCode()}")
}

fun hashCodeNumericString() {
    println("********** hashCodeNumericString() **********")

    val twoHundredString = "200"
    println("$twoHundredString: twoHundredString.hashCode() = ${twoHundredString.hashCode()}")

    val threeHundredString = "300"
    println("$threeHundredString: threeHundredString.hashCode() = ${threeHundredString.hashCode()}")

    val banana = "banana"
    println("$banana: banana.hashCode() = ${banana.hashCode()}")

}

fun hashCodePerson() {
    println("********** hashCodePerson() **********")

    val doug = Person("Davis", "Douglas")
    println("$doug: doug.hashCode() = ${doug.hashCode()}")

    val dougClone = Person("Davis", "Douglas")
    println("$dougClone: dougClone.hashCode() = ${dougClone.hashCode()}")

    val anotherPerson = doug
    println("$anotherPerson: anotherPerson.hashCode() = ${anotherPerson.hashCode()}")

}

fun main(args: Array<String>) {
    hashCodeNumber()
    hashCodeChar()
    hashCodeNumericString()
    hashCodePerson()
}