package com.lastsave.block03.topic01;

public class QuestB3T1 {

    /**
     * Реализуй метод, который возвращает длину строки.
     * <p>Примеры:</p>
     * <ul>
     *   <li>{@code getLength("Hello")} → {@code 5}</li>
     *   <li>{@code getLength("")} → {@code 0}</li>
     * </ul>
     *
     * @param s входная строка
     * @return длина строки
     */
    public int getLength(String s) {
        // TODO: напиши тут свой код
        return 0;
    }

    /**
     * Реализуй метод, который возвращает первый символ строки.
     * <p>Если строка пустая — вернуть {@code '\0'}.</p>
     * <p>Примеры:</p>
     * <ul>
     *   <li>{@code getFirstChar("Hello")} → {@code 'H'}</li>
     *   <li>{@code getFirstChar("")} → {@code '\0'}</li>
     * </ul>
     *
     * @param s входная строка
     * @return первый символ или {@code '\0'} если строка пустая
     */
    public char getFirstChar(String s) {
        // TODO: напиши тут свой код
        return '\0';
    }

    /**
     * Реализуй метод, который возвращает последний символ строки.
     * <p>Если строка пустая — вернуть {@code '\0'}.</p>
     * <p>Примеры:</p>
     * <ul>
     *   <li>{@code getLastChar("Hello")} → {@code 'o'}</li>
     *   <li>{@code getLastChar("")} → {@code '\0'}</li>
     * </ul>
     *
     * @param s входная строка
     * @return последний символ или {@code '\0'} если строка пустая
     */
    public char getLastChar(String s) {
        // TODO: напиши тут свой код
        return '\0';
    }

    /**
     * Реализуй метод, который возвращает строку в верхнем регистре.
     * <p>Примеры:</p>
     * <ul>
     *   <li>{@code toUpper("hello")} → {@code "HELLO"}</li>
     *   <li>{@code toUpper("Java")} → {@code "JAVA"}</li>
     * </ul>
     *
     * @param s входная строка
     * @return строка в верхнем регистре
     */
    public String toUpper(String s) {
        // TODO: напиши тут свой код
        return null;
    }

    /**
     * Реализуй метод, который возвращает {@code true} если строка содержит подстроку {@code sub}.
     * <p>Примеры:</p>
     * <ul>
     *   <li>{@code containsSubstring("Hello", "ell")} → {@code true}</li>
     *   <li>{@code containsSubstring("Hello", "xyz")} → {@code false}</li>
     * </ul>
     *
     * @param s   входная строка
     * @param sub искомая подстрока
     * @return {@code true} если {@code sub} содержится в {@code s}
     */
    public boolean containsSubstring(String s, String sub) {
        // TODO: напиши тут свой код
        return false;
    }

    /**
     * Реализуй метод, который возвращает подстроку от индекса {@code from} до индекса {@code to} не включительно.
     * <p>Примеры:</p>
     * <ul>
     *   <li>{@code getSubstring("Hello", 1, 3)} → {@code "el"}</li>
     *   <li>{@code getSubstring("World", 2, 5)} → {@code "rld"}</li>
     * </ul>
     *
     * @param s    входная строка
     * @param from начальный индекс включительно
     * @param to   конечный индекс не включительно
     * @return подстрока
     */
    public String getSubstring(String s, int from, int to) {
        // TODO: напиши тут свой код
        return null;
    }

    /**
     * Реализуй метод, который возвращает строку без пробелов по краям.
     * <p>Примеры:</p>
     * <ul>
     *   <li>{@code trimSpaces("  hello  ")} → {@code "hello"}</li>
     *   <li>{@code trimSpaces(" Java")} → {@code "Java"}</li>
     * </ul>
     *
     * @param s входная строка
     * @return строка без пробелов по краям
     */
    public String trimSpaces(String s) {
        // TODO: напиши тут свой код
        return null;
    }

    /**
     * Реализуй метод, который возвращает {@code true} если строки равны без учёта регистра.
     * <p>Примеры:</p>
     * <ul>
     *   <li>{@code equalsIgnoreCase("hello", "HELLO")} → {@code true}</li>
     *   <li>{@code equalsIgnoreCase("hello", "world")} → {@code false}</li>
     * </ul>
     *
     * @param a первая строка
     * @param b вторая строка
     * @return {@code true} если строки равны без учёта регистра
     */
    public boolean equalsIgnoreCase(String a, String b) {
        // TODO: напиши тут свой код
        return false;
    }

    /**
     * Реализуй метод, который возвращает {@code true} если строка начинается с {@code prefix}.
     * <p>Примеры:</p>
     * <ul>
     *   <li>{@code hasPrefix("Hello", "He")} → {@code true}</li>
     *   <li>{@code hasPrefix("World", "He")} → {@code false}</li>
     * </ul>
     *
     * @param s      входная строка
     * @param prefix искомый префикс
     * @return {@code true} если строка начинается с {@code prefix}
     */
    public boolean hasPrefix(String s, String prefix) {
        // TODO: напиши тут свой код
        return false;
    }

    /**
     * Реализуй метод, который принимает строку с числом и возвращает его как {@code int}.
     * <p>Примеры:</p>
     * <ul>
     *   <li>{@code parseNumber("42")} → {@code 42}</li>
     *   <li>{@code parseNumber("-7")} → {@code -7}</li>
     * </ul>
     *
     * @param s строка, содержащая целое число
     * @return число как {@code int}
     */
    public int parseNumber(String s) {
        // TODO: напиши тут свой код
        return 0;
    }
}
