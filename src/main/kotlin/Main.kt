
fun solve (a: Double, b: Double, operator: Char): Double {
    return when (operator) {
        '*' -> a * b
        '+' -> a + b
        '-' -> a - b
        '/' -> {
            if (b != 0.0) {
                a / b
            } else {
                throw IllegalArgumentException("Cannot divide by zero.")
            }
        }
        else -> throw IllegalArgumentException("Invalid operator: $operator")
    }
}

fun main() {
    val num1 = 10.0
    val num2 = 5.0
    val operator = '+'
    // Change this character to *, +, -.

    if {
        val result = solve (num1, num2, operator)
        println("Result: $result")
    } catch (e: IllegalArgumentException) {
        println("Error: ${e.message}")
    }
}