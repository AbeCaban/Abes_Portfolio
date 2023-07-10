/*Abraham Caban Rios Module 11 assignment 12/12/2022
 * 
 * This is a test program that invokes methods that returns the location of 
 * the largest element in the array passed to the method returning a one-dimensional 
 * array that contains two location elements.
 * 
 * Then two methods that return the location of the smallest element in the array
 * passed to the method returning a one-dimensional array that contains two location elements.
 * 
 * I found this exercise from the textbook to help me understand the instructions.
 * mlnorman Dec 8, 2015. Exercise_08_13.java Retrieved from
 * https://github.com/mlnorman/Intro-To-Java-Programming/blob/master/Chp8/Exercise_08_13.java
 * 
 * I made the methods so they printed the randomized creation of each multidimensional array and also print 
 * the location elements of the one-dimensional array.
*/
import java.util.*;
import java.text.*;
public class Multidimension_array_LargeSmall {
    private static final DecimalFormat df = new DecimalFormat("0.000");
    public static void main(String[] args) {

        double [][] doubleArray = new double[5][5];
        int [][] intArray = new int[5][5];

    // used the examples from the class videos to automaticly fill the arrays---------------
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray.length; j++) {
                doubleArray[i][j] = (double)(Math.random() * 90 + 10);               
            }
        }
        
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray.length; j++) {
                intArray[i][j] = (int)(Math.random() * 90 + 10);               
            }
        }


        Multidimension_array_LargeSmall.locateLargest(doubleArray);
        Multidimension_array_LargeSmall.locateLargest(intArray);
        Multidimension_array_LargeSmall.locateSmallest(doubleArray);
        Multidimension_array_LargeSmall.locateSmallest(intArray);
        
    }
    // location of largest element-------------------
    public static int [] locateLargest (double [][] arrayParam){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Multidimensional array");
        // ------------------used examples from the class videos to printing the arrays---------------
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = " + df.format(arrayParam[i][j]) + " ");
            }
            System.out.println();
        }
        System.out.println();

        int [] locationElement = new int [] {0,0};
        double maxVal = arrayParam[0][0];
        // ------------------Finding the location elements--------------
        for (int i = 0; i < arrayParam.length; i++)
        {
            for (int j = 0; j < arrayParam[i].length; j++)
            {
                if (arrayParam[i][j] > maxVal)
                {
                    locationElement [0] = i;
                    locationElement [1] = j;
                    maxVal = arrayParam[i][j];
                }
            }
        }
        System.out.println("The location of the largest double value in the multidimensional array is:");
        System.out.println(Arrays.toString(locationElement));        
        System.out.println("-------------------------------------------------------------");
       
        return locationElement;
    
    }
    
    public static int [] locateLargest (int [][] arrayParam){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Multidimensional array");
        // ------------------Printing the arrays---------------
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = " + arrayParam[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int [] locationElement = new int [] {0,0};
        int maxVal = arrayParam[0][0];
        // ------------------Finding the location elements--------------
        for (int i = 0; i < arrayParam.length; i++)
        {
            for (int j = 0; j < arrayParam[i].length; j++)
            {
                if (arrayParam[i][j] > maxVal)
                {
                    locationElement [0] = i;
                    locationElement [1] = j;
                    maxVal = arrayParam[i][j];
                }
            }
        }
        System.out.println("The location of the largest int value in the multidimensional array is:");
        System.out.println(Arrays.toString(locationElement));        
        System.out.println("-------------------------------------------------------------");
       
        return locationElement;
    
    }

    // // location of smallest element
    public static int [] locateSmallest (double [][] arrayParam){
        System.out.println("-------------------------------------------------------------");
        System.out.println("Multidimensional array");
        // ------------------Printing the arrays---------------
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = " + df.format(arrayParam[i][j]) + " ");
            }
            System.out.println();
        }
        System.out.println();

        int [] locationElement = new int [] {0,0};
        double minVal = arrayParam[0][0];
        // ------------------Finding the location elements--------------
        for (int i = 0; i < arrayParam.length; i++)
        {
            for (int j = 0; j < arrayParam[i].length; j++)
            {
                if (arrayParam[i][j] < minVal)
                {
                    locationElement [0] = i;
                    locationElement [1] = j;
                    minVal = arrayParam[i][j];
                }
            }
        }
        System.out.println("The location of the smalest double value in the multidimensional array is:");
        System.out.println(Arrays.toString(locationElement));        
        System.out.println("-------------------------------------------------------------");
       
        return locationElement;
    
        }

    public static int [] locateSmallest (int [][] arrayParam){
                System.out.println("-------------------------------------------------------------");
        System.out.println("Multidimensional array");       
        // ------------------Printing the arrays---------------
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = " + arrayParam[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int [] locationElement = new int [] {0,0};
        double minVal = arrayParam[0][0];
        // ------------------Finding the location elements--------------
        for (int i = 0; i < arrayParam.length; i++)
        {
            for (int j = 0; j < arrayParam[i].length; j++)
            {
                if (arrayParam[i][j] < minVal)
                {
                    locationElement [0] = i;
                    locationElement [1] = j;
                    minVal = arrayParam[i][j];
                }
            }
        }
        System.out.println("The location of the smalest int value in the multidimensional array is:");
        System.out.println(Arrays.toString(locationElement));        
        System.out.println("-------------------------------------------------------------");
       
        return locationElement;
    
    }

}
