/*Abraham Caban Rios
 * Module 3
 * 4/2/2023
 * A test program that contains a static method that returns a new ArrayList.
The new ArrayList returned will contain all original values with no duplicates from the original ArrayList.
 */


import java.util.*;

public class AbrahamGenerics 
{
    public static void main(String[] args)
    {
        
        ArrayList<Integer> originalIntList = new ArrayList<>();

        Random randInt = new Random();
        for (int i = 0; i < 50; i++) 
        {
            originalIntList.add(randInt.nextInt(20) + 1);
        }
        System.out.println("");
        
        System.out.println("Original random integer list: " + originalIntList);
        System.out.println("");
        
        ArrayList<Integer> newIntList = listWNoDuplicates(originalIntList);
        
        System.out.println("New integer list with no repeated integers: " + newIntList);
        System.out.println("");

        ArrayList<Integer> testArrayListOne = new ArrayList<>();
        testArrayListOne.add(1);
        testArrayListOne.add(1);
        testArrayListOne.add(2);
        testArrayListOne.add(2);
        testArrayListOne.add(3);
        testArrayListOne.add(3);
        testArrayListOne.add(4);

        System.out.println("Test integer list one list: " + testArrayListOne);
        System.out.println("");

        ArrayList<Integer> testArrayListTwo = listWNoDuplicates(testArrayListOne);

        System.out.println("Test list two with no repeated integers: " + testArrayListTwo);
        System.out.println("");


    }
    
    public static <E> ArrayList<E> listWNoDuplicates(ArrayList<E> list) 
    {
        ArrayList<E> newIntList = new ArrayList<>();
        for (E element : list) 
        {
            if (!newIntList.contains(element)) 
            {
                newIntList.add(element);
            }
        }
        return newIntList;
    }
}

