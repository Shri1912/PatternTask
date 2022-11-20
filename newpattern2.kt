fun main() {
    for (i in 1..5){
        var c=i
        for(j in 1..i){
            print("$c ")
            c -= 1
        }
        println()
    }
}