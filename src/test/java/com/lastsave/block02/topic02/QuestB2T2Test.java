package com.lastsave.block02.topic02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("block02.topic02")
class QuestB2T2Test {

    private QuestB2T2 quest;

    @BeforeEach
    void setUp() {
        quest = new QuestB2T2();
    }

    // --- getGrade ---

    @Test
    void getGrade_excellent() {
        assertEquals("Отлично", quest.getGrade(95), "Метод getGrade реализован некорректно. Проверь: getGrade(95)");
    }

    @Test
    void getGrade_excellentBoundary() {
        assertEquals("Отлично", quest.getGrade(90), "Метод getGrade реализован некорректно. Проверь: getGrade(90)");
    }

    @Test
    void getGrade_good() {
        assertEquals("Хорошо", quest.getGrade(75), "Метод getGrade реализован некорректно. Проверь: getGrade(75)");
    }

    @Test
    void getGrade_goodBoundary() {
        assertEquals("Хорошо", quest.getGrade(70), "Метод getGrade реализован некорректно. Проверь: getGrade(70)");
    }

    @Test
    void getGrade_satisfactory() {
        assertEquals("Удовлетворительно", quest.getGrade(55), "Метод getGrade реализован некорректно. Проверь: getGrade(55)");
    }

    @Test
    void getGrade_satisfactoryBoundary() {
        assertEquals("Удовлетворительно", quest.getGrade(50), "Метод getGrade реализован некорректно. Проверь: getGrade(50)");
    }

    @Test
    void getGrade_unsatisfactory() {
        assertEquals("Неудовлетворительно", quest.getGrade(30), "Метод getGrade реализован некорректно. Проверь: getGrade(30)");
    }

    @Test
    void getGrade_zero() {
        assertEquals("Неудовлетворительно", quest.getGrade(0), "Метод getGrade реализован некорректно. Проверь: getGrade(0)");
    }

    // --- sumUpTo ---

    @Test
    void sumUpTo_one() {
        assertEquals(1, quest.sumUpTo(1), "Метод sumUpTo реализован некорректно. Проверь: sumUpTo(1)");
    }

    @Test
    void sumUpTo_five() {
        assertEquals(15, quest.sumUpTo(5), "Метод sumUpTo реализован некорректно. Проверь: sumUpTo(5)");
    }

    @Test
    void sumUpTo_ten() {
        assertEquals(55, quest.sumUpTo(10), "Метод sumUpTo реализован некорректно. Проверь: sumUpTo(10)");
    }

    // --- factorial ---

    @Test
    void factorial_zero() {
        assertEquals(1, quest.factorial(0), "Метод factorial реализован некорректно. Проверь: factorial(0)");
    }

    @Test
    void factorial_one() {
        assertEquals(1, quest.factorial(1), "Метод factorial реализован некорректно. Проверь: factorial(1)");
    }

    @Test
    void factorial_five() {
        assertEquals(120, quest.factorial(5), "Метод factorial реализован некорректно. Проверь: factorial(5)");
    }

    @Test
    void factorial_ten() {
        assertEquals(3628800, quest.factorial(10), "Метод factorial реализован некорректно. Проверь: factorial(10)");
    }

    // --- isPrime ---

    @Test
    void isPrime_two() {
        assertTrue(quest.isPrime(2), "Метод isPrime реализован некорректно. Проверь: isPrime(2)");
    }

    @Test
    void isPrime_seven() {
        assertTrue(quest.isPrime(7), "Метод isPrime реализован некорректно. Проверь: isPrime(7)");
    }

    @Test
    void isPrime_compositeNumber() {
        assertFalse(quest.isPrime(9), "Метод isPrime реализован некорректно. Проверь: isPrime(9)");
    }

    @Test
    void isPrime_one() {
        assertFalse(quest.isPrime(1), "Метод isPrime реализован некорректно. Проверь: isPrime(1)");
    }

    @Test
    void isPrime_zero() {
        assertFalse(quest.isPrime(0), "Метод isPrime реализован некорректно. Проверь: isPrime(0)");
    }

    @Test
    void isPrime_largerPrime() {
        assertTrue(quest.isPrime(97), "Метод isPrime реализован некорректно. Проверь: isPrime(97)");
    }

    // --- countDigits ---

    @Test
    void countDigits_zero() {
        assertEquals(1, quest.countDigits(0), "Метод countDigits реализован некорректно. Проверь: countDigits(0)");
    }

