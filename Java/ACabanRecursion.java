/*
 * Abraham Caban Rios
 * Module 12
 * 5/13/2023
 * A Program that uses a recursive method that returns the sum of the following type inputs.
 * m(i) = 1/2 + 2/3 + 3/4 + 4/5 + 5/6 … i/(i + 1)
 * 
 * The program also uses three different input finishing values, testing your code to ensure it functions correctly.
 * Examples: m(4), m(9), m(14)
 */

public class ACabanRecursion {
    public static void main(String[] args) {
       // System.out.printf("%-10s%-15s\n", "i", "m(i)");
   
    //    for (int i = 1; i <= 5; i++)
    //        if (i == 5) {
                System.out.println("The sum of the first 5 inputs is " + recursionsFuntion(5) + ".");
                System.out.println(.5 + 2.0/3 + 3.0/4 + 4.0/5 + 5.0/6);
    //    }
   
    //    for (int i = 1; i <= 4; i++)
    //        if (i == 4) {
                System.out.println("Test of the sum of the first 4 inputs is " + recursionsFuntion(4) + ".");
    //    }
   
    //    for (int i = 1; i <= 9; i++)
    //        if (i == 9) {
                System.out.println("Test of the sum of the first 9 inputs is " + recursionsFuntion(9) + ".");
    //    }
   
    //    for (int i = 1; i <= 14; i++)
    //        if (i == 14) {
                System.out.println("Test of the sum of the first 14 inputs is " + recursionsFuntion(14) + ".");
    //    }
     }
   
     public static double recursionsFuntion(int i) {
       if (i == 1)
         return 1.0 / 2;
       else
         return recursionsFuntion(i - 1) + i * 1.0 / (i + 1);
   
   
     }
    //  public static double m(5) {
    //     if (i == 1)
    //       return 1.0 / 2;
    //     else
    //       return  .5 + 2/3 + 3/4 + 4/5 + 5/6;
    
    
    //   }     public static double m(4) {
    //     if (i == 1)
    //       return 1.0 / 2;
    //     else
    //       return .5 + 2 / 3 + 3/4 + 4/5;
    
    
    //   }     public static double m(3) {
    //     if (i == 1)
    //       return 1.0 / 2;
    //     else
    //       return .5 + 2 / 3 + 3/4;
    
    
    //   }     public static double m(2) {
    //     if (i == 1)
    //       return 1.0 / 2;
    //     else
    //       return .5 + 2 / 3;
    
    
    //   }     public static double m(1) {
    //     if (i == 1)
    //       return 1.0 / 2;
    //     else
    //       return m(i - 1) + i * 1.0 / (i + 1);
    
    //   }     
   
   }
