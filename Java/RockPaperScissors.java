//Abraham Caban Rios 11/6/2022 Rock-Paper-Scissors Module 3
// A program that is similar to the popular game titled “Rock-Paper-Scissors.”
import java.util.*;
public class RockPaperScissors{
    public static void main (String [] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter 1 for Rock or 2 for Paper or 3 for Scissors.");
            int userChoice = input.nextInt();
            int aiRandomNum = (int) (Math.random() * 3) + 1; 

            switch(aiRandomNum){
                case 1:System.out.println("Computer chose Rock");
                break;
                case 2:System.out.println("Computer chose Paper");
                break;
                case 3:System.out.println("Computer chose Scissors");
                break;
            }
            switch(userChoice){
                case 1: System.out.println("You chose Rock");
                break;
                case 2: System.out.println("You chose Paper");
                break;
                case 3: System.out.println("You chose Scissors");
                break;
            }
            if (aiRandomNum == userChoice){
                System.out.println("It's a tie");
            } else if (aiRandomNum == 1 && userChoice == 2){
                System.out.println("You WON.");
            } else if (aiRandomNum == 2 && userChoice == 1){
                System.out.println("You LOST.");
            } else if (aiRandomNum == 2 && userChoice == 3){
                System.out.println("You WON.");
            } else if (aiRandomNum == 3 && userChoice == 2){
                System.out.println("You LOST.");
            } else if (aiRandomNum == 3 && userChoice == 1){
                System.out.println("You WON.");
            } else if (aiRandomNum == 1 && userChoice == 3){
                System.out.println("You LOST.");}
        }
 }
}
