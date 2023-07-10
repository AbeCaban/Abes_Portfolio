/*Abraham Caban Rios 11/6/2022 Substring in a string Module 4 
A program that prompts a user to enter two strings 
and then checks the strings entered and reports 
if either the first string is a substring of the second string, 
or if the second string is a substring of the first string.*/

import java.util.*;

public class String_in_a_substring {
    public static void main(String [] args){

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter first string: ");
            String firstString = input.nextLine();

            System.out.println("Enter second string: ");
            String secondString = input.nextLine();

        int subComp1 = firstString.indexOf(secondString);
        int subcomp2 = secondString.indexOf(firstString);

        if (firstString.equals(secondString))
            System.out.println("The first string is equal to the second string.");

        else if (subComp1 >= 0)
            System.out.println("The second string is a substring of the first string.");
        
        else if (subcomp2 >= 0)
            System.out.println("The first string is a substring of the second string.");
        
        else
            System.out.println("Neither string is a substring of the other.");
        }
        
    }
}