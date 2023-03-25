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
            val sc = Scanner(`in`)

            println("Write year to check century: ")
            val year = sc.nextInt()

            if(year <= 0)
             println("0 and negative is not allow "
                     + "for a year")
            if(year <= 100)
               println("1st century\n")



        }
fun main(){

        }
