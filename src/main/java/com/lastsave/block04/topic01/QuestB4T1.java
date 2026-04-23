package com.lastsave.block04.topic01;

public class QuestB4T1 {

    /**
     * Реализуй метод, который возвращает первый чётный элемент массива.
     * <p>Если чётных элементов нет — вернуть {@code 0}.</p>
     * <p>Примеры:</p>
     * <ul>
     *   <li>{@code getFirstEven(new int[]{1, 3, 4, 6})} → {@code 4}</li>
     *   <li>{@code getFirstEven(new int[]{2, 5, 7})} → {@code 2}</li>
     *   <li>{@code getFirstEven(new int[]{1, 3, 5})} → {@code 0}</li>
     * </ul>
     *
     * @param numbers массив целых чисел
     * @return первый чётный элемент или {@code 0} если чётных нет
     */
    public int getFirstEven(int[] numbers) {
        // TODO: напиши тут свой код
        return 0;
    }

    /**
     * Реализуй метод, который возвращает последний элемент массива.
     * <p>Если массив пустой — вернуть {@code 0}.</p>
     * <p>Примеры:</p>
     * <ul>
     *   <li>{@code getLast(new int[]{10, 20, 30})} → {@code 30}</li>
     *   <li>{@code getLast(new int[]{5})} → {@code 5}</li>
     *   <li>{@code getLast(new int[]{})} → {@code 0}</li>
     * </ul>
     *
     * @param numbers массив целых чисел
     * @return последний элемент или {@code 0} если массив пустой
     */
    public int getLast(int[] numbers) {
        // TODO: напиши тут свой код
        return 0;
    }

    /**
     * Реализуй метод, который возвращает сумму всех элементов массива.
     * <p>Примеры:</p>
     * <ul>
     *   <li>{@code sum(new int[]{1, 2, 3, 4, 5})} → {@code 15}</li>
     *   <li>{@code sum(new int[]{10, 20})} → {@code 30}</li>
     * </ul>
     *
     * @param numbers массив целых чисел
     * @return сумма всех элементов
     */
    public int sum(int[] numbers) {
        // TODO: напиши тут свой код
        return 0;
    }

    /**
     * Реализуй метод, который возвращает минимальный элемент массива.
     * <p>Примеры:</p>
     * <ul>
     *   <li>{@code min(new int[]{3, 1, 4, 1, 5})} → {@code 1}</li>
     *   <li>{@code min(new int[]{10, 20, 5})} → {@code 5}</li>
     * </ul>
     *
     * @param numbers массив целых чисел
     * @return минимальный элемент
     */
    public int min(int[] numbers) {
        // TODO: напиши тут свой код
        return 0;
    }

    /**
     * Реализуй метод, который возвращает среднее арифметическое элементов массива.
     * <p>Примеры:</p>
     * <ul>
     *   <li>{@code average(new int[]{1, 2, 3})} → {@code 2.0}</li>
     *   <li>{@code average(new int[]{10, 20})} → {@code 15.0}</li>
     * </ul>
     *
     * @param numbers массив целых чисел
     * @return среднее арифметическое
     */
    public double average(int[] numbers) {
        // TODO: напиши тут свой код
        return 0;
    }

    /**
     * Реализуй метод, который возвращает {@code true} если массив содержит элемент {@code target}.
     * <p>Примеры:</p>
     * <ul>
     *   <li>{@code contains(new int[]{1, 2, 3}, 2)} → {@code true}</li>
     *   <li>{@code contains(new int[]{1, 2, 3}, 5)} → {@code false}</li>
     * </ul>
     *
     * @param numbers массив целых чисел
     * @param target  искомый элемент
     * @return {@code true} если элемент найден
     */
    public boolean contains(int[] numbers, int target) {
        // TODO: напиши тут свой код
        return false;
    }

    /**
     * Реализуй метод, который возвращает количество чётных чисел в массиве.
     * <p>Если чётных нет — вернуть {@code 0}.</p>
     * <p>Примеры:</p>
     * <ul>
     *   <li>{@code countEven(new int[]{1, 2, 3, 4})} → {@code 2}</li>
     *   <li>{@code countEven(new int[]{1, 3, 5})} → {@code 0}</li>
     * </ul>
     *
     * @param numbers массив целых чисел
     * @return количество чётных элементов
     */
    public int countEven(int[] numbers) {
        // TODO: напиши тут свой код
        return 0;
    }

    /**
     * Реализуй метод, который возвращает сумму чётных элементов массива.
     * <p>Если чётных нет — вернуть {@code 0}.</p>
     * <p>Примеры:</p>
     * <ul>
     *   <li>{@code sumEven(new int[]{1, 2, 3, 4})} → {@code 6}</li>
     *   <li>{@code sumEven(new int[]{1, 3, 5})} → {@code 0}</li>
     * </ul>
     *
     * @param numbers массив целых чисел
     * @return сумма чётных элементов
     */
    public int sumEven(int[] numbers) {
        // TODO: напиши тут свой код
        return 0;
    }

    /**
     * Реализуй метод, который возвращает новый массив с элементами в обратном порядке.
     * <p>Примеры:</p>
     * <ul>
     *   <li>{@code reverse(new int[]{1, 2, 3})} → {@code [3, 2, 1]}</li>
     *   <li>{@code reverse(new int[]{10, 20})} → {@code [20, 10]}</li>
     * </ul>
     *
     * @param numbers массив целых чисел
     * @return новый массив в обратном порядке
     */
    public int[] reverse(int[] numbers) {
        // TODO: напиши тут свой код
        return null;
    }

    /**
     * Реализуй метод, который возвращает новый массив — копию исходного.
     * <p>Примеры:</p>
     * <ul>
     *   <li>{@code copy(new int[]{1, 2, 3})} → {@code [1, 2, 3]}</li>
     *   <li>{@code copy(new int[]{0, 0})} → {@code [0, 0]}</li>
     * </ul>
     *
     * @param numbers массив целых чисел
     * @return копия массива
     */
    public int[] copy(int[] numbers) {
        // TODO: напиши тут свой код
        return null;
    }
}
