package challenges

class SafeDivision {

    fun divide(dividend: Int?, divisor: Int?): Int {
        this.validateArguments(dividend, divisor);
        return dividend!! / divisor!!
    }

    private fun validateArguments(dividend: Int?, divisor: Int?) {
        if (divisor == null || dividend == null || divisor == 0) {
            throw IllegalArgumentException("Invalid arguments")
        }
    }
}