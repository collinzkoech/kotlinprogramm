fun main() {
    //Break statement
    for (x in 50..55){
        if (x == 54){
            break
        }
        println(x)
    }

    //Continue statement
    for (character in 'd'..'h'){
        if (character == 'e'){
            continue
        }
        println("Character is $character")
    }
}