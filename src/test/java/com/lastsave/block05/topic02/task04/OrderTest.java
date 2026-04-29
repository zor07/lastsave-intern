package com.lastsave.block05.topic02.task04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

@Tag("block05.topic02")
class OrderTest {

    private static final String ORDER_CLASS = "com.lastsave.block05.topic02.task04.Order";
    private static final String GENERATOR_CLASS = "com.lastsave.block05.topic02.task04.IdGenerator";

    @BeforeEach
    void resetLastId() throws Exception {
        Class<?> clazz = Class.forName(GENERATOR_CLASS);
        Field lastId = clazz.getDeclaredField("lastId");
        lastId.setAccessible(true);
        lastId.set(null, 0);
    }

    @Test
    void order_hasUniqueIds() throws Exception {
        Class<?> orderClass = Class.forName(ORDER_CLASS);
        Constructor<?> constructor = orderClass.getDeclaredConstructor();
        Object o1 = constructor.newInstance();
        Object o2 = constructor.newInstance();
        Object o3 = constructor.newInstance();
        Field id = orderClass.getDeclaredField("id");
        id.setAccessible(true);
        assertEquals(1, id.get(o1),
                "Первый Order должен получить id = 1 ==> ожидалось o1.id = 1");
        assertEquals(2, id.get(o2),
                "Второй Order должен получить id = 2 ==> ожидалось o2.id = 2");
        assertEquals(3, id.get(o3),
                "Третий Order должен получить id = 3 ==> ожидалось o3.id = 3");
    }
}
