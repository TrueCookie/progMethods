package sort;

public class CocktailSort {
  public static <T extends Comparable<T>> T[] sort3(T[] array)
  {
    int lowEnd = 0,
        highEnd = array.length - 1;

    int i = 0,
            lastSwap = 0;
    boolean rightOrder = true;

    while (lowEnd < highEnd)
    {
      if(array[i].compareTo(array[i+1]) > 0)
      {
        T tmp = array[i+1];
        array[i+1] = array[i];
        array[i] = tmp;

        lastSwap = i;
      }

      if(i > highEnd || i < lowEnd)
      {
        if(i > highEnd)
        {
          highEnd = lastSwap;
        }
        else {
          lowEnd = lastSwap;
        }

        i = lastSwap;
        rightOrder = !rightOrder;
      }

      i = rightOrder ? i+1 : i-1;
    }

    return null;
  }

  public static <T extends Comparable<T>> T[] sort(T[] array)
  {
    int lowEnd = 0,
        highEnd = array.length - 1,
        lastSwap = 0;

    while(lowEnd < highEnd)
    {
      for (int i = lowEnd; i < highEnd ; i++) {
        if(array[i].compareTo(array[i+1]) > 0)
        {
          T tmp = array[i+1];
          array[i+1] = array[i];
          array[i] = tmp;

          lastSwap = i;
        }
      }
      highEnd = lastSwap;

      for (int i = highEnd; i > lowEnd ; i--) {
        if(array[i-1].compareTo(array[i]) > 0)
        {
          T tmp = array[i-1];
          array[i-1] = array[i];
          array[i] = tmp;

          lastSwap = i;
        }
      }
      lowEnd = lastSwap;
    }

    return array;
  }

  public static <T extends Comparable<T>> T[] sort1(T[] array)
  {
    for (int i = 0; i < array.length; i++) {
      T key = array[i];
      int j = i + 1;
      while(j < array.length && array[j].compareTo(key) < 0)
      {
        array[j-1] = array[j];
        j++;
      }
      array[j-1] = key;
    }
    return array;
  }
}
