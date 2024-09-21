package hw3;

import java.util.Arrays;

/**
 * Напишите обобщенный метод compareArrays(), который принимает два массива и возвращает true, если они одинаковые, и false в противном случае. Массивы могут быть любого типа данных, но должны иметь одинаковую длину и содержать элементы одного типа по парно по индексам.
 */
public class Compare {

    public static <T1, T2> boolean compareArrays(T1[] array1, T2[] array2) {

        if (array1.length == array2.length && Arrays.equals(array1, array2))
        {
            return true;
        }
        return false;
    }
}
