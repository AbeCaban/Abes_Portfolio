/*Abraham Caban Rios 1/28/2023

This is a program to create a new file titled data.file, if the file does not exist. 
Then write to the new file, adding 10 randomly generated numbers, or append 10 randomly generated numbers to a previous file. 
Each integer is to be separated by a space. 
Close the file, then reopen the file and read the data from the file and display it. */

import java.io.*;
import java.util.*;

public class ReadAndWriteAFile {
    public static void main(String[] args) {

        //randomly generate 10 numbers and ad it to an ArrayList for

        ArrayList<Integer> numbersAdded = new ArrayList<Integer>();
        Random random = new Random();
              for (int i = 1; i <= 10; i++) {
                  numbersAdded.add(random.nextInt(101));
              }

            //   numbersAdded.forEach((n)-> printInt(n));
            //   for (int i = 0; i < numbersAdded.size(); i++) {
            //     System.out.print(numbersAdded.get(i) + ", ");
            //   }
        
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
            // writer.write("writing to a file");
            
            for (Integer numberAdded : numbersAdded) {
                writer.write(" " + numberAdded);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    // public static void printInt(Integer n)
    // {
    //     System.out.println(n+" ");
    // }
}
    

