/*Abraham Caban Rios 11/13/2022 
Assignment. While loop Module 5
A program that uses a while loop to display math operations and the result.
*/ 
public class While_ascend_descend {
    public static void main(String[] args){
        
        double a = 3.0;
        double d = 99.0;
        String varStringA = "";
        String varStringD = "";
        double sumA = 0;
        double sumD = 0;

    while(a <= 99.0){
        
        varStringA += ("1/" + a);
        varStringD += ("1/" + d);

            sumA += (1/a);
            sumD += (1/d);
            a+=2;
            d-=2; 

        if (a < 99.0)
        {
            varStringA += (" + ");
            varStringD += (" + ");
        }
                     
    }
        System.out.println(varStringA);
        System.out.println("\n" + "The addition of the fractions above is " + sumA + ".");
        System.out.println("\n");
        System.out.println(varStringD);
        System.out.println("\n" + "The addition of the second set of fractions above is " + sumD + ".");
        System.out.println("\n");
    }

}
