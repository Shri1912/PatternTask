import java.util.Scanner

fun main() {
    var scan = Scanner(System.`in`)

    println("Enter the year: ")
    var year=scan.nextInt()
    if ((year%400==0)||((year%4==0) && (year%100!=0))){
        println("Year is Leap Year")
    }
    else{
        println("Year is Not a Leap Year")
    }
}