package com.group.libraryapp.calculator

fun main() {
    val calculatorTest = CalculatorTest()
    calculatorTest.addTest()
    calculatorTest.minusTest()
    calculatorTest.multiply()
    calculatorTest.divideTest()
    calculatorTest.divideExceptionTest()
}

class CalculatorTest {

    fun addTest() {
        //given
        val calculator = Calculator(5)

        //when
        calculator.add(3)

        //then
        if (calculator.number != 8) {
            throw IllegalStateException()
        }

//        val expectedCalculator = Calculator(8)
//        if (calculator != expectedCalculator) {
//            throw IllegalArgumentException()
//        }
    }

    fun minusTest() {
        //given
        val calculator = Calculator(5)

        //when
        calculator.minus(3)

        //then
        if (calculator.number != 2) {
            throw IllegalStateException()
        }
    }

    fun multiply() {
        //given
        val calculator = Calculator(5)

        //when
        calculator.multiply(3)

        //then
        if (calculator.number != 15) {
            throw IllegalStateException()
        }
    }

    fun divideTest() {
        //given
        val calculator = Calculator(5)

        //when
        calculator.divide(2)

        //then
        if (calculator.number != 2) {
            throw IllegalStateException()
        }
    }

    fun divideExceptionTest() {
        //given
        val calculator = Calculator(5)

        //when
        try {
            calculator.divide(0)
        } catch (e: IllegalArgumentException) {
            if (e.message != "You can't divide by 0") {
                throw IllegalStateException("메세지가 다릅니다")
            }
            return
        } catch (e: Exception) {
            throw IllegalStateException()
        }

        throw IllegalStateException("기대하는 예외가 발생하지 않았습니다.")
    }

}