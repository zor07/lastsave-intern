package com.lastsave.block02.topic01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("block02.topic01")
class QuestB2T1Test {

    private QuestB2T1 quest;

    @BeforeEach
    void setUp() {
        quest = new QuestB2T1();
    }

    // --- sum ---

    @Test
    void sum_twoPositiveNumbers() {
        assertEquals(8, quest.sum(3, 5), "Метод sum реализован некорректно. Проверь: sum(3, 5)");
    }

    @Test
    void sum_withNegativeNumber() {
        assertEquals(5, quest.sum(-2, 7), "Метод sum реализован некорректно. Проверь: sum(-2, 7)");
    }

    @Test
    void sum_twoZeros() {
        assertEquals(0, quest.sum(0, 0), "Метод sum реализован некорректно. Проверь: sum(0, 0)");
    }

    @Test
    void sum_twoNegativeNumbers() {
        assertEquals(-9, quest.sum(-4, -5), "Метод sum реализован некорректно. Проверь: sum(-4, -5)");
    }

    // --- minutesFromSeconds ---

    @Test
    void minutesFromSeconds_exactMinute() {
        assertEquals(2, quest.minutesFromSeconds(120), "Метод minutesFromSeconds реализован некорректно. Проверь: minutesFromSeconds(120)");
    }

    @Test
    void minutesFromSeconds_lessThanMinute() {
        assertEquals(0, quest.minutesFromSeconds(59), "Метод minutesFromSeconds реализован некорректно. Проверь: minutesFromSeconds(59)");
    }

    @Test
    void minutesFromSeconds_withRemainder() {
        assertEquals(1, quest.minutesFromSeconds(90), "Метод minutesFromSeconds реализован некорректно. Проверь: minutesFromSeconds(90)");
    }

    // --- isEven ---

    @Test
    void isEven_evenNumber() {
        assertTrue(quest.isEven(4), "Метод isEven реализован некорректно. Проверь: isEven(4)");
    }

    @Test
    void isEven_oddNumber() {
        assertFalse(quest.isEven(7), "Метод isEven реализован некорректно. Проверь: isEven(7)");
    }

    @Test
    void isEven_zero() {
        assertTrue(quest.isEven(0), "Метод isEven реализован некорректно. Проверь: isEven(0)");
    }

    @Test
    void isEven_negativeEven() {
        assertTrue(quest.isEven(-6), "Метод isEven реализован некорректно. Проверь: isEven(-6)");
    }

    @Test
    void isEven_negativeOdd() {
        assertFalse(quest.isEven(-3), "Метод isEven реализован некорректно. Проверь: isEven(-3)");
    }

    // --- celsiusToFahrenheit ---

    @Test
    void celsiusToFahrenheit_freezingPoint() {
        assertEquals(32.0, quest.celsiusToFahrenheit(0.0), 0.001, "Метод celsiusToFahrenheit реализован некорректно. Проверь: celsiusToFahrenheit(0.0)");
    }

    @Test
    void celsiusToFahrenheit_boilingPoint() {
        assertEquals(212.0, quest.celsiusToFahrenheit(100.0), 0.001, "Метод celsiusToFahrenheit реализован некорректно. Проверь: celsiusToFahrenheit(100.0)");
    }

    @Test
    void celsiusToFahrenheit_negativeFortyIsEqual() {
        assertEquals(-40.0, quest.celsiusToFahrenheit(-40.0), 0.001, "Метод celsiusToFahrenheit реализован некорректно. Проверь: celsiusToFahrenheit(-40.0)");
    }

    // --- isAdult ---

    @Test
    void isAdult_exactlyEighteen() {
        assertTrue(quest.isAdult(18), "Метод isAdult реализован некорректно. Проверь: isAdult(18)");
    }

    @Test
    void isAdult_seventeen() {
        assertFalse(quest.isAdult(17), "Метод isAdult реализован некорректно. Проверь: isAdult(17)");
    }

    @Test
    void isAdult_adult() {
        assertTrue(quest.isAdult(25), "Метод isAdult реализован некорректно. Проверь: isAdult(25)");
    }

