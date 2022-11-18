fun main() {
    var row =5
    var column=5
    for (i in 1..row)
    {
        for (j in 1..column){
            if(i==1||i==row||j==1||j==column){
                print("*"+" ")
            }
            else{
                print("  ")
            }

        }
        println()
    }
}