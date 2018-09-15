package ru.tds.remove;

import java.util.Arrays;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Класс,в котором реализована задача "Удаление данных из списка".
 *
 * Date: 13.09.2018 (четверг)
 * Project name: RemoveElement
 * Package name: ru.tds.remove
 *
 * @author Трушенков Дмитрий 15ИТ18
 */


public class Main {

    public static void main(String args[]) {

        Set<Integer> setOfIntegers = Collections.newSetFromMap(new ConcurrentHashMap<>());
        setOfIntegers.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        for (int value : setOfIntegers) {
            if (isCenterOfSet(value)) {
                setOfIntegers.remove(value);
            }
        }

        System.out.println(setOfIntegers);
    }

    /**
     * Метод проверяет значение элемента из набора данных и возращает элемент, равный значению 5.
     * В нашем случае этот элемент - середина setOfIntegers.
     *
     * @param value элемент из набора данных setOfIntegers
     * @return true, если элемент равен 5, иначе - false.
     */
    private static boolean isCenterOfSet(int value) {
        return value == 5;
    }

}
