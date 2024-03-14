fun main() {
    //Predefined FUnctions
    println("Hello Kotlin")

    var x = Math.min(45,89)
    println(x)

    var y = Math.max(90,124)
    println("The maximum value is $y")

    var z = Math.round(43.98)
    println(z)

    name()
    product(12, 39)
    product(7,9)
    details("Joe",56)
}

fun name(){
    println("David")
}
fun product(num1:Int, num2:Int){
    println(num1 * num2)
}
fun details(name:String,age:Int){
    println("$name is $age years old")
}