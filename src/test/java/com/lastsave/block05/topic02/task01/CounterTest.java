package com.lastsave.block05.topic02.task01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    private static final String CLASS_NAME = "com.lastsave.block05.topic02.task01.Counter";

    @BeforeEach
    void resetCount() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Field count = clazz.getDeclaredField("count");
        count.setAccessible(true);
        count.set(null, 0);
    }

    @Test
    void getCount_initiallyZero() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Method getCount = clazz.getDeclaredMethod("getCount");
        assertEquals(0, getCount.invoke(null),
                "Метод getCount реализован некорректно. Начальное значение count должно быть 0");
    }

    @Test
    void increment_once() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Object counter = clazz.getDeclaredConstructor().newInstance();
        Method increment = clazz.getDeclaredMethod("increment");
        Method getCount = clazz.getDeclaredMethod("getCount");
        increment.invoke(counter);
        assertEquals(1, getCount.invoke(null),
                "Метод increment реализован некорректно. После одного вызова increment() ==> ожидалось count = 1");
    }

    @Test
    void increment_sharedAcrossInstances() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Object c1 = clazz.getDeclaredConstructor().newInstance();
        Object c2 = clazz.getDeclaredConstructor().newInstance();
        Method increment = clazz.getDeclaredMethod("increment");
        Method getCount = clazz.getDeclaredMethod("getCount");
        increment.invoke(c1);
        increment.invoke(c1);
        increment.invoke(c2);
        assertEquals(3, getCount.invoke(null),
                "Поле count должно быть общим для всех объектов. После 3 вызовов increment() на разных объектах ==> ожидалось count = 3");
    }
}
