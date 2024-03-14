fun main() {
    //While loop
    var number = 200
    while (number <= 205){
        println("Number is $number")
        number++
    }
    var number1 = 100
    while (number1 <= 95){
        println("number1 is $number1")
        number1++
    }

    //Do...while loop
    var num = 20
    do{
        println(num)
        num++
        }while(num <= 25)

    //for loop
    //no condition is necessary
    var furniture = arrayOf("Table","Chair","Desk")
    for(z in furniture)
        println(z)

    var marks = arrayOf(98,96,70,85,100)
    for (marks in marks )
        println("Mark is $marks")

    //Range
    for (number in 30..35){
        println(number)
    }
    for(letter in 'a'..'b'){
        println(letter)
    }

}