fun main() {

    val numberOfLoops = readln().toInt()
    var longestSequence = 0
    var currentSequence = 0
    var lastNumber = 0
    var input: Int

    for (i in 1..numberOfLoops) {
        // println("longest: $longestSequence | current: $currentSequence | last: $lastNumber")
        input = readln().toInt()
        if (input >= lastNumber) {
            currentSequence++
            lastNumber = input

            if (currentSequence > longestSequence) longestSequence = currentSequence
        } else {
            // when the input is less than last number, reset current sequence to 1 and
            // last number now will be input
            currentSequence = 1
            lastNumber = input
        }
    }
    println(longestSequence)
}