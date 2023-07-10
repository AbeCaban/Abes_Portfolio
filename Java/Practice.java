import java.util.*;
import java.awt.Point;

public class Practice
// {
//     public static void main(String[] args){
//         System.out.println("got my new repository");
//     }
// }


// public boolean isPrime() {
//   {
//       if(this.abraham <= 1)
//       {
//           return false;
//       }
//       for(int i = 2; i <= this.abraham/2 ; i++)
//       {
//          if(( this.abraham % i) == 0)//residue of abraham divided by i
//              return  false;
//       }
//       return true;
//   }
// }

// //expresion en java para encontrar el cociente de abraham/3

// double a = abraham/3;


{
    public static void main(String[] args)
    {

      ArrayList<Integer> numbersAdded = new ArrayList<Integer>();
        Random random = new Random();
              for (int i = 1; i <= 10; i++) {
                  numbersAdded.add(random.nextInt(101));
              }

              numbersAdded.forEach((n)-> System.out.print(n + " "));

      // Point blank;
      // blank = new Point(3, 4);

      // System.out.println(blank);
      // int b = 5;
      // double a = b / 3;// a = cociente
      // System.out.println(a);
      // double c = b % 3; // c = modulo = residuo
      // System.out.println(c);
      // double d = a - c;
      // System.out.println(d);
      
    //   // CLASSES AND OBJECTS------------------------------------------------
    //   Pokemon Charmander = new Pokemon();  //object

    //   Charmander.name = "Charmander";
    //   Charmander.lvl = 15;
    //   Charmander.type = "Fire";
    //   System.out.println(Charmander.name + " is at lvl " + Charmander.lvl + " and is a " + Charmander.type + " type!");
    //   System.out.println();
    //   Charmander.attack();

    //   Pokemon Gengar = new Pokemon(); //object

    //   Gengar.name = "Gengar";
    //   Gengar.lvl = 15;
    //   Gengar.type = "Ghost";
    //   System.out.println(Gengar.name + " is at lvl " + Gengar.lvl + " and is a " + Gengar.type + " type!");
    //   System.out.println();
    //   Gengar.attack();


      // CLASSES AND OBJECTS------------------------------------------------



      // for (int i = 1; i < 10; i++) {
      //   System.out.print(" ");
      //   System.out.print(i);
      //   for (int j = 1; j < 10; j++) {
      //     System.out.print(" ");
      //     System.out.print(i * j);
          
      //   }
      //   System.out.println("");
      // }
      //         // Display the table heading
      //         System.out.println("           Multiplication Table");
          
      //         // Display the number title
      //         System.out.print("    ");
      //         for (int j = 1; j <= 9; j++)
      //           System.out.print("   " + j);
          
      //         System.out.println("\n-----------------------------------------");
          
      //         // Print table body
      //         for (int i = 1; i <= 9; i++) {
      //           System.out.print(i + " | ");
      //           for (int j = 1; j <= 9; j++) {
      //             // Display the product and align properly
      //             System.out.printf("%4d", i * j);
      //           }
      //           System.out.println();
      //         }
            }
    //         public static void print(Integer n)
    // {
    //     System.out.println(n);
    // }
          }
    



// public class  Practice{
//     public static void String_in_a_substring(String [] args){

//         Scanner input = new Scanner(System.in); 

//             System.out.println("Enter first string: ");
//             String firstString = input.nextLine();

//             System.out.println("Enter second string: ");
//             String secondString = input.nextLine();

//         int subComp1 = firstString.indexOf(secondString);
//         int subcomp2 = secondString.indexOf(firstString);

//         if (firstString.equals(secondString))
//             System.out.println("The first string is equal to the second string.");

//         else if (subComp1 >= 0)
//             System.out.println("The second string is a substring of the first string.");
        
//         else if (subcomp2 >= 0)
//             System.out.println("The first string is a substring of the second string.");
        
//         else
//             System.out.println("Neither string is a substring of the other.");
        
//     }
// }

// public class Practice{
//     public static void RockPaperScissors (String [] args){
//         try (Scanner input = new Scanner(System.in)) {
//             System.out.println("Enter 1 for Rock or 2 for Paper or 3 for Scissors.");
//             int userChoice = input.nextInt();
//             int aiRandomNum = (int) (Math.random() * 3) + 1; 

