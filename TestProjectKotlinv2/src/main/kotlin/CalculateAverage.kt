fun calculateAverage(numbersCal: IntArray): Double {
    val sum = numbersCal.sum()
    return sum.toDouble() / numbersCal.size
}
