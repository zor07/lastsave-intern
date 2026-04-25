package com.lastsave.block05.topic05.task02;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static final String CLASS_NAME = "com.lastsave.block05.topic05.task02.Calculator";

    private Object newCalculator() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> ctor = clazz.getDeclaredConstructor();
        return ctor.newInstance();
    }

    @Test
    void add_twoInts() throws Exception {
        Object calc = newCalculator();
        Method method = calc.getClass().getDeclaredMethod("add", int.class, int.class);
        assertEquals(5, method.invoke(calc, 2, 3),
                "add(2, 3) ==> ожидалось 5");
    }

    @Test
    void add_twoInts_zero() throws Exception {
        Object calc = newCalculator();
        Method method = calc.getClass().getDeclaredMethod("add", int.class, int.class);
        assertEquals(0, method.invoke(calc, 0, 0),
                "add(0, 0) ==> ожидалось 0");
    }

    @Test
    void add_threeInts() throws Exception {
        Object calc = newCalculator();
        Method method = calc.getClass().getDeclaredMethod("add", int.class, int.class, int.class);
        assertEquals(9, method.invoke(calc, 2, 3, 4),
                "add(2, 3, 4) ==> ожидалось 9");
    }

    @Test
    void add_twoDoubles() throws Exception {
        Object calc = newCalculator();
        Method method = calc.getClass().getDeclaredMethod("add", double.class, double.class);
        assertEquals(4.0, method.invoke(calc, 1.5, 2.5),
                "add(1.5, 2.5) ==> ожидалось 4.0");
    }

    @Test
    void add_twoDoubles_negative() throws Exception {
        Object calc = newCalculator();
        Method method = calc.getClass().getDeclaredMethod("add", double.class, double.class);
        assertEquals(-1.0, method.invoke(calc, 1.5, -2.5),
                "add(1.5, -2.5) ==> ожидалось -1.0");
    }
}
