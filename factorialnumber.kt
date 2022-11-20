import java.util.Scanner

fun main() {
    var scan=Scanner(System.`in`)
    var factorial:Long=1

    println("Enter a Number:")
    var number=scan.nextInt()
    for(i in 1..number)
        factorial *= i

    println("Factorial of a number is: $factorial")
}