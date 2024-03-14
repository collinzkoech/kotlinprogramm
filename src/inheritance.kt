//Parent class/Super class/Base class
open class Animal{
    var Age = 2
    var gender= "female"

    fun move(movement:String){
        println("Animal is $movement")
    }
}
//Child class/Sub class/Derived class
 open class Duck:Animal(){
    var color="white"
    fun sound(){
        println("Duck is quaking")
    }
}
class Fish:Duck(){
    var hasScales= true
    var hasFins= true

    fun eat(){
        println("Fish is swallowing")
    }

}

fun main() {
    var a = Animal()

    var d = Duck()
    println(d.gender)
    d.move("swim")

    var nileperch = Fish()


}