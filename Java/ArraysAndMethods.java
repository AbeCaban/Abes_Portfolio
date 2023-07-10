/*Abraham Caban Rios Module 10 assignment 12/10/2022
 * 
 * This is a test program that invokes each of these methods and 
 * then displays the average value returned along with a display of the original array elements.
*/

public class ArraysAndMethods {
    public static void main(String[] args) {

        int list1[] = {2, 4, 6, 8};
        double list2[] = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        long list3[] = {13035, 23075, 42095, 56015, 89065};
        short list4 [] = {12, 23, 45, 56, 78, 89, 96};
        
        
        ArraysAndMethods.average(list1);
        ArraysAndMethods.average(list3);
        ArraysAndMethods.average(list2);
        ArraysAndMethods.average(list4);
        }


            public static int average(int [] array)
            {
            int sum = 0;
            for(int i = 0; i < array.length; i++)
            {
                sum += array[i];
            }
            int avg = sum/array.length;
            System.out.println("The average of this 'int' array is: " + avg +"\n");
            System.out.println("The elements of this 'int' array are:");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
              }
              System.out.println("\n");
            return (avg);
            }
    
            public static long average(long [] array)
            {
                long sum = 0;
                for(int i = 0; i < array.length; i++)
                {
                    sum += array[i];
                }
                long avg = sum/array.length;
                System.out.println("The average of this 'long' array is: " + avg +"\n");
                System.out.println("The elements of this 'long' array are:");
                for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i]);
                  }
                System.out.println("\n");
                return (avg);
                }
    
            public static double average(double [] array)
            {
                double sum = 0;
                for(int i = 0; i < array.length; i++)
                {
                    sum += array[i];
                }
                double avg = sum/array.length;
                System.out.println("The average of this 'double' array is: " + avg +"\n");
                System.out.println("The elements of this 'double' array are:");
                for (int i = 0; i < array.length; i++)
                {
                    System.out.println(array[i]);
                }
                System.out.println("\n");
    
                return (avg);
                }
    
            public static short average(short [] array)
            {
                short sum = 0;
                for(int i = 0; i < array.length; i++)
                {
                    sum += array[i];
                }
                short avg = (short) (sum/array.length);
                System.out.println("The average of this 'short' array is: " + avg +"\n");
                System.out.println("The elements of this 'short' array are:");
                for (int i = 0; i < array.length; i++)
                {
                    System.out.println(array[i]);
                }
                System.out.println("\n");
    
                return (avg);
                }
}
