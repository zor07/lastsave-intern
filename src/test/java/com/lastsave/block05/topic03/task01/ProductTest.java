package com.lastsave.block05.topic03.task01;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    private static final String CLASS_NAME = "com.lastsave.block05.topic03.task01.Product";

    @Test
    void getName_returnsName() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, double.class);
        Object product = constructor.newInstance("Laptop", 1500.0);
        Method method = clazz.getDeclaredMethod("getName");
        assertEquals("Laptop", method.invoke(product),
                "Метод getName реализован некорректно. Проверь: getName() для Product(\"Laptop\", 1500.0) ==> ожидалось \"Laptop\"");
    }

    @Test
    void getPrice_returnsPrice() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, double.class);
        Object product = constructor.newInstance("Laptop", 1500.0);
        Method method = clazz.getDeclaredMethod("getPrice");
        assertEquals(1500.0, method.invoke(product),
                "Метод getPrice реализован некорректно. Проверь: getPrice() для Product(\"Laptop\", 1500.0) ==> ожидалось 1500.0");
    }

    @Test
    void setPrice_validPrice() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, double.class);
        Object product = constructor.newInstance("Laptop", 1500.0);
        Method setPrice = clazz.getDeclaredMethod("setPrice", double.class);
        Method getPrice = clazz.getDeclaredMethod("getPrice");
        setPrice.invoke(product, 2000.0);
        assertEquals(2000.0, getPrice.invoke(product),
                "Метод setPrice реализован некорректно. После setPrice(2000.0) ==> ожидалось getPrice() = 2000.0");
    }

    @Test
    void setPrice_negativePrice_ignored() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(String.class, double.class);
        Object product = constructor.newInstance("Laptop", 1500.0);
        Method setPrice = clazz.getDeclaredMethod("setPrice", double.class);
        Method getPrice = clazz.getDeclaredMethod("getPrice");
        setPrice.invoke(product, -100.0);
        assertEquals(1500.0, getPrice.invoke(product),
                "Метод setPrice реализован некорректно. После setPrice(-100.0) цена не должна измениться ==> ожидалось getPrice() = 1500.0");
    }
}
