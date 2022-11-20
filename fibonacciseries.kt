//import java.util.Scanner

//fun main() {
    //var scan=Scanner(System.`in`)
    //var first=0
    //var second=1

    //println("Enter a number:")
    //var third=scan.nextLong()
    //println("Fibonacci series of $third terms:")
    //for(i in 1..third) {

        //print("$first  ")

        //var next = first + second
        //first = second
        //second = next
    //}
//}

fun main() {
    var term1=0
    var term2=1
    var count=10

    println("Fibonacci series of $count terms: ")
    for(i in 1..count){
        print("$term1 ")

        var sum=term1+term2
        term1=term2
        term2=sum
    }
}