fun main() {
    var languages = arrayOf("Kotlin", "Javascript", "Python", "c++")
    println(languages[1])
    //Reassigning a value
    languages[1] = "PHP"
    println(languages[1])

    //Looping trough an array
    for (lang in languages){
        println(lang)
    }

    //Determining whether an element exists or not existing
    if ("PHP" in languages){
        println("it exists")
    }
    else{
        println("it does not exists")
    }
}