/*Abraham Caban Rios
 * 10/29/2022
 * Module 2 Programming Assignment
 * The purpose of this program is to calculate how much energy it takes to heat up the entered value for the amount of water.
 */
import java.util.*;

public class WaterTemp {
        public static void main(String[] args){

            double waterMass;
            double initialTemperature;
            double finalTemperature;
            System.out.println("We are going to calculate how much energy it takes to heat up a certain amount of water.");

            try (Scanner input = new Scanner(System.in)) {
                System.out.println("\nEnter total of water mass in kilograms: ");
                waterMass = input.nextDouble();
   
                System.out.println("Enter inital water temperature in Celsius: ");
                initialTemperature = input.nextDouble();
   
                System.out.println("Enter final water temperature in Celcius: ");
                finalTemperature = input.nextDouble();
            }
                double q = (waterMass * (finalTemperature - initialTemperature)) * 4184;
    
            System.out.println("\nThe energy needed to heat water from " + initialTemperature + " Celcius to " + finalTemperature + " Celcius is " + q + " Joules.");
    
    
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

  

    }
}




