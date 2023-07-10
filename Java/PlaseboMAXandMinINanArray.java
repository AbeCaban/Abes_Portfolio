
import java.text.*;
import java.util.Arrays;
public class PlaseboMAXandMinINanArray {
    
    private static final DecimalFormat df = new DecimalFormat("0.000");
    public static void main(String[] args) {

        double [][] doubleArray = new double[10][10];
        int [][] intArray = new int[10][10];
        // double [][] doubleSmallArray = new double[10][10];
        // int [][] intSmallArray = new int[10][10];

        // used the examples from the class videos to automaticly fill the arrays
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

        // for (int i = 0; i < doubleSmallArray.length; i++) {
        //     for (int j = 0; j < doubleSmallArray.length; j++) {
        //         doubleSmallArray[i][j] = (double)(Math.random() * 90 + 10);               
        //     }
        // }

        // for (int i = 0; i < intSmallArray.length; i++) {
        //     for (int j = 0; j < intSmallArray.length; j++) {
        //         intSmallArray[i][j] = (int)(Math.random() * 90 + 10);               
        //     }
        // }
        
        PlaseboMAXandMinINanArray.locateLargest(doubleArray);
        PlaseboMAXandMinINanArray.locateLargest(intArray);
        PlaseboMAXandMinINanArray.locateSmallest(doubleArray);
        PlaseboMAXandMinINanArray.locateSmallest(intArray);
        
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
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = " + arrayParam[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int [] locationElement = new int [] {0,0};
        int maxVal = arrayParam[0][0];
    
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
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = " + df.format(arrayParam[i][j]) + " ");
            }
            System.out.println();
        }
        System.out.println();

        int [] locationElement = new int [] {0,0};
        double maxVal = arrayParam[0][0];
    
        for (int i = 0; i < arrayParam.length; i++)
        {
            for (int j = 0; j < arrayParam[i].length; j++)
            {
                if (arrayParam[i][j] < maxVal)
                {
                    locationElement [0] = i;
                    locationElement [1] = j;
                    maxVal = arrayParam[i][j];
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
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                System.out.print("[" + i + "][" + j + "] = " + arrayParam[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int [] locationElement = new int [] {0,0};
        double maxVal = arrayParam[0][0];
    
        for (int i = 0; i < arrayParam.length; i++)
        {
            for (int j = 0; j < arrayParam[i].length; j++)
            {
                if (arrayParam[i][j] < maxVal)
                {
                    locationElement [0] = i;
                    locationElement [1] = j;
                    maxVal = arrayParam[i][j];
                }
            }
        }
        System.out.println("The location of the smalest int value in the multidimensional array is:");
        System.out.println(Arrays.toString(locationElement));        
        System.out.println("-------------------------------------------------------------");
       
        return locationElement;
    
    }

}


