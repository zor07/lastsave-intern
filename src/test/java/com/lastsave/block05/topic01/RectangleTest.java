package com.lastsave.block05.topic01;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private static final String CLASS_NAME = "com.lastsave.block05.topic01.task02.Rectangle";

    @Test
    void area_5x3() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(int.class, int.class);
        Object rect = constructor.newInstance(5, 3);
        Method method = clazz.getDeclaredMethod("area");
        assertEquals(15, method.invoke(rect),
                "Метод area реализован некорректно. Проверь: area() для Rectangle(5, 3) ==> ожидалось 15");
    }

    @Test
    void perimeter_5x3() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(int.class, int.class);
        Object rect = constructor.newInstance(5, 3);
        Method method = clazz.getDeclaredMethod("perimeter");
        assertEquals(16, method.invoke(rect),
                "Метод perimeter реализован некорректно. Проверь: perimeter() для Rectangle(5, 3) ==> ожидалось 16");
    }

    @Test
    void area_4x4() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(int.class, int.class);
        Object rect = constructor.newInstance(4, 4);
        Method method = clazz.getDeclaredMethod("area");
        assertEquals(16, method.invoke(rect),
                "Метод area реализован некорректно. Проверь: area() для Rectangle(4, 4) ==> ожидалось 16");
    }

    @Test
    void defaultConstructor_area() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        Object rect = constructor.newInstance();
        Method method = clazz.getDeclaredMethod("area");
        assertEquals(1, method.invoke(rect),
                "Конструктор по умолчанию реализован некорректно. Проверь: area() для Rectangle() ==> ожидалось 1");
    }

    @Test
    void defaultConstructor_perimeter() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor();
        Object rect = constructor.newInstance();
        Method method = clazz.getDeclaredMethod("perimeter");
        assertEquals(4, method.invoke(rect),
                "Конструктор по умолчанию реализован некорректно. Проверь: perimeter() для Rectangle() ==> ожидалось 4");
    }
}
