package com.lastsave.block05.topic02.task03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

@Tag("block05.topic02")
class PersonCountTest {

    private static final String CLASS_NAME = "com.lastsave.block05.topic02.task03.Person";

    @BeforeEach
    void resetCount() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Field count = clazz.getDeclaredField("count");
        count.setAccessible(true);
        count.set(null, 0);
    }

    @Test
    void count_initiallyZero() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Field count = clazz.getDeclaredField("count");
        count.setAccessible(true);
        assertEquals(0, count.get(null),
                "Начальное значение count должно быть 0");
    }

    @Test
    void count_incrementsOnCreation() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, int.class);
        constructor.newInstance("Alex", 25);
        constructor.newInstance("Maria", 30);
        Field count = clazz.getDeclaredField("count");
        count.setAccessible(true);
        assertEquals(2, count.get(null),
                "count должен увеличиваться при создании каждого объекта. После двух new Person() ==> ожидалось count = 2");
    }
}
