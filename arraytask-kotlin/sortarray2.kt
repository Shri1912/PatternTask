package arraytask

fun main(args: Array<String>) {
    val arr=arrayOf(9,4,1,7,3,5)
    println("The array after sorting:")
    arr.sortDescending()
    for(i in arr)
        print("$i ")
}