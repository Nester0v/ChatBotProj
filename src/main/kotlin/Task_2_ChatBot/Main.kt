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
    val arr = intArrayOf(94, -37, 20, 33, -14, 43, -100,
        61, 59, -46, 39, 28, -59,-88, 35)

    arr.sort()
    var positiveValueCount = 0
    val negativeValueSum = arr.filter { it < 0 }.sum()

    for (i in arr.indices) {
        if (arr[i] > 0) {
            positiveValueCount++
        }
    }

    val result = if (!arr.isEmpty()) {
        println("Array is not empty!!!")
    } else {
        null
    }

    println("\nCount of positive elements in array: " + negativeValueSum)
    println("\nSum of negative elements in array: " + positiveValueCount)

}

fun task8(){
    val vowel = arrayOf('e', 'i', 'u', 'a', 'o', 'y', 'k')
    val vowels: HashSet<Any?> = HashSet<Any?>(Arrays.asList(*vowel))

    var num = 0

    for (string in arrayOf("Uncopyrightable")) // Нужно вставить свое слово например - Uncopyrightable
        for (symbol in string.lowercase(Locale.getDefault()).toCharArray())
            if (vowels.contains(symbol))
                num++

    println("Number of vowels is: " + num)
}

fun task9(){
    fun findMiddle(str: String): String {
        val middleIndex = str.length / 2
        return if (str.length % 2 == 0) {
            str.substring(middleIndex - 1, middleIndex + 1)
        } else {
            str.substring(middleIndex, middleIndex + 1)
        }
    }
    val sc = Scanner(`in`)

    println("Write your word: ")

    val word = sc.next()
    println(findMiddle(word))
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
    println("TASK 1 \n")
    task1()
    println("\nTASK 2 \n")
    task2()
    println("\nTASK 3 \n")
    task3()
    println("\nTASK 4 \n")
    task4()
    println("\nTASK 5 \n")
    task5()
    println("\nTASK 6 \n")
    task6()
    println("\nTASK 7 \n")
    task7()
    println("\nTASK 8 \n")
    task8()
    println("\nTASK 9 \n")
    task9()
    println("\nTASK 10 \n")
    task10()
}


