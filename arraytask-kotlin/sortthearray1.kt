package arraytask

fun main(args: Array<String>) {
    val arr=arrayOf(7,1,2,9,4,3)
    println("The array after sorting:")
    arr.sort()
    for(i in arr)
        print("$i ")
}
