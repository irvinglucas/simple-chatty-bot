fun main() {
    // write your code here
    val startInterval = readln().toInt()
    val stopInterval = readln().toInt()

    for (number in startInterval..stopInterval) {
        if (number % 3 == 0 && number % 5 == 0) println("FizzBuzz")
        else if (number % 3 == 0) println("Fizz")
        else if (number % 5 == 0) println("Buzz")
        else println(number)
    }
}