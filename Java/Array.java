/*Abraham Caban Rios 11/28/2022
 * Module 9 assignment
 * This is a program that reads the input of the user, and fills an array with 20 integers. 
 * Then, using the array elements, calculate the data to find and display the results.
*/

import java.util.*;
public class Array {
    static double sum = 0;
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter desired length of the array, preferably a length of 20: ");
            int arLength = input.nextInt();

            //Input of values
            
            double[]list = new double[arLength];
            System.out.print("Enter " + list.length + " values: ");

            // sum of values

            for(int i = 0; i < list.length; i++)
            {
                list[i] = input.nextDouble();
                sum += list[i];
            }
            
            System.out.println("The sum of all values entered is: " + sum);

            // Average of values

            double average = sum/arLength;
            System.out.println("The average of all values entered is: " + average);

            // Maximum of values

            double max = list[0];
            for(int i = 1; i < list.length; i++)
            {
                if (list[i] > max) max = list[i];
            }
            System.out.println("The maximum of all values entered is: " + max);

            // Minimum of values

            double min = list[0];
            for(int i = 1; i < list.length; i++)
            {
                if (list[i] < min) min = list[i];
            }
            System.out.println("The minimum of all values entered is: " + min);
        }
        
    }
}
