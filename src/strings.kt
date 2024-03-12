fun main() {

    var greeting = "Hello world"
    var firstname = "Collins"
    var lastname = "koech"

    //string concatenation
    println(firstname + " " + lastname)
    println(firstname.plus(lastname))
    //Accessing an element in a string
    println(greeting[6])

    //Determine an index position of an element
    println(greeting.indexOf("world"))
    println(greeting.indexOf("H"))

    //Modifying a string
    println(greeting.uppercase())

    //String interpolation
    println("Hello there, my name is $firstname $lastname")

    //Size of a string
    println(greeting.length)
}