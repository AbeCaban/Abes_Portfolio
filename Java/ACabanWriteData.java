/*
 * Abraham Caban Rios Module 1 3/19/2023
 * This is a second program that will read the file and display the data.
 */

import java.io.*;
import java.text.*;
import java.util.*;



public class ACabanWriteData {
    DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) throws IOException
    {   
        Random randNum = new Random();

        int[] intArrayNum = new int[5];
        double[] doubleArrayNum = new double [5];
        

        
            for (int i = 0; i < 5; i++) 
            {
            intArrayNum[i] = randNum.nextInt(100);
            doubleArrayNum[i] = randNum.nextDouble() * 100;
            }
        
            Date dateOfCreation = new Date();
            FileOutputStream fiOStr = new FileOutputStream("Abrahamdatafile.dat", true);
            DataOutputStream datOStr = new DataOutputStream(fiOStr);

            for (int i = 0; i < 5; i++) {
                datOStr.writeInt(intArrayNum[i]);
            }
            datOStr.writeLong(dateOfCreation.getTime());
            
            for (int i = 0; i < 5; i++) {
                datOStr.writeDouble(doubleArrayNum[i]);
            }
            
            datOStr.close();
            fiOStr.close();
    }
    
}