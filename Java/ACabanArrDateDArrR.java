

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;


public class ACabanArrDateDArrR {
    public static void main(String[] args) throws FileNotFoundException {
        
            try {
                //     Date dateOfCreation = new Date();
                // FileOutputStream fiOStr = new FileOutputStream("Abrahamdatafile2.dat", true);
                // DataOutputStream datOStr = new DataOutputStream(fiOStr);
                FileInputStream fiOStr = new FileInputStream("Abrahamdatafile2.data");

                try (DataInputStream myreadr = new DataInputStream(fiOStr)){
                
                int [] intArr = new int[5];
                double[] doubleArr = new double [5];
    
                    for (int i = 0; i < 5; i++) {
                        doubleArr[i] = myreadr.readDouble();
                    }
                    
                    long dateLong = myreadr.readLong();
                     Date date = new Date(dateLong);

                    for (int i = 0; i < 5; i++) {
                        intArr[i]= myreadr.readInt();
                    }
                    // for (int i = 0; i < intArr.length; i++) {
                    //     myreadr.read(intArr[i]);
                    // }
                    myreadr.close();
    
                    
                    
                    // DecimalFormat df = new DecimalFormat("0.00");

                    System.out.println("Array numbers" + Arrays.toString(intArr));
                    System.out.println("Date of creation of file: " + date);
                    System.out.println("Array numbers" + Arrays.toString(doubleArr));

                    // Arrays.stream(doubleArr).forEach(e -> System.out.print(df.format(e) + " " ));
    
    
                  } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                  }

            
        
        
    }
    finally{
        System.out.println(" ");
    }
}
}
