fun main() {
    // put your code here
    val startRange = readln().toInt()
    val stopRange = readln().toInt()
    val number = readln().toInt()

    var divisibleNumbers = 0

    for (i in startRange..stopRange) {
        if (i % number == 0) divisibleNumbers++
    }

    println(divisibleNumbers)
}