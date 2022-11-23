package arraytask

fun main(args: Array<String>) {
    var array= arrayOf(2,8,5,7,3)

    array.sort()

    println("The smallest number in array: ${array.first()}")
    println("The largest number in array: ${array.last()}")
}