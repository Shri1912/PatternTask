fun main() {
    var first='A'
    var last='C'
    for (i in 1..3)
    {
        for (j in 1..i){
            print("${first+i-1} ")
        }
        println()
    }
}