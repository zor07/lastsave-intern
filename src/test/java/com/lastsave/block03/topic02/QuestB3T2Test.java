package com.lastsave.block03.topic02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("block03.topic02")
class QuestB3T2Test {

    private QuestB3T2 quest;

    @BeforeEach
    void setUp() {
        quest = new QuestB3T2();
    }

    // --- join ---

    @Test
    void join_twoWords() {
        assertEquals("HelloWorld", quest.join(new String[]{"Hello", "World"}), "Метод join реализован некорректно. Проверь: join([\"Hello\", \"World\"])");
    }

    @Test
    void join_threeWords() {
        assertEquals("abc", quest.join(new String[]{"a", "b", "c"}), "Метод join реализован некорректно. Проверь: join([\"a\", \"b\", \"c\"])");
    }

    @Test
    void join_singleWord() {
        assertEquals("one", quest.join(new String[]{"one"}), "Метод join реализован некорректно. Проверь: join([\"one\"])");
    }

    // --- joinWithSeparator ---

    @Test
    void joinWithSeparator_commaSeparator() {
        assertEquals("a, b, c", quest.joinWithSeparator(new String[]{"a", "b", "c"}, ", "), "Метод joinWithSeparator реализован некорректно. Проверь: joinWithSeparator([\"a\", \"b\", \"c\"], \", \")");
    }

    @Test
    void joinWithSeparator_spaceSeparator() {
        assertEquals("Hello World", quest.joinWithSeparator(new String[]{"Hello", "World"}, " "), "Метод joinWithSeparator реализован некорректно. Проверь: joinWithSeparator([\"Hello\", \"World\"], \" \")");
    }

    @Test
    void joinWithSeparator_singleWord() {
        assertEquals("one", quest.joinWithSeparator(new String[]{"one"}, "-"), "Метод joinWithSeparator реализован некорректно. Проверь: joinWithSeparator([\"one\"], \"-\")");
    }

    // --- repeat ---

    @Test
    void repeat_threeTimess() {
        assertEquals("ababab", quest.repeat("ab", 3), "Метод repeat реализован некорректно. Проверь: repeat(\"ab\", 3)");
    }

    @Test
    void repeat_fiveTimes() {
        assertEquals("xxxxx", quest.repeat("x", 5), "Метод repeat реализован некорректно. Проверь: repeat(\"x\", 5)");
    }

    @Test
    void repeat_once() {
        assertEquals("hi", quest.repeat("hi", 1), "Метод repeat реализован некорректно. Проверь: repeat(\"hi\", 1)");
    }

    // --- reverse ---

    @Test
    void reverse_normalString() {
        assertEquals("olleH", quest.reverse("Hello"), "Метод reverse реализован некорректно. Проверь: reverse(\"Hello\")");
    }

    @Test
    void reverse_fourChars() {
        assertEquals("avaJ", quest.reverse("Java"), "Метод reverse реализован некорректно. Проверь: reverse(\"Java\")");
    }

    @Test
    void reverse_singleChar() {
        assertEquals("a", quest.reverse("a"), "Метод reverse реализован некорректно. Проверь: reverse(\"a\")");
    }

    // --- charCount ---

    @Test
    void charCount_normalString() {
        assertEquals("Символов: 5", quest.charCount("Hello"), "Метод charCount реализован некорректно. Проверь: charCount(\"Hello\")");
    }

    @Test
    void charCount_emptyString() {
        assertEquals("Символов: 0", quest.charCount(""), "Метод charCount реализован некорректно. Проверь: charCount(\"\")");
    }

    @Test
    void charCount_twoChars() {
        assertEquals("Символов: 2", quest.charCount("ab"), "Метод charCount реализован некорректно. Проверь: charCount(\"ab\")");
    }
}
