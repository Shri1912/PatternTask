fun main() {
    var number=153
    var initialNumber=number
    var remainder:Int
    var result=0

    while(initialNumber!=0){
        remainder=initialNumber%10
        result+=Math.pow(remainder.toDouble(),3.0).toInt()
        initialNumber/=10
    }

    if(result==number)
        println("$number is an Armstrong Number")
    else
        println("$number is not an Armstrong Number")
}