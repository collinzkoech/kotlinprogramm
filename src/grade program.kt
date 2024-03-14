fun main() {
    println("Enter the mark (0 to 100): ")
    val mark = readLine()?.toIntOrNull()

    if (mark != null && mark in 0..100) {
        val grade = calculateGrade(mark)
        println("Grade: $grade")
    } else {
        println("Invalid input. Please enter a mark in the range of 0 to 100.")
    }
}

fun calculateGrade(mark: Int): Char {
    return when {
        mark >= 80 -> 'A'
        mark >= 70 -> 'B'
        mark >= 50 -> 'C'
        mark >= 40 -> 'D'
        else -> 'E'
    }
}
