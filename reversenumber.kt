fun main() {

    var reversing=24681
    var reverse=0

    while(reversing!=0){
        var digit=reversing%10
        reverse= (reverse * 10) + digit
        reversing /= 10

    }
    println("Reversed number: $reverse")
}