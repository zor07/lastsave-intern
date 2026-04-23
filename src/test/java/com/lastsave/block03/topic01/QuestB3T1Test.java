package com.lastsave.block03.topic01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuestB3T1Test {

    private QuestB3T1 quest;

    @BeforeEach
    void setUp() {
        quest = new QuestB3T1();
    }

    // --- getLength ---

    @Test
    void getLength_normalString() {
        assertEquals(5, quest.getLength("Hello"), "Метод getLength реализован некорректно. Проверь: getLength(\"Hello\")");
    }

    @Test
    void getLength_emptyString() {
        assertEquals(0, quest.getLength(""), "Метод getLength реализован некорректно. Проверь: getLength(\"\")");
    }

    @Test
    void getLength_singleChar() {
        assertEquals(1, quest.getLength("a"), "Метод getLength реализован некорректно. Проверь: getLength(\"a\")");
    }

    // --- getFirstChar ---

    @Test
    void getFirstChar_normalString() {
        assertEquals('H', quest.getFirstChar("Hello"), "Метод getFirstChar реализован некорректно. Проверь: getFirstChar(\"Hello\")");
    }

    @Test
    void getFirstChar_singleChar() {
        assertEquals('J', quest.getFirstChar("Java"), "Метод getFirstChar реализован некорректно. Проверь: getFirstChar(\"Java\")");
    }

    @Test
    void getFirstChar_emptyString() {
        assertEquals('\0', quest.getFirstChar(""), "Метод getFirstChar реализован некорректно. Проверь: getFirstChar(\"\")");
    }

    // --- getLastChar ---

    @Test
    void getLastChar_normalString() {
        assertEquals('o', quest.getLastChar("Hello"), "Метод getLastChar реализован некорректно. Проверь: getLastChar(\"Hello\")");
    }

    @Test
    void getLastChar_singleChar() {
        assertEquals('a', quest.getLastChar("Java"), "Метод getLastChar реализован некорректно. Проверь: getLastChar(\"Java\")");
    }

    @Test
    void getLastChar_emptyString() {
        assertEquals('\0', quest.getLastChar(""), "Метод getLastChar реализован некорректно. Проверь: getLastChar(\"\")");
    }

    // --- toUpper ---

    @Test
    void toUpper_lowercase() {
        assertEquals("HELLO", quest.toUpper("hello"), "Метод toUpper реализован некорректно. Проверь: toUpper(\"hello\")");
    }

    @Test
    void toUpper_mixedCase() {
        assertEquals("JAVA", quest.toUpper("Java"), "Метод toUpper реализован некорректно. Проверь: toUpper(\"Java\")");
    }

    @Test
    void toUpper_alreadyUpper() {
        assertEquals("WORLD", quest.toUpper("WORLD"), "Метод toUpper реализован некорректно. Проверь: toUpper(\"WORLD\")");
    }

    // --- containsSubstring ---

    @Test
    void containsSubstring_found() {
        assertTrue(quest.containsSubstring("Hello", "ell"), "Метод containsSubstring реализован некорректно. Проверь: containsSubstring(\"Hello\", \"ell\")");
    }

    @Test
    void containsSubstring_notFound() {
        assertFalse(quest.containsSubstring("Hello", "xyz"), "Метод containsSubstring реализован некорректно. Проверь: containsSubstring(\"Hello\", \"xyz\")");
    }

    @Test
    void containsSubstring_fullMatch() {
        assertTrue(quest.containsSubstring("Java", "Java"), "Метод containsSubstring реализован некорректно. Проверь: containsSubstring(\"Java\", \"Java\")");
    }

    // --- getSubstring ---

    @Test
    void getSubstring_middle() {
        assertEquals("el", quest.getSubstring("Hello", 1, 3), "Метод getSubstring реализован некорректно. Проверь: getSubstring(\"Hello\", 1, 3)");
    }

    @Test
    void getSubstring_fromStart() {
        assertEquals("Ja", quest.getSubstring("Java", 0, 2), "Метод getSubstring реализован некорректно. Проверь: getSubstring(\"Java\", 0, 2)");
    }

    @Test
    void getSubstring_toEnd() {
        assertEquals("rld", quest.getSubstring("World", 2, 5), "Метод getSubstring реализован некорректно. Проверь: getSubstring(\"World\", 2, 5)");
    }

    // --- trimSpaces ---

    @Test
    void trimSpaces_bothSides() {
        assertEquals("hello", quest.trimSpaces("  hello  "), "Метод trimSpaces реализован некорректно. Проверь: trimSpaces(\"  hello  \")");
    }

    @Test
    void trimSpaces_leftOnly() {
        assertEquals("Java", quest.trimSpaces(" Java"), "Метод trimSpaces реализован некорректно. Проверь: trimSpaces(\" Java\")");
    }

    @Test
    void trimSpaces_rightOnly() {
        assertEquals("world", quest.trimSpaces("world "), "Метод trimSpaces реализован некорректно. Проверь: trimSpaces(\"world \")");
    }

    @Test
    void trimSpaces_noSpaces() {
        assertEquals("hello", quest.trimSpaces("hello"), "Метод trimSpaces реализован некорректно. Проверь: trimSpaces(\"hello\")");
    }

    // --- equalsIgnoreCase ---

    @Test
    void equalsIgnoreCase_differentCase() {
        assertTrue(quest.equalsIgnoreCase("hello", "HELLO"), "Метод equalsIgnoreCase реализован некорректно. Проверь: equalsIgnoreCase(\"hello\", \"HELLO\")");
    }

    @Test
    void equalsIgnoreCase_mixedCase() {
        assertTrue(quest.equalsIgnoreCase("Java", "java"), "Метод equalsIgnoreCase реализован некорректно. Проверь: equalsIgnoreCase(\"Java\", \"java\")");
    }

    @Test
    void equalsIgnoreCase_differentStrings() {
        assertFalse(quest.equalsIgnoreCase("hello", "world"), "Метод equalsIgnoreCase реализован некорректно. Проверь: equalsIgnoreCase(\"hello\", \"world\")");
    }

    // --- hasPrefix ---

    @Test
    void hasPrefix_found() {
        assertTrue(quest.hasPrefix("Hello", "He"), "Метод hasPrefix реализован некорректно. Проверь: hasPrefix(\"Hello\", \"He\")");
    }

    @Test
    void hasPrefix_notFound() {
        assertFalse(quest.hasPrefix("World", "He"), "Метод hasPrefix реализован некорректно. Проверь: hasPrefix(\"World\", \"He\")");
    }

    @Test
    void hasPrefix_fullMatch() {
        assertTrue(quest.hasPrefix("Java", "Java"), "Метод hasPrefix реализован некорректно. Проверь: hasPrefix(\"Java\", \"Java\")");
    }

    // --- parseNumber ---

    @Test
    void parseNumber_positive() {
        assertEquals(42, quest.parseNumber("42"), "Метод parseNumber реализован некорректно. Проверь: parseNumber(\"42\")");
    }

    @Test
    void parseNumber_negative() {
        assertEquals(-7, quest.parseNumber("-7"), "Метод parseNumber реализован некорректно. Проверь: parseNumber(\"-7\")");
    }

    @Test
    void parseNumber_zero() {
        assertEquals(0, quest.parseNumber("0"), "Метод parseNumber реализован некорректно. Проверь: parseNumber(\"0\")");
    }
}
