package Task_2_ChatBot

import java.lang.System.`in`
import java.util.*


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

fun task5(){
    val arr: Array<Int> = arrayOf(94, 37, 20, 33, 14, 43, 100,
        61, 59, 46, 39, 28, 59,88, 35)

    arr.sort()//метод сортировки

    println("Minimal array value is: ${arr.first()}")
}

fun task6(){
    val arr = intArrayOf(94, 37, 20, 33, 14, 43, 100,
        61, 59, 46, 39, 28, 59,88, 35)

    arr.sort()

    for (i in arr.size - 2 until arr.size)
        println("Maximal value in array is: " + arr[i])
}

fun task7(){

}

fun task8(){
    val vowel = arrayOf('e', 'i', 'u', 'a', 'o', 'y', 'k')
    val vowels: HashSet<Any?> = HashSet<Any?>(Arrays.asList(*vowel))

    var num = 0

    for (string in arrayOf("Uncopyrightable")) for (symbol in string.lowercase(Locale.getDefault()) //Нужно вставить свое слово например - Uncopyrightable
        .toCharArray()) if (vowels.contains(symbol)) num++

    println("Number of vowels is: " + num)
}

fun task9(){

}

fun task10(){
    println("Your multiplication table: \n")
    for(i in 1..9){
        for(j in 1..9){
            print("${i * j} \t")
        }
        println()
    }
}


fun main(){

        }
