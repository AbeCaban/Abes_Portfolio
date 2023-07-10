import java.util.*;
public class PracticeArray {
    
    // static double sum = 0;
    public static void main(String[] args) {

    int list1[]  = {2, 4, 6, 8};
    double list2[] = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
    long list3[] = {130, 230, 420, 560, 890};
    short list4 [] = {12, 23, 45, 56, 78, 89, 96};
    
    PracticeArray.average(list1);
    PracticeArray.average(list3);
    PracticeArray.average(list2);
    PracticeArray.average(list4);
    }
        public static int average(int [] array)
        {
        int sum = 0;
        for(int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        int aver = sum/array.length;
        System.out.println("The average of this 'int' array is: " + aver +"\n");
        System.out.println("The elements of this 'int' array are:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
          }
          System.out.println("\n");
        return (aver);
        }

        public static long average(long [] array)
        {
            long sum = 0;
            for(int i = 0; i < array.length; i++)
            {
                sum += array[i];
            }
            long aver = sum/array.length;
            System.out.println("The average of this 'long' array is: " + aver +"\n");
            System.out.println("The elements of this 'long' array are:");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
              }
            System.out.println("\n");
            return (aver);
            }

        public static double average(double [] array)
        {
            double sum = 0;
            for(int i = 0; i < array.length; i++)
            {
                sum += array[i];
            }
            double aver = sum/array.length;
            System.out.println("The average of this 'double' array is: " + aver +"\n");
            System.out.println("The elements of this 'double' array are:");
            for (int i = 0; i < array.length; i++)
            {
                System.out.println(array[i]);
            }
            System.out.println("\n");

            return (aver);
            }

        public static short average(short [] array)
        {
            short sum = 0;
            for(int i = 0; i < array.length; i++)
            {
                sum += array[i];
            }
            short aver = (short) (sum/array.length);
            System.out.println("The average of this 'short' array is: " + aver +"\n");
            System.out.println("The elements of this 'short' array are:");
            for (int i = 0; i < array.length; i++)
            {
                System.out.println(array[i]);
            }
            System.out.println("\n");

            return (aver);
            }
        
    

        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter desired length of the array: ");
        // int arLength = input.nextInt();

        
        // double[]list = new double[arLength];
        // System.out.print("Enter " + list.length + " values: ");

        
        // for(int i = 0; i < list.length; i++)
        // {
        //     list[i] = input.nextDouble();
        //     sum += list[i];
        // }
        
        // System.out.println("The sum of all values entered is: " + sum);

        
        // double average = sum/arLength;
        // System.out.println("The average of all values entered is: " + average);


        // double max = list[0];
        // for(int i = 1; i < list.length; i++)
        // {
        //     if (list[i] > max) max = list[i];
        // }
        // System.out.println("The maximum of all values entered is: " + max);

            
        // double min = list[0];
        // for(int i = 1; i < list.length; i++)
        // {
        //     if (list[i] < min) min = list[i];
        // }
        // System.out.println("The minimum of all values entered is: " + min);


        // ----------------------------------------------------------------------------
          // double min = Collections.min(Arrays.asList(list));


        // public static void main(String[] args)
        // {
     
            // Initializing array of integers
            // Integer[] num = { 2, 4, 7, 5, 9 };
     
            // using Collections.min() to
            // find minimum element
            // using only 1 line.
            // int min = Collections.min(Arrays.asList(num));
     
            // using Collections.max()
            // to find maximum element
            // using only 1 line.
            // int max = Collections.max(Arrays.asList(num));
     
            // printing minimum and maximum numbers
            // System.out.println("Minimum number of array is : "
            //                    + min);
            // System.out.println("Maximum number of array is : "
            //                    + max);
        
   
        // int indexOfMax = 0;
        // for(int i = 1; i < cars.length; i++ ){
        //     if (cars[i] > max) {
        //         max = cars[i];
        //         indexOfMax = i;
        //     }
        // }
        // System.out.println(indexOfMax);


        // double max = Collections.max(Arrays.asList(cars));

            // System.out.println(Math.max());
        // for(int i = 0; i < cars.length; i++)
        //     System.out.print(cars[i]);
        
        
        // cars[0] = "camaro";
        // cars[1] = "corvete";
        // cars[2] = "Tesla";

        // // System.out.println(cars[1]);

     
        // double[] cars = {"camaro", "corvette", "tessla","BMW"};
        // cars[0] = "mustang";
        // System.out.println(cars[3]);
      
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // System.out.println(cars.length);
    
}


