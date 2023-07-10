/*Abraham Caban Rios 11/25/2022 module 7
A method that checks whether a user's input String is a valid password.

Resources:
Persons. Programming exercises solutions. Retrieved from.
https://media.pearsoncmg.com/ph/esm/ecs_liang_ijp_12/cw/#solutions

 */

public class Methods_module7 {
    public static void main(String[] args) {
      try (// Prompt the user to enter a password
      java.util.Scanner input = new java.util.Scanner(System.in)) {
        System.out.print("Enter a string for password that includes"+
        "\nlowercase letters"+"\nupper case letters"+
        "\nand digits\nit has to be 8 characters long"+
        "\ndo NOT include special characters: ");
        String s = input.nextLine();
 
        if (isValidPassword(s)) 
        {
          System.out.println("Valid Password");
        }
        else 
        {
          System.out.println("Invalid Password");
        }
      }
    }
  
    //  Check if a string is a valid password
    public static boolean isValidPassword(String s) {
      
      var lowerCaseCount = 0;
      var upperCaseCount = 0;
      var digitCount = 0;

      // Check the string for upper case letters, lower case letters, or digits.
      for (int i = 0; i < s.length(); i++) 
      {
        if (!Character.isUpperCase(s.charAt(i)) && !Character.isDigit(s.charAt(i)) && !Character.isLowerCase(s.charAt(i)))
          return false;
        
        if (Character.isDigit(s.charAt(i)))
          digitCount++;

        if (Character.isUpperCase(s.charAt(i)))
          upperCaseCount++;

        if (Character.isLowerCase(s.charAt(i)))
          lowerCaseCount++;
      } 
     
    if (digitCount == 0)    
        return false;


    if (upperCaseCount == 0)    
        return false;

      
    if (lowerCaseCount == 0)    
        return false;
    
    // Check if the password has the right length.
    if (s.length() < 8)
       return false;
    else
        return true;
    }
  }
   