//             switch(aiRandomNum){
//                 case 1:System.out.println("Computer chose Rock");
//                 break;
//                 case 2:System.out.println("Computer chose Paper");
//                 break;
//                 case 3:System.out.println("Computer chose Scissors");
//                 break;
//             }
//             switch(userChoice){
//                 case 1: System.out.println("You chose Rock");
//                 break;
//                 case 2: System.out.println("You chose Paper");
//                 break;
//                 case 3: System.out.println("You chose Scissors");
//                 break;
//             }
//             if (aiRandomNum == userChoice){
//                 System.out.println("It's a tie");
//             } else if (aiRandomNum == 1 && userChoice == 2){
//                 System.out.println("You WON.");
//             } else if (aiRandomNum == 2 && userChoice == 1){
//                 System.out.println("You LOST.");
//             } else if (aiRandomNum == 2 && userChoice == 3){
//                 System.out.println("You WON.");
//             } else if (aiRandomNum == 3 && userChoice == 2){
//                 System.out.println("You LOST.");
//             } else if (aiRandomNum == 3 && userChoice == 1){
//                 System.out.println("You WON.");
//             } else if (aiRandomNum == 1 && userChoice == 3){
//                 System.out.println("You LOST.");}
//         }
//  }
// }
// public class Practice{
//     // exersice 1
//     public static void main(String[] args){
//         printlnTest({"got my new repository", "Welcome to Java", "Programing is fun"})
//     } 
//     public static void printlnTest(String[] args){
//         System.out.println(args[0]);
//         System.out.println("Welcome to Java");
//         System.out.println("Programing is fun");
//         // System.out.println("got my new repository");
//         // System.out.println("Welcome to Java");
//         // System.out.println("Programing is fun");
//     }
//     // exersice 2
//     public static void printJava(){ //(String[] args){
//         System.out.println("   j    a    v     v    a");
//         System.out.println("   j   a a    v   v    a a");
//         System.out.println("j  j  aaaaa    v v    aaaaa");
//         System.out.println(" jj  a     a    v    a     a");
//     }

// }


// public class Practice{
//     public static void main(String[] args){
//         float f1 = 35e4f;
//         double d1 = 25E5f;
//         System.out.println(f1);
//         System.out.println(d1);


//     }
// }
      
// public class Practice{
//     public static void main(String[] args){
//         boolean isJavaFun = true;
//         boolean isFishTasty = false;
//         System.out.println(isJavaFun);
//         System.out.println(isFishTasty);

//     }
// }

// public class Practice{
//     public static void main(String[] args){
//         char myGrade = 'A';
//         System.out.println(myGrade);
//     }
// }

// public class Practice{
//     public static void main(String[] args){
//         char myVar1 = 65, myVar2 = 66, myVar3 = 67;
//         System.out.println(myVar1);
//         System.out.println(myVar2);
//         System.out.println(myVar3);

//     }
// }
 
// public class Practice{
//     public static void main(String[] args){
//         int myInt = 9;
//         double myDouble= myInt;
//         System.out.println(myInt);
//         System.out.println(myDouble);
//     }
// }
// import java.util.*;

// public class Practice{
//     public static void main(String[] args){
//         double waterMass;
//         double initialTemperature;
//         double finalTemperature;
//         try (Scanner input = new Scanner(System.in)) {
//             System.out.println("Enter total kilograms of water mass: ");
//             waterMass = input.nextDouble();

//             System.out.println("Enter inital water temperature in Celsius: ");
//             initialTemperature = input.nextDouble();

//             System.out.println("Enter final water temperature in Celcius: ");
//             finalTemperature = input.nextDouble();
//         }

      
        
//         double Q = (waterMass * (finalTemperature - initialTemperature)) * 4184;

//         System.out.println("\nThe energy needed to heat water from an initial temperature to a final temperature is " + Q + " Joules.");

//     }
// }

// import java.util.*;
// import javax.swing.*;

// public class WaterTemp {
//         public static void main(String[] args){

    //         double waterMass;
    //         double initialTemperature;
    //         double finalTemperature;
    //         System.out.println("We are going to calculate how much energy it takes to heat up a certain amount of water.");

    //         try (Scanner input = new Scanner(System.in)) {
    //             System.out.println("\nEnter total of water mass in kilograms: ");
    //             waterMass = input.nextDouble();
   
    //             System.out.println("Enter inital water temperature in Celsius: ");
    //             initialTemperature = input.nextDouble();
   
    //             System.out.println("Enter final water temperature in Celcius: ");
    //             finalTemperature = input.nextDouble();
    //         }
    //             double q = (waterMass * (finalTemperature - initialTemperature)) * 4184;
    
    //         System.out.println("\nThe energy needed to heat water from " + initialTemperature + " Celcius to " + finalTemperature + " Celcius is " + q + " Joules.");
    
    
// DIFERENT EXSERSISE SAME OUTPUT


//     double waterMass;
//     double initialTemperature;
//     double finalTemperature;
//     String stringInput;
//     String stringInput1;
//     String stringInput2;



//         stringInput = JOptionPane.showInputDialog(null, "Enter total of water mass in kilograms", "Input dialog", JOptionPane.QUESTION_MESSAGE);

//         waterMass = Double.parseDouble(stringInput);

//         stringInput1 = JOptionPane.showInputDialog(null, "Enter inital water temperature in Celsius: ", "Input dialog", JOptionPane.QUESTION_MESSAGE);

//         initialTemperature = Double.parseDouble(stringInput1);

//         stringInput2 = JOptionPane.showInputDialog(null, "Enter final water temperature in Celcius: ", "Input dialog", JOptionPane.QUESTION_MESSAGE);
  
//         finalTemperature = Double.parseDouble(stringInput2);


//         JOptionPane.showMessageDialog(null, (waterMass * (finalTemperature - initialTemperature)) * 4184, "Claculated Jo", JOptionPane.INFORMATION_MESSAGE);

  

//     }
// }

