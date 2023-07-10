/*Abraham Caban Rios
 * Module 4
 * 4/2/2023
 * A test program that stores 50,000 integers in LinkedList and test the time to traverse the list using an iterator vs. using the get(index) method.
 * 
 */

import java.util.*;

public class AbrahamTestTimeList 
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> linkedIntList = new LinkedList<Integer>();

        for (int i = 0; i < 50000; i++) 
        {
            linkedIntList.add(i);
        }

        long startTimeOne = System.nanoTime();
        Iterator<Integer> iterator = linkedIntList.iterator();
        while (iterator.hasNext()) 
        {
            iterator.next();
        }

        long firstTimer = System.nanoTime();
        long firstDuration = (firstTimer - startTimeOne) / 1000000;

        System.out.println("");  
        System.out.println("Time that it took using iterator for (50,000 integers) was: " + firstDuration + " ms");
        System.out.println("");


        long secondStartTime = System.nanoTime();
        for (int i = 0; i < linkedIntList.size(); i++) 
        {
            linkedIntList.get(i);
        }
        long secondEndTime = System.nanoTime();
        long secondDuration = (secondEndTime - secondStartTime) / 1000000;

        System.out.println("");
        System.out.println("Time that it took using get(index) for (50,000 integers) was: " + secondDuration + " ms");
        System.out.println("");


        LinkedList<Integer> secondLinkList = new LinkedList<Integer>();
        for (int i = 0; i < 500000; i++) 
        {
            secondLinkList.add(i);
        }

        long thirdStartTime = System.nanoTime();
        Iterator<Integer> secondIter = secondLinkList.iterator();
        while (secondIter.hasNext()) 
        {
            secondIter.next();
        }

        long thirdEndTime = System.nanoTime();
        long thirdDuration = (thirdEndTime - thirdStartTime) / 1000000;
        
        System.out.println(""); 
        System.out.println("Time that it took using iterator for (500,000 integers) was: " + thirdDuration + " ms");
        System.out.println("");

        System.out.println("Please wait. this will take a while...");


        long forthStartTime = System.nanoTime();
        for (int i = 0; i < secondLinkList.size(); i++) 
        {
            secondLinkList.get(i);
        }

        long forthEndTime = System.nanoTime();
        long forthDuration = (forthEndTime - forthStartTime) / 1000000; 

        System.out.println("");
        System.out.println("Time taken using get(index) for (500,000 integers) was: " + forthDuration + " ms");
        System.out.println("");


        

//test code

        LinkedList<Integer> testlinkedIntList = new LinkedList<Integer>();

        for (int i = 0; i < 1000; i++) 
        {
            testlinkedIntList.add(i);
        }
        LinkedList<Integer> testsecondLinkList = new LinkedList<Integer>();
        for (int i = 0; i < 10000; i++) 
        {
            testsecondLinkList.add(i);
        }
        long testforthStartTime = System.nanoTime();
        for (int i = 0; i < testsecondLinkList.size(); i++) 
        {
            testsecondLinkList.get(i);
        }

        long testforthEndTime = System.nanoTime();
        long testforthDuration = (testforthEndTime - testforthStartTime) / 1000000; 

        System.out.println("");
        System.out.println("Time taken using get(index) for (1,000 integers) was: " + testforthDuration + " ms");
        System.out.println("");



        long testthirdStartTime = System.nanoTime();
        Iterator<Integer> testsecondIter = testsecondLinkList.iterator();
        while (testsecondIter.hasNext()) 
        {
            testsecondIter.next();
        }

        long testthirdEndTime = System.nanoTime();
        long testthirdDuration = (testthirdEndTime - testthirdStartTime) / 1000000;
        
        System.out.println(""); 
        System.out.println("Time that it took using iterator for (10,000 integers) was: " + testthirdDuration + " ms");
        System.out.println("");



        System.exit(0);
        

    }
    
}

/*The results of a test showed that using an 'iterator' to 
move through a 'LinkedList' was quicker than using the 'get(index)' 
method because the 'iterator' only needs to look at the links 
between elements rather than going through every element to find 
the one with a specific index. The time taken to go through the 
'LinkedList' increases as the number of elements goes up but using 
an 'iterator' is still faster than the 'get(index)' method. To check 
if the code works properly, we can make sure that using an 'iterator' 
always takes less time than the 'get(index)' method and also test 
the code with different numbers of elements in the 'LinkedList'.*/