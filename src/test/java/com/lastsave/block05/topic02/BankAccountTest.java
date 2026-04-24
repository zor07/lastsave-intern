package com.lastsave.block05.topic02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private static final String CLASS_NAME = "com.lastsave.block05.topic02.task02.BankAccount";

    @BeforeEach
    void resetBankTotal() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Field bankTotalMoney = clazz.getDeclaredField("bankTotalMoney");
        bankTotalMoney.setAccessible(true);
        bankTotalMoney.set(null, 0);
    }

    @Test
    void constructor_updatesBankTotal() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(int.class);
        constructor.newInstance(100);
        constructor.newInstance(200);
        Field bankTotalMoney = clazz.getDeclaredField("bankTotalMoney");
        bankTotalMoney.setAccessible(true);
        assertEquals(300, bankTotalMoney.get(null),
                "bankTotalMoney должен увеличиваться при создании аккаунта. BankAccount(100) + BankAccount(200) ==> ожидалось bankTotalMoney = 300");
    }

    @Test
    void deposit_updatesBalance() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(int.class);
        Object account = constructor.newInstance(100);
        Method deposit = clazz.getDeclaredMethod("deposit", int.class);
        deposit.invoke(account, 50);
        Field balance = clazz.getDeclaredField("balance");
        balance.setAccessible(true);
        assertEquals(150, balance.get(account),
                "Метод deposit реализован некорректно. После deposit(50) на аккаунте с балансом 100 ==> ожидалось balance = 150");
    }

    @Test
    void deposit_updatesBankTotal() throws Exception {
        Class<?> clazz = Class.forName(CLASS_NAME);
        Constructor<?> constructor = clazz.getDeclaredConstructor(int.class);
        Object account = constructor.newInstance(100);
        Method deposit = clazz.getDeclaredMethod("deposit", int.class);
        deposit.invoke(account, 50);
        Field bankTotalMoney = clazz.getDeclaredField("bankTotalMoney");
        bankTotalMoney.setAccessible(true);
        assertEquals(150, bankTotalMoney.get(null),
                "Метод deposit должен обновлять bankTotalMoney. После BankAccount(100) и deposit(50) ==> ожидалось bankTotalMoney = 150");
    }
}
