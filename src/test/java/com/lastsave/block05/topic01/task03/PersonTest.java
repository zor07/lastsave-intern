package com.lastsave.block05.topic01.task03;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private static final String CLASS_NAME = "com.lastsave.block05.topic01.task03.Person";

    @Test
    void isAdult_adult() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        Object person = constructor.newInstance("Alex", 25);
        Method method = clazz.getDeclaredMethod("isAdult");
        assertEquals(true, method.invoke(person),
                "Метод isAdult реализован некорректно. Проверь: isAdult() для Person(\"Alex\", 25) ==> ожидалось true");
    }

    @Test
    void isAdult_minor() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        Object person = constructor.newInstance("Maria", 17);
        Method method = clazz.getDeclaredMethod("isAdult");
        assertEquals(false, method.invoke(person),
                "Метод isAdult реализован некорректно. Проверь: isAdult() для Person(\"Maria\", 17) ==> ожидалось false");
    }

    @Test
    void isAdult_exactlyEighteen() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        Object person = constructor.newInstance("Ivan", 18);
        Method method = clazz.getDeclaredMethod("isAdult");
        assertEquals(true, method.invoke(person),
                "Метод isAdult реализован некорректно. Проверь: isAdult() для Person(\"Ivan\", 18) ==> ожидалось true");
    }
}
