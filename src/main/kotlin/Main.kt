fun main() {

    arrNums(arrayOf(21,17,42,45,12))
    volume(5.9)
   isPalindrome(arrayOf("madam, wow, kayak "))
    printOut(arrayOf("Barnie bakes brown bagels and buns"))
}
//Write and invoke a function that given the string “Barnie bakes brown bagels
//and buns” prints out a list of all the other words and characters making up the
//string excluding all possible occurrences of the letter b.

fun printOut(wordArray: Array<String>){
 for (word in wordArray) {
     word.replace("b " ," ")
    }
println(wordArray.contentToString())
}


//Write and invoke one function that takes in an array of integers and returns
//these 3 values: sum, count and average of all the elements.

fun arrNums(array: Array<Int>){
    var sum = array.sum()
    println(sum)
    var countElement = array.count()
    println(countElement)
     var ave = array.average()
    println(ave)
}
//The volume of a sphere is calculated using the formula below
//V = 4/3 π r
//3
//Write and invoke a function that is capable of accurately calculating the
//volume of any sphere given its radius. Use 3.14159 as π

fun volume(radius:Double){
    var vol = 4 /3 * 3.14159
    var area = vol * radius *radius * radius
    println(area)
}
//A palindrome is a string that reads the same forwards and backwards e.g
//madam, wow, kayak. Write and invoke a function:
//isPalindrome(word: String): Boolean
//that takes in a single word and returns true or false depending on whether the
//word is a palindrome.


fun isPalindrome(wordArray: Array<String>):Boolean{
     var check = wordArray

    if ( wordArray == check)
    { (isPalindrome(arrayOf("madam, wow, kayak")) )
    } else {
        return false
    }
    return false



}