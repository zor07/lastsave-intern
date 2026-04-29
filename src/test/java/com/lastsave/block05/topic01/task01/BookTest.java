package com.lastsave.block05.topic01.task01;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

@Tag("block05.topic01")
class BookTest {

    private static final String CLASS_NAME = "com.lastsave.block05.topic01.task01.Book";

    @Test
    void getSummary_cleanCode() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, String.class, int.class);
        Object book = constructor.newInstance("Clean Code", "Robert Martin", 464);
        Method method = clazz.getDeclaredMethod("getSummary");
        String result = (String) method.invoke(book);
        assertEquals("Clean Code by Robert Martin, 464 pages", result,
                "Метод getSummary реализован некорректно. Проверь: getSummary() для Book(\"Clean Code\", \"Robert Martin\", 464) ==> ожидалось \"Clean Code by Robert Martin, 464 pages\"");
    }

    @Test
    void getSummary_effectiveJava() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, String.class, int.class);
        Object book = constructor.newInstance("Effective Java", "Joshua Bloch", 412);
        Method method = clazz.getDeclaredMethod("getSummary");
        String result = (String) method.invoke(book);
        assertEquals("Effective Java by Joshua Bloch, 412 pages", result,
                "Метод getSummary реализован некорректно. Проверь: getSummary() для Book(\"Effective Java\", \"Joshua Bloch\", 412) ==> ожидалось \"Effective Java by Joshua Bloch, 412 pages\"");
    }
}
