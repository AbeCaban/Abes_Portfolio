import java.io.*;
import java.util.*;

public class ACabanArrDateDArrW {

    public static void main(String[] args) {


        Random randNum = new Random();
        int [] intArr = new int[5];
        Date currentDate = new Date();
        double[] doubleArr = new double [5];

            for (int i = 0; i < 5; i++) {
                doubleArr[i] = (randNum.nextDouble() * 50);
                intArr[i] = (randNum.nextInt(150));
            }
            System.out.println(" ");
            try {
                File aF2File = new File("Abrahamdatafile2.data");
                if (aF2File.createNewFile()) {
                  System.out.println("File created: " + aF2File.getName());
                } else {
                  System.out.println("File already exists.");
                }
              } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }

              try {
            //     Date dateOfCreation = new Date();
            // FileOutputStream fiOStr = new FileOutputStream("Abrahamdatafile2.dat", true);
            // DataOutputStream datOStr = new DataOutputStream(fiOStr);
                FileOutputStream fiOStr = new FileOutputStream("Abrahamdatafile.dat", true);
            DataOutputStream myWriter = new DataOutputStream(fiOStr);

                for (int i = 0; i < 5; i++) {
                    myWriter.write((int) doubleArr[i]);
                }
                
                myWriter.writeLong(currentDate.getTime()); 

                for (int i = 0; i < 5; i++) {
                    myWriter.write(intArr[i]);
                }
                // for (int i = 0; i < intArr.length; i++) {
                //     myWriter.write(intArr[i]);
                // }
                myWriter.close();

                System.out.println("Successfully wrote to the file.");
                System.out.println(" ");


              } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
              }
            System.out.println(Arrays.toString(intArr)); 
            System.out.println(currentDate);
            System.out.println(Arrays.toString(doubleArr));
            System.out.println(" ");
    }
}
