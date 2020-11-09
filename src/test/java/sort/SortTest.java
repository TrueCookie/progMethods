package sort;

import junit.framework.TestCase;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class SortTest extends TestCase {

  /*private final static Integer[] NOT_SORTED_ARR = new Integer[]{10, 14, 2, 8, 6, 7, 12, 10, -1};
  private final static Integer[] SORTED_ARR = new Integer[]{-1, 2, 6, 7, 8, 10, 10, 12, 14};*/
  private final static Integer[] NOT_SORTED_ARR = new Integer[]{67, 55, 51, 47, 43, 31, 22, 20, 15, 14, 8};
  private final static Integer[] SORTED_ARR = new Integer[]{8, 14, 15, 20, 22, 31, 43, 47, 51, 55, 67};

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    System.setOut(new java.io.PrintStream(System.out, true, "windows-1251"));
  }

  //TODO: compare speed with native sort
  public void testInsertionSort()
  {
    Integer[] result = InsertionSort.sort(NOT_SORTED_ARR);
    assertEquals(Arrays.deepToString(SORTED_ARR), Arrays.deepToString(result));
  }

  public void testCocktailSort()
  {
    Integer[] result = CocktailSort.sort(NOT_SORTED_ARR);
    assertEquals(Arrays.deepToString(SORTED_ARR), Arrays.deepToString(result));
  }

  public void testBucketSort()
  {
    Integer[] result = BucketSort.sort(NOT_SORTED_ARR);
    assertEquals(Arrays.deepToString(SORTED_ARR), Arrays.deepToString(result));
  }
}