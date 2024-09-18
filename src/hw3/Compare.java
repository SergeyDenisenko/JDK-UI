package hw3;

import java.util.Arrays;

public class Compare {
    
    public static <T1, T2> boolean compareArrays(T1[] array1, T2[] array2) {

        if (array1.length == array2.length && Arrays.equals(array1, array2))
        {
            return true;
        }
        return false;
    }
}
