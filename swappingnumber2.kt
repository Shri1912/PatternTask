fun main() {

    var num1=20
    var num2=40

    println("----Before Swapping----")
    println("Number 1: $num1")
    println("Number 2: $num2")

    num1 += num2
    num2=num1-num2
    num1 -= num2

    println("----After Swapping----")
    println("Number 1: $num1")
    println("Number 2: $num2")
}