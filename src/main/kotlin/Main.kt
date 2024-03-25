fun main() {
 occurence("Barnie bakes brown bangels and buns")
    arr(arrayOf(5,8,2,9,7))
volume(7,3.14159)
palindrome("esther")
    palindrome("wow")
}
fun occurence(sentence:String){
 var p= sentence.removeSuffix("b")
    println(p)




}
fun arr(num:Array<Int>){
    var x= num.sum()
    println(x)
    var y= num.count()
    println(y)
    var s= num.average()
    println(s)
}
fun volume(radius:Int,n:Double){
    var d= radius*radius*radius
    var w=4/3*n*d
    println(w)

}
fun palindrome(word:String){
   var o = word.reversed()
    if (o==word){
        println(true)
    }
    else{
        println(false)
    }
    }





