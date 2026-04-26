package com.lastsave.block04.topic01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("block4.topic1")
class QuestB4T1Test {

    private QuestB4T1 quest;

    @BeforeEach
    void setUp() {
        quest = new QuestB4T1();
    }

    // --- getFirstEven ---

    @Test
    void getFirstEven_evenInMiddle() {
        assertEquals(4, quest.getFirstEven(new int[]{1, 3, 4, 6}), "Метод getFirstEven реализован некорректно. Проверь: getFirstEven([1, 3, 4, 6])");
    }

    @Test
    void getFirstEven_evenFirst() {
        assertEquals(2, quest.getFirstEven(new int[]{2, 5, 7}), "Метод getFirstEven реализован некорректно. Проверь: getFirstEven([2, 5, 7])");
    }

    @Test
    void getFirstEven_noEven() {
        assertEquals(0, quest.getFirstEven(new int[]{1, 3, 5}), "Метод getFirstEven реализован некорректно. Проверь: getFirstEven([1, 3, 5])");
    }

    // --- getLast ---

    @Test
    void getLast_multipleElements() {
        assertEquals(30, quest.getLast(new int[]{10, 20, 30}), "Метод getLast реализован некорректно. Проверь: getLast([10, 20, 30])");
    }

    @Test
    void getLast_singleElement() {
        assertEquals(5, quest.getLast(new int[]{5}), "Метод getLast реализован некорректно. Проверь: getLast([5])");
    }

    @Test
    void getLast_twoElements() {
        assertEquals(2, quest.getLast(new int[]{0, 1, 2}), "Метод getLast реализован некорректно. Проверь: getLast([0, 1, 2])");
    }

    @Test
    void getLast_emptyArray() {
        assertEquals(0, quest.getLast(new int[]{}), "Метод getLast реализован некорректно. Проверь: getLast([])");
    }

    // --- sum ---

    @Test
    void sum_fiveElements() {
        assertEquals(15, quest.sum(new int[]{1, 2, 3, 4, 5}), "Метод sum реализован некорректно. Проверь: sum([1, 2, 3, 4, 5])");
    }

    @Test
    void sum_twoElements() {
        assertEquals(30, quest.sum(new int[]{10, 20}), "Метод sum реализован некорректно. Проверь: sum([10, 20])");
    }

    @Test
    void sum_allZeros() {
        assertEquals(0, quest.sum(new int[]{0, 0, 0}), "Метод sum реализован некорректно. Проверь: sum([0, 0, 0])");
    }

    // --- min ---

    @Test
    void min_duplicateMin() {
        assertEquals(1, quest.min(new int[]{3, 1, 4, 1, 5}), "Метод min реализован некорректно. Проверь: min([3, 1, 4, 1, 5])");
    }

    @Test
    void min_minAtEnd() {
        assertEquals(5, quest.min(new int[]{10, 20, 5}), "Метод min реализован некорректно. Проверь: min([10, 20, 5])");
    }

    @Test
    void min_singleElement() {
        assertEquals(7, quest.min(new int[]{7}), "Метод min реализован некорректно. Проверь: min([7])");
    }

    // --- average ---

    @Test
    void average_threeElements() {
        assertEquals(2.0, quest.average(new int[]{1, 2, 3}), "Метод average реализован некорректно. Проверь: average([1, 2, 3])");
    }

    @Test
    void average_twoElements() {
        assertEquals(15.0, quest.average(new int[]{10, 20}), "Метод average реализован некорректно. Проверь: average([10, 20])");
    }

    @Test
    void average_singleElement() {
        assertEquals(5.0, quest.average(new int[]{5}), "Метод average реализован некорректно. Проверь: average([5])");
    }

    // --- contains ---

    @Test
    void contains_elementFound() {
        assertTrue(quest.contains(new int[]{1, 2, 3}, 2), "Метод contains реализован некорректно. Проверь: contains([1, 2, 3], 2)");
    }

    @Test
    void contains_elementNotFound() {
        assertFalse(quest.contains(new int[]{1, 2, 3}, 5), "Метод contains реализован некорректно. Проверь: contains([1, 2, 3], 5)");
    }

    @Test
    void contains_singleElement() {
        assertTrue(quest.contains(new int[]{7}, 7), "Метод contains реализован некорректно. Проверь: contains([7], 7)");
    }

    // --- countEven ---

    @Test
    void countEven_twoEven() {
        assertEquals(2, quest.countEven(new int[]{1, 2, 3, 4}), "Метод countEven реализован некорректно. Проверь: countEven([1, 2, 3, 4])");
    }

    @Test
    void countEven_noEven() {
        assertEquals(0, quest.countEven(new int[]{1, 3, 5}), "Метод countEven реализован некорректно. Проверь: countEven([1, 3, 5])");
    }

    @Test
    void countEven_allEven() {
        assertEquals(3, quest.countEven(new int[]{2, 4, 6}), "Метод countEven реализован некорректно. Проверь: countEven([2, 4, 6])");
    }

    // --- sumEven ---

    @Test
    void sumEven_mixedElements() {
        assertEquals(6, quest.sumEven(new int[]{1, 2, 3, 4}), "Метод sumEven реализован некорректно. Проверь: sumEven([1, 2, 3, 4])");
    }

    @Test
    void sumEven_noEven() {
        assertEquals(0, quest.sumEven(new int[]{1, 3, 5}), "Метод sumEven реализован некорректно. Проверь: sumEven([1, 3, 5])");
    }

    @Test
    void sumEven_allEven() {
        assertEquals(12, quest.sumEven(new int[]{2, 4, 6}), "Метод sumEven реализован некорректно. Проверь: sumEven([2, 4, 6])");
    }

    // --- reverse ---

    @Test
    void reverse_threeElements() {
        assertArrayEquals(new int[]{3, 2, 1}, quest.reverse(new int[]{1, 2, 3}), "Метод reverse реализован некорректно. Проверь: reverse([1, 2, 3])");
    }

    @Test
    void reverse_twoElements() {
        assertArrayEquals(new int[]{20, 10}, quest.reverse(new int[]{10, 20}), "Метод reverse реализован некорректно. Проверь: reverse([10, 20])");
    }

    @Test
    void reverse_singleElement() {
        assertArrayEquals(new int[]{5}, quest.reverse(new int[]{5}), "Метод reverse реализован некорректно. Проверь: reverse([5])");
    }

    // --- copy ---

    @Test
    void copy_threeElements() {
        assertArrayEquals(new int[]{1, 2, 3}, quest.copy(new int[]{1, 2, 3}), "Метод copy реализован некорректно. Проверь: copy([1, 2, 3])");
    }

    @Test
    void copy_singleElement() {
        assertArrayEquals(new int[]{10}, quest.copy(new int[]{10}), "Метод copy реализован некорректно. Проверь: copy([10])");
    }

    @Test
    void copy_allZeros() {
        assertArrayEquals(new int[]{0, 0}, quest.copy(new int[]{0, 0}), "Метод copy реализован некорректно. Проверь: copy([0, 0])");
    }
}
