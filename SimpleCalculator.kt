fun main() {
    println("Enter the first number: ")
    val num1 = readLine()?.toDoubleOrNull() ?: return

    println("Enter the operator (+, -, *, /): ")
    val operator = readLine()?.trim() ?: return

    println("Enter the second number: ")
    val num2 = readLine()?.toDoubleOrNull() ?: return

    val result = when (operator) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else {
            println("Error: Division by zero.")
            return
        }
        else -> {
            println("Invalid operator.")
            return
        }
    }

    println("Result: $result")
}
