/*
 * Abraham Caban Rios Module 1 5/19/2023
A program that stores:
    An array of five random integers
    A Date objective instance using the current date
    An array of five random double values
 */

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class AcabanReadData {
    public static void main(String[] args) throws IOException{

            FileInputStream fiOStr = new FileInputStream("Abrahamdatafile.dat");
        try (DataInputStream datOStr = new DataInputStream(fiOStr))
        {
            int[] intArrayNum = new int[5];
            double[] doubleArrayNum = new double[5];
            
            for (int i = 0; i < 5; i++) 
            {
                intArrayNum[i]= datOStr.readInt();
            }

            long dateLong = datOStr.readLong();
            Date date = new Date(dateLong);

            for (int i = 0; i < 5; i++) 
            {
                doubleArrayNum[i] = datOStr.readDouble();
            }

            DecimalFormat df = new DecimalFormat("0.00");


            System.out.println("Array numbers" + Arrays.toString(intArrayNum));
            System.out.println("Date of creation of file: " + date);
            Arrays.stream(doubleArrayNum).forEach(e -> System.out.print(df.format(e) + " " ));
        }
    }
}
