/*Abraham Caban Rios 1/22/2023 Module 4
 * 
 * This class is to contain:
 * A method that receives an ArrayList populated with an Integer data type holding the integers received from user input.
 * The user input is to accept Integers that are then assigned to the ArrayList until a value of 0 is entered, which is also assigned to the ArrayList.
 * The ArrayList is then to be sent to the method.
 * The method is then to return the largest value in the ArrayList.
 * If the ArrayList is sent in empty, the method will then return 0.
 * The method signature is to be: public static Integer max (ArrayList list).
 * Write additional code for testing your method.
 * The method will return the largest value that is displayed to the user.
*/

import java.util.*;

public class AbrahamArrayListTest {

    static Integer i;
    public static Integer max(ArrayList list)
    {
        // Integer max = mylist.get(0);
        // for(Integer i = 1; i < mylist.size(); i++)
        // {
        //     if (mylist.get(i) > max) max = mylist.get(i);
        // }
        boolean elementCheck = list.isEmpty();
        if(elementCheck == true)
            System.out.println("ArrayList is empty.");
        else
        System.out.println("The maximum of all Integer values entered is: " + Collections.max(list));
        return i;
    }

    

    public static void main(String[] args) {

    
    try (Scanner input = new Scanner(System.in)) {
        System.out.print("Enter integer values into the arraylist, enter 0 to stop : ");
        
        ArrayList<Integer> mylist = new ArrayList<Integer>();

        do {
            i = input.nextInt();
            mylist.add(i);

        }while (i != 0);

        System.out.println("");
        System.out.println("");


        System.out.println("You entered " + mylist.size() + " values. ");

        for (Integer item : mylist) {
            System.out.print(item + " ");
        }

        System.out.println("");
        System.out.println("");

        AbrahamArrayListTest.max(mylist);
    }
    System.out.println("");
    System.out.println("");

    //---------------Method test------------

    System.out.println("Second method test.");

    ArrayList<Integer> secondList = new ArrayList<Integer>();
    secondList.add(2);
    secondList.add(56);
    secondList.add(75);
    secondList.add(29);
    secondList.add(12);
    secondList.add(7);
    secondList.add(24);

    AbrahamArrayListTest.max(secondList);

    System.out.println("");
    System.out.println("");

    //---------------Method Test with an empty ArrayList----------

    System.out.println("Third method test.");

    ArrayList<Integer> emptyList = new ArrayList<Integer>();

    AbrahamArrayListTest.max(emptyList);

    System.out.println("");
    System.out.println("");
    }
}

   