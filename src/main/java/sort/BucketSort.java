package sort;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Supplier;

public class BucketSort<T> {

  //TODO: compute total complexity
  static Integer[] sort(Integer[] array)
  {
    Integer min = Integer.MAX_VALUE,
            max = Integer.MIN_VALUE;
    for(int i = 0; i < array.length; i++)
    {
      if(array[i] < min)
      {
        min = array[i];
      }else if(array[i] > max)
      {
        max = array[i];
      }
    }

    Integer[] buckets = new Integer[array.length];

    return array;
  }

}
