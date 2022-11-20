fun main() {
    var number=2002
    var reversedNumber=0
    var remainder:Int
    var originalNumber=number

    while(number!=0){
        remainder=number%10
        reversedNumber=reversedNumber*10+remainder
        number/=10
    }

    if(originalNumber==reversedNumber)
        println("$originalNumber is palindrome number")
    else
        println("$originalNumber is not palindrome number")
}