package com.lastsave.block05.topic03.task02;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private static final String CLASS_NAME = "com.lastsave.block05.topic03.task02.Student";

    @Test
    void getName_returnsName() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        Object student = constructor.newInstance("Alex", 4);
        Method method = clazz.getDeclaredMethod("getName");
        assertEquals("Alex", method.invoke(student),
                "Метод getName реализован некорректно. Проверь: getName() для Student(\"Alex\", 4) ==> ожидалось \"Alex\"");
    }

    @Test
    void getGrade_returnsGrade() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        Object student = constructor.newInstance("Alex", 4);
        Method method = clazz.getDeclaredMethod("getGrade");
        assertEquals(4, method.invoke(student),
                "Метод getGrade реализован некорректно. Проверь: getGrade() для Student(\"Alex\", 4) ==> ожидалось 4");
    }

    @Test
    void setGrade_validGrade() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        Object student = constructor.newInstance("Alex", 4);
        Method setGrade = clazz.getDeclaredMethod("setGrade", int.class);
        Method getGrade = clazz.getDeclaredMethod("getGrade");
        setGrade.invoke(student, 5);
        assertEquals(5, getGrade.invoke(student),
                "Метод setGrade реализован некорректно. После setGrade(5) ==> ожидалось getGrade() = 5");
    }

    @Test
    void noExtraSetters() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        List<String> setters = Arrays.stream(clazz.getDeclaredMethods())
                .map(Method::getName)
                .filter(name -> name.startsWith("set"))
                .collect(Collectors.toList());
        assertEquals(List.of("setGrade"), setters,
                "В классе Student должен быть только один сеттер — setGrade. Лишние сеттеры: " + setters);
    }

    @Test
    void setGrade_tooHigh_ignored() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        Object student = constructor.newInstance("Alex", 4);
        Method setGrade = clazz.getDeclaredMethod("setGrade", int.class);
        Method getGrade = clazz.getDeclaredMethod("getGrade");
        setGrade.invoke(student, 10);
        assertEquals(4, getGrade.invoke(student),
                "Метод setGrade реализован некорректно. После setGrade(10) оценка не должна измениться ==> ожидалось getGrade() = 4");
    }

    @Test
    void setGrade_tooLow_ignored() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        Object student = constructor.newInstance("Alex", 4);
        Method setGrade = clazz.getDeclaredMethod("setGrade", int.class);
        Method getGrade = clazz.getDeclaredMethod("getGrade");
        setGrade.invoke(student, 0);
        assertEquals(4, getGrade.invoke(student),
                "Метод setGrade реализован некорректно. После setGrade(0) оценка не должна измениться ==> ожидалось getGrade() = 4");
    }
}
