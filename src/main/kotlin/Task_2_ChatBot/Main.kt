package Task_2_ChatBot

import java.lang.System.`in`
import java.util.Scanner

fun task1() {
    val sc = Scanner(`in`)

    print("please, write your number: ")
    val num = sc.nextInt()

    if (num % 2 == 0)
        println("$num is even")
    else
        println("$num is odd")
}

fun task2() {
    val sc = Scanner(`in`)

    print("please, write your number: ")
    val num = sc.nextInt()

    if (num % 2 == 0)
        println("Answer is: " + num * 4)
    else
        println("Answer is: " + num * 5)
}

fun task3() {
    val sc = Scanner(`in`)
    val zero = 0

    print("please, write your number: ")
    val num = sc.nextInt()
    if (num > zero)
        println("Answer is: " + (num.inv() + 1)) //.inv - логическое отрицание или инверсия - инвертирует биты числа
    if (num < zero)
        println("Answer is: " + num)
    else
        println("It's difficult question, but I think - it will be: " + zero)
}

fun task4(){
    fun century(year: Int): Int {
        return if (year % 100 == 0) year / 100
        else (year / 100) + 1
    }
    println("Your century is: " + century(1950)) //Нужно вводить вручную год, со сканнером не работает ;(
}

fun task5(){ //метод сортировки
    val arr: Array<Int> = arrayOf(94, 37, 20, 33, 14, 43, 100,
        61, 59, 46, 39, 28, 59,88, 35)

    arr.sort()

    println("Minimal array value is: ${arr.first()}")
}

fun task6(){

}

fun main(){

        }
