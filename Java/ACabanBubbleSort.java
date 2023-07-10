/* Abraham Caban Rios
 * 4/15/2023
 * Module 6
 * references
 * Coding with John (2021). Bubble Sort titorial in java Retrived from:
 * https://www.codepile.net/pile/aNVb5kNb
 */

import java.util.*;

public class ACabanBubbleSort 
{
  
  /*  At line 6, the code Sorts the given array of elements using the natural ordering.
   *  At line 14 the code initializes a flag to detect whether there was any swap during the pass.
   *  At line 15 the code initializes a variable to keep track of the remaining unsorted elements.
   */
  public static <E extends Comparable<E>> void bubbleSort(E[] array) 
  {
    
    boolean changed;
    int n = array.length;
    
    /* the do while loop is used to repeatedly 
    iterate through the array untill no more swaps are needed */
    do 
    {
      changed = false;
      /* next the for loop uses two nested loops to iterate through the 
      array and compare each element with its neighbor 
      in the previous index. The indexOf() method is 
      used to obtain the index of the element in 
      the array thatb is quoting, and a condition is added to verify that 
      the current index is greater than 0 so that we dont get an Exception. If 
      the comparison is true, the elements are changed, and the changed value is set to true. 
      */
      for (int i = 1; i < n; i++) {
        for (E elem : array) 
        {
            int ind = Arrays.asList(array).indexOf(elem);
            if ((ind > 0) && (array[ind-1].compareTo(array[ind]) > 0)) 
            {
                E tempVar = array[ind-1];
                array[ind-1] = array[ind];
                array[ind] = tempVar;
                changed = true; // flag
            }
        }
    }
      n--; 
    } while (changed); 
  }
  
  public static <E> void bubbleSort(E[] array, Comparator<? super E> comparator) {
    
    int n = array.length;
    boolean changed = true;

/* next the while loop is used to control the number of iterations. 
The changed value is initialized to true before going in the loop. 
while in the loop, if any elements are changed, the changed value is 
set to true. The variable n is also reduced at the end of each 
iteration to ensure that the last element is sorted corectly.*/

while (changed) 
{
    changed = false;
    for (int i = 1; i < n; i++) 
    {
        if (comparator.compare(array[i-1], array[i]) > 0) 
        { 
            E tempVar = array[i-1];
            array[i-1] = array[i];
            array[i] = tempVar;
            changed = true; 
        }
    }
    n--;
}

  }
  public static void main(String[] args) {

    // make an array of integers
    Integer[] intArray = {34, 92, 62, 18, 6, 24, -9, 77, 2, 8};
    // next sence the Comparable interface is already implemented by 
    //Integer class hence we dont need to use Comparator.
    bubbleSort(intArray);

     System.out.println(Arrays.toString(intArray));
    // for (int i = 0; i < intArray.length; i++) {
    //   System.out.print(intArray[i] + " ");
    // }

    // System.out.println();

    /*
     *  pass an array of trings being brands of cars
     */
    String[] stringArray = {"nissans", "toyota", "mazda", "fords", "chargers", "zenvo", "fiat"};

    /*
     *  next is  acomparator that sorts the strings by the length of the string. 
     * using the Comaparing method of the Comparator interface.
     */
    bubbleSort(stringArray, Comparator.comparing(String::length));
    System.out.println(Arrays.toString(stringArray));

    /*
     *
     *  Comment Here
     *
     */
    // for (int i = 0; i < stringArray.length; i++) {
    //   System.out.print(stringArray[i] + " ");
    // }
  }
}



