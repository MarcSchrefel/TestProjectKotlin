fun calculateAverage(numbers: IntArray): Double {
    val sum = numbers.sum()
    return sum.toDouble() / numbers.size
}
