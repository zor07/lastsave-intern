package com.lastsave.block05.topic04.task01;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

@Tag("block5.topic4")
class PersonParserTest {

    private static final String PERSON_CLASS = "com.lastsave.block05.topic04.task01.persons.Person";
    private static final String PARSER_CLASS = "com.lastsave.block05.topic04.task01.persons.PersonParser";
    private static final String VALIDATOR_CLASS = "com.lastsave.block05.topic04.task01.persons.PersonValidator";

    // ── Person ──────────────────────────────────────────────────────────────

    @Test
    void person_getName() throws Exception {
        Class<?> clazz = Class.forName(PERSON_CLASS);
        Constructor<?> ctor = clazz.getDeclaredConstructor(String.class, String.class);
        Object person = ctor.newInstance("Алекс", "Москва");
        Method getName = clazz.getDeclaredMethod("getName");
        assertEquals("Алекс", getName.invoke(person),
                "getName() для Person(\"Алекс\", \"Москва\") ==> ожидалось \"Алекс\"");
    }

    @Test
    void person_getCity() throws Exception {
        Class<?> clazz = Class.forName(PERSON_CLASS);
        Constructor<?> ctor = clazz.getDeclaredConstructor(String.class, String.class);
        Object person = ctor.newInstance("Алекс", "Москва");
        Method getCity = clazz.getDeclaredMethod("getCity");
        assertEquals("Москва", getCity.invoke(person),
                "getCity() для Person(\"Алекс\", \"Москва\") ==> ожидалось \"Москва\"");
    }

    // ── PersonParser ─────────────────────────────────────────────────────────

    @Test
    void parser_validInput_returnsPersonWithCorrectName() throws Exception {
        Class<?> personClass = Class.forName(PERSON_CLASS);
        Class<?> parserClass = Class.forName(PARSER_CLASS);
        Object parser = parserClass.getDeclaredConstructor().newInstance();
        Method parse = parserClass.getDeclaredMethod("parse", String.class);
        Object person = parse.invoke(parser, "Алекс, Москва");
        assertNotNull(person,
                "parse(\"Алекс, Москва\") ==> ожидался объект Person, получили null");
        Method getName = personClass.getDeclaredMethod("getName");
        assertEquals("Алекс", getName.invoke(person),
                "parse(\"Алекс, Москва\") ==> getName() должен вернуть \"Алекс\"");
    }

    @Test
    void parser_validInput_returnsPersonWithCorrectCity() throws Exception {
        Class<?> personClass = Class.forName(PERSON_CLASS);
        Class<?> parserClass = Class.forName(PARSER_CLASS);
        Object parser = parserClass.getDeclaredConstructor().newInstance();
        Method parse = parserClass.getDeclaredMethod("parse", String.class);
        Object person = parse.invoke(parser, "Алекс, Москва");
        assertNotNull(person,
                "parse(\"Алекс, Москва\") ==> ожидался объект Person, получили null");
        Method getCity = personClass.getDeclaredMethod("getCity");
        assertEquals("Москва", getCity.invoke(person),
                "parse(\"Алекс, Москва\") ==> getCity() должен вернуть \"Москва\"");
    }

    @Test
    void parser_invalidInput_returnsNull() throws Exception {
        Class<?> parserClass = Class.forName(PARSER_CLASS);
        Object parser = parserClass.getDeclaredConstructor().newInstance();
        Method parse = parserClass.getDeclaredMethod("parse", String.class);
        Object result = parse.invoke(parser, "Алекс");
        assertNull(result,
                "parse(\"Алекс\") ==> невалидный ввод, ожидался null");
    }

    @Test
    void parser_emptyInput_returnsNull() throws Exception {
        Class<?> parserClass = Class.forName(PARSER_CLASS);
        Object parser = parserClass.getDeclaredConstructor().newInstance();
        Method parse = parserClass.getDeclaredMethod("parse", String.class);
        Object result = parse.invoke(parser, "");
        assertNull(result,
                "parse(\"\") ==> пустая строка, ожидался null");
    }

    // ── PersonValidator ──────────────────────────────────────────────────────

    @Test
    void validator_validInput_returnsTrue() throws Exception {
        Class<?> clazz = Class.forName(VALIDATOR_CLASS);
        Method validate = clazz.getDeclaredMethod("validate", String.class);
        Object result = validate.invoke(null, "Алекс, Москва");
        assertEquals(true, result,
                "validate(\"Алекс, Москва\") ==> ожидалось true");
    }

    @Test
    void validator_invalidInput_returnsFalse() throws Exception {
        Class<?> clazz = Class.forName(VALIDATOR_CLASS);
        Method validate = clazz.getDeclaredMethod("validate", String.class);
        Object result = validate.invoke(null, "Алекс");
        assertEquals(false, result,
                "validate(\"Алекс\") ==> ожидалось false");
    }

    @Test
    void validator_emptyInput_returnsFalse() throws Exception {
        Class<?> clazz = Class.forName(VALIDATOR_CLASS);
        Method validate = clazz.getDeclaredMethod("validate", String.class);
        Object result = validate.invoke(null, "");
        assertEquals(false, result,
                "validate(\"\") ==> ожидалось false");
    }
}
