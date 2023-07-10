/*Abraham Caban Rios 1/28/2023

This is a program that uses an ArrayList filled with a minimum of 10 Strings. 
Use a ‘for-each’ loop to print the ArrayList collection. 
Then ask a user which element they would like to see again. 
Then, attempt printing the element in a try/catch format which will result in the element being display. 
If the element value received is invalid, display a message that an Exception has been thrown displaying “Out of Bounds”. 
In this program, include the use of Autoboxing/Auto-Unboxing, working with a user String input. */


import java.util.*;
// import java.io.*;


public class AbrahamPickingArrayListElement {
  //  static String userChoice;
  public static void main(String[] args) {
    // Creating an array list
    ArrayList<String> justStrings = new ArrayList<String>();
    justStrings.add("1. Java");
    justStrings.add("2. JavaScript");
    justStrings.add("3. Ready Player One");
    justStrings.add("4. Python");
    justStrings.add("5. Numbers");
    justStrings.add("6. Leters");
    justStrings.add("7. Beer");
    justStrings.add("8. Fifth Element");
    justStrings.add("9. Vodka");
    justStrings.add("10. Wine");


    System.out.println(" ");

        // Using forEach loop
    for(String element : justStrings) {
      System.out.println(element);
    }

    System.out.println(" ");
    System.out.println(" ");
    
        try (Scanner input = new Scanner(System.in)) {
          System.out.print("Which element number would you like to see again: ");
          String userChoice = input.next();

  try {  // Autoboxing/Auto-Unboxing, working with a user String input.
          int integerUseerChoice = Integer.parseInt(userChoice);

          Integer boxedNumbr = integerUseerChoice;
          int unBoxedNumbr = boxedNumbr;

          //try catch
 
          justStrings.get(unBoxedNumbr - 1);
          System.out.println(" ");

          System.out.println("You chose " + justStrings.get(unBoxedNumbr - 1));

          System.out.println(" ");

  } 
  catch (Exception e) {
          
          System.out.println("Out of Bounds.");
          System.out.println("You chose " + userChoice);

          System.out.println(" ");
          System.out.println(" ");

          
  }
        }

  }
  


//   public static void printStrings(String n)
//   {
//       System.out.println(n+" ");
//   }


// class ReedAndWriteAFile{
//     public static void main(String[] args) {

//         //randomly generate 10 numbers and ad it to an ArrayList for

//         ArrayList<Integer> numbersAdded = new ArrayList<Integer>();
//         Random random = new Random();
//               for (int i = 1; i <= 10; i++) {
//                   numbersAdded.add(random.nextInt(101));
//               }

//             //   numbersAdded.forEach((n)-> printInt(n));
//             //   for (int i = 0; i < numbersAdded.size(); i++) {
//             //     System.out.print(numbersAdded.get(i) + ", ");
//             //   }
        
//         try {
//             BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
//             // writer.write("writing to a file");
            
//             for (Integer numberAdded : numbersAdded) {
//                 writer.write("\n" + numberAdded);
//             }
//             writer.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//         try {
//             BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
//             String line;
//             while ((line = reader.readLine()) != null) {
//                 System.out.println(line);
//             }
//             reader.close();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
//     // public static void printInt(Integer n)
//     // {
//     //     System.out.println(n+" ");
//     // }
// }
}