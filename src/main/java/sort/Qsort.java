package sort;

import java.util.ArrayList;

public class Qsort {

    /*static <T extends Comparable<T>> T[] sort(T[] array)
    {

    }*/

    static <T extends Comparable<T>> T[] partition(T[] array)
    {
        T mid = array[0];
        int i = 1, j = array.length-1;
        while(i < j)
        {
            while(array[i].compareTo(mid) < 0)
            {
                i++;
            }
            while(array[j].compareTo(mid) >= 0)
            {
                j--;
            }
            T tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;

            i++; j++;
        }
        return array;
    }
}