    @Test
    void countDigits_singleDigit() {
        assertEquals(1, quest.countDigits(7), "Метод countDigits реализован некорректно. Проверь: countDigits(7)");
    }

    @Test
    void countDigits_twoDigits() {
        assertEquals(2, quest.countDigits(42), "Метод countDigits реализован некорректно. Проверь: countDigits(42)");
    }

    @Test
    void countDigits_fourDigits() {
        assertEquals(4, quest.countDigits(1000), "Метод countDigits реализован некорректно. Проверь: countDigits(1000)");
    }

    // --- sumEven ---

    @Test
    void sumEven_one() {
        assertEquals(0, quest.sumEven(1), "Метод sumEven реализован некорректно. Проверь: sumEven(1)");
    }

    @Test
    void sumEven_four() {
        assertEquals(6, quest.sumEven(4), "Метод sumEven реализован некорректно. Проверь: sumEven(4)");
    }

    @Test
    void sumEven_ten() {
        assertEquals(30, quest.sumEven(10), "Метод sumEven реализован некорректно. Проверь: sumEven(10)");
    }

    @Test
    void sumEven_oddUpperBound() {
        assertEquals(6, quest.sumEven(5), "Метод sumEven реализован некорректно. Проверь: sumEven(5)");
    }

    // --- power ---

    @Test
    void power_twoToThree() {
        assertEquals(8, quest.power(2, 3), "Метод power реализован некорректно. Проверь: power(2, 3)");
    }

    @Test
    void power_anyNumberToZero() {
        assertEquals(1, quest.power(5, 0), "Метод power реализован некорректно. Проверь: power(5, 0)");
    }

    @Test
    void power_threeToFour() {
        assertEquals(81, quest.power(3, 4), "Метод power реализован некорректно. Проверь: power(3, 4)");
    }

    @Test
    void power_oneToAnyPower() {
        assertEquals(1, quest.power(1, 100), "Метод power реализован некорректно. Проверь: power(1, 100)");
    }

    // --- gcd ---

    @Test
    void gcd_twelveAndEight() {
        assertEquals(4, quest.gcd(12, 8), "Метод gcd реализован некорректно. Проверь: gcd(12, 8)");
    }

    @Test
    void gcd_hundredAndSeventyFive() {
        assertEquals(25, quest.gcd(100, 75), "Метод gcd реализован некорректно. Проверь: gcd(100, 75)");
    }

    @Test
    void gcd_coprimeNumbers() {
        assertEquals(1, quest.gcd(7, 3), "Метод gcd реализован некорректно. Проверь: gcd(7, 3)");
    }

    @Test
    void gcd_sameNumbers() {
        assertEquals(6, quest.gcd(6, 6), "Метод gcd реализован некорректно. Проверь: gcd(6, 6)");
    }

    // --- sumOfDigits ---

    @Test
    void sumOfDigits_threeDigitNumber() {
        assertEquals(6, quest.sumOfDigits(123), "Метод sumOfDigits реализован некорректно. Проверь: sumOfDigits(123)");
    }

    @Test
    void sumOfDigits_allNines() {
        assertEquals(27, quest.sumOfDigits(999), "Метод sumOfDigits реализован некорректно. Проверь: sumOfDigits(999)");
    }

    @Test
    void sumOfDigits_withZeroDigit() {
        assertEquals(1, quest.sumOfDigits(10), "Метод sumOfDigits реализован некорректно. Проверь: sumOfDigits(10)");
    }

    @Test
    void sumOfDigits_singleDigit() {
        assertEquals(5, quest.sumOfDigits(5), "Метод sumOfDigits реализован некорректно. Проверь: sumOfDigits(5)");
    }

    // --- fibonacci ---

    @Test
    void fibonacci_zero() {
        assertEquals(0, quest.fibonacci(0), "Метод fibonacci реализован некорректно. Проверь: fibonacci(0)");
    }

    @Test
    void fibonacci_one() {
        assertEquals(1, quest.fibonacci(1), "Метод fibonacci реализован некорректно. Проверь: fibonacci(1)");
    }

    @Test
    void fibonacci_two() {
        assertEquals(1, quest.fibonacci(2), "Метод fibonacci реализован некорректно. Проверь: fibonacci(2)");
    }

    @Test
    void fibonacci_six() {
        assertEquals(8, quest.fibonacci(6), "Метод fibonacci реализован некорректно. Проверь: fibonacci(6)");
    }

    @Test
    void fibonacci_ten() {
        assertEquals(55, quest.fibonacci(10), "Метод fibonacci реализован некорректно. Проверь: fibonacci(10)");
    }
}
