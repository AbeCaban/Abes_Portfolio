/*Abraham Caban 11/18/2022 Module 6 Assignment.
 A program that uses nested for loops to output a pyramid of numbers.
*/
public class Nested_for_loops{
    public static void main(String[] args) {

        var num = 0;
        var spaces = 18;
        var numCount = 1;
        
        //for(initial action; continuation condition; action after each iteration)
        for(var row = 1;row <= 7; row++){

            
            //for (initial action; continuation condition; action after each iteration)
            for(var leftSpaceCount=1; leftSpaceCount <= spaces; leftSpaceCount++)
            {
                System.out.print(" ");
            }
            
            for(num = 1; num < numCount ; num*=2)
            {
                System.out.printf("%3d",num);
            }

            numCount *= 2;

            for(; num > 0; num/=2)
            {
                System.out.printf("%3d",num);
            }

            for(var rightSpaceCount=0; rightSpaceCount <= spaces; rightSpaceCount++)
            {
                System.out.print(" ");
            }

            spaces -= 3;
            System.out.print("@");
     
        System.out.println("\n");
        
    }
}
}
