package com.lastsave.block05.topic05.task01;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class LoggerTest {

    private static final String CLASS_NAME = "com.lastsave.block05.topic05.task01.Logger";

    private Object newLogger() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> ctor = clazz.getDeclaredConstructor();
        return ctor.newInstance();
    }

    @Test
    void log_messageOnly_defaultInfoLevel() throws Exception {
        Object logger = newLogger();
        Method method = logger.getClass().getDeclaredMethod("log", String.class);
        String result = (String) method.invoke(logger, "Сервер запущен");
        assertEquals("[INFO] Сервер запущен", result,
                "log(\"Сервер запущен\") ==> ожидалось \"[INFO] Сервер запущен\"");
    }

    @Test
    void log_messageAndLevel() throws Exception {
        Object logger = newLogger();
        Method method = logger.getClass().getDeclaredMethod("log", String.class, String.class);
        String result = (String) method.invoke(logger, "Ошибка подключения", "ERROR");
        assertEquals("[ERROR] Ошибка подключения", result,
                "log(\"Ошибка подключения\", \"ERROR\") ==> ожидалось \"[ERROR] Ошибка подключения\"");
    }

    @Test
    void log_messageAndLevel_infoLevel() throws Exception {
        Object logger = newLogger();
        Method method = logger.getClass().getDeclaredMethod("log", String.class, String.class);
        String result = (String) method.invoke(logger, "Запрос принят", "INFO");
        assertEquals("[INFO] Запрос принят", result,
                "log(\"Запрос принят\", \"INFO\") ==> ожидалось \"[INFO] Запрос принят\"");
    }

    @Test
    void log_messageAndLevelAndTime() throws Exception {
        Object logger = newLogger();
        Method method = logger.getClass().getDeclaredMethod("log", String.class, String.class, String.class);
        String result = (String) method.invoke(logger, "Пользователь вошёл", "INFO", "10:42");
        assertEquals("[INFO] 10:42 Пользователь вошёл", result,
                "log(\"Пользователь вошёл\", \"INFO\", \"10:42\") ==> ожидалось \"[INFO] 10:42 Пользователь вошёл\"");
    }
}
