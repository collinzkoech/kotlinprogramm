import java.util.Scanner

fun main() {
    var reader = Scanner(System.`in`)

    print("Enter  room temperature :")
   var temperature = reader.nextInt()


    if (temperature < 25){
        println("It is cold")
    }
    else{
        print("It is hot")
    }

}