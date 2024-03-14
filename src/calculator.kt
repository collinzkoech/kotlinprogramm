fun add(x: Double, y: Double): Double {
    return x + y
}

fun subtract(x: Double, y: Double): Double {
    return x - y
}

fun multiply(x: Double, y: Double): Double {
    return x * y
}

fun divide(x: Double, y: Double): Double {
    if (y == 0.0) {
        throw IllegalArgumentException("Error! Division by zero.")
    } else {
        return x / y
    }
}

fun main() {
    println("Select operation:")
    println("1. Add")
    println("2. Subtract")
    println("3. Multiply")
    println("4. Divide")

    var choice: Int
    var num1: Double
    var num2: Double

    while (true) {
        print("Enter choice (1/2/3/4): ")
        choice = readLine()!!.toInt()

        if (choice in 1..4) {
            print("Enter first number: ")
            num1 = readLine()!!.toDouble()
            print("Enter second number: ")
            num2 = readLine()!!.toDouble()

            val result = when (choice) {
                1 -> add(num1, num2)
                2 -> subtract(num1, num2)
                3 -> multiply(num1, num2)
                4 -> divide(num1, num2)
                else -> throw IllegalArgumentException("Invalid operation")
            }
            println("Result: $result")
        } else {
            println("Invalid input")
        }

        print("Do you want to perform another calculation? (yes/no): ")
        val again = readLine()!!.toLowerCase()
        if (again != "yes") {
            break
        }
    }
}