    @Test
    void isAdult_zero() {
        assertFalse(quest.isAdult(0), "Метод isAdult реализован некорректно. Проверь: isAdult(0)");
    }

    // --- max ---

    @Test
    void max_firstIsLarger() {
        assertEquals(10, quest.max(10, 2), "Метод max реализован некорректно. Проверь: max(10, 2)");
    }

    @Test
    void max_secondIsLarger() {
        assertEquals(7, quest.max(3, 7), "Метод max реализован некорректно. Проверь: max(3, 7)");
    }

    @Test
    void max_equalNumbers() {
        assertEquals(5, quest.max(5, 5), "Метод max реализован некорректно. Проверь: max(5, 5)");
    }

    @Test
    void max_withNegatives() {
        assertEquals(-1, quest.max(-1, -5), "Метод max реализован некорректно. Проверь: max(-1, -5)");
    }

    // --- absValue ---

    @Test
    void absValue_negative() {
        assertEquals(5, quest.absValue(-5), "Метод absValue реализован некорректно. Проверь: absValue(-5)");
    }

    @Test
    void absValue_positive() {
        assertEquals(3, quest.absValue(3), "Метод absValue реализован некорректно. Проверь: absValue(3)");
    }

    @Test
    void absValue_zero() {
        assertEquals(0, quest.absValue(0), "Метод absValue реализован некорректно. Проверь: absValue(0)");
    }

    // --- isInRange ---

    @Test
    void isInRange_valueInside() {
        assertTrue(quest.isInRange(5, 1, 10), "Метод isInRange реализован некорректно. Проверь: isInRange(5, 1, 10)");
    }

    @Test
    void isInRange_valueAtMin() {
        assertTrue(quest.isInRange(1, 1, 10), "Метод isInRange реализован некорректно. Проверь: isInRange(1, 1, 10)");
    }

    @Test
    void isInRange_valueAtMax() {
        assertTrue(quest.isInRange(10, 1, 10), "Метод isInRange реализован некорректно. Проверь: isInRange(10, 1, 10)");
    }

    @Test
    void isInRange_valueBelowMin() {
        assertFalse(quest.isInRange(0, 1, 10), "Метод isInRange реализован некорректно. Проверь: isInRange(0, 1, 10)");
    }

    @Test
    void isInRange_valueAboveMax() {
        assertFalse(quest.isInRange(11, 1, 10), "Метод isInRange реализован некорректно. Проверь: isInRange(11, 1, 10)");
    }

    // --- average ---

    @Test
    void average_evenResult() {
        assertEquals(5.0, quest.average(3, 7), 0.001, "Метод average реализован некорректно. Проверь: average(3, 7)");
    }

    @Test
    void average_fractionalResult() {
        assertEquals(1.5, quest.average(1, 2), 0.001, "Метод average реализован некорректно. Проверь: average(1, 2)");
    }

    @Test
    void average_zeros() {
        assertEquals(0.0, quest.average(0, 0), 0.001, "Метод average реализован некорректно. Проверь: average(0, 0)");
    }

    @Test
    void average_negativeAndPositive() {
        assertEquals(0.0, quest.average(-5, 5), 0.001, "Метод average реализован некорректно. Проверь: average(-5, 5)");
    }

    // --- hoursFromSeconds ---

    @Test
    void hoursFromSeconds_exactHour() {
        assertEquals(1, quest.hoursFromSeconds(3600), "Метод hoursFromSeconds реализован некорректно. Проверь: hoursFromSeconds(3600)");
    }

    @Test
    void hoursFromSeconds_lessThanHour() {
        assertEquals(0, quest.hoursFromSeconds(100), "Метод hoursFromSeconds реализован некорректно. Проверь: hoursFromSeconds(100)");
    }

    @Test
    void hoursFromSeconds_withRemainder() {
        assertEquals(1, quest.hoursFromSeconds(5400), "Метод hoursFromSeconds реализован некорректно. Проверь: hoursFromSeconds(5400)");
    }

    @Test
    void hoursFromSeconds_twoHours() {
        assertEquals(2, quest.hoursFromSeconds(7200), "Метод hoursFromSeconds реализован некорректно. Проверь: hoursFromSeconds(7200)");
    }
}
