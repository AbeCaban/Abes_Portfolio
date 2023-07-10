/*Abraham Caban Rios 1/22/2023
 * Module 3
 * This class is to contain:
 * An int data field titled with your first name.
 * A constructor that takes and sets the initial value.
 * Getter and setter methods.
 * Non-Static methods titled isEven(), isOdd(), and isPrime() returning true or false based on the variable’s value.
 * Static methods with signatures isEven(int), isOdd(int), and isPrime(int) with the same basic logic as the previous methods with results based on the parameter.
 * Static methods with signatures isEven( Integer), isOdd( Integer), and isPrime( Integer) with the same basic logic as the previous methods with results based on the parameter.
 * The methods equals(int) and equals( Integer) which returns true if int values are equal and false if they are not.
 * Write test code that creates three instances, two with the same value, and one with a different value.
 * Write test code that ensures all methods function correctly.
 */



public class AbrahamInteger {

    int abraham;
    
    AbrahamInteger(int abraham){
        this.abraham = abraham;
        };

    public void setAbraham(int abraham) {
        this.abraham = abraham;
    }

    public int getAbraham() {
        return this.abraham;
    }
//-----------non-static methods--------------
    public boolean isEven() {
        System.out.println("Test for public boolean isEven()");

        if ((this.abraham % 2) == 0) {
            return true;
         } else {
            return false;
         }
    }

    public boolean isOdd() {
        System.out.println("Test for public boolean isOdd()");

        if ((this.abraham % 2) != 0) {
            return true;
         } else {
            return false;
         }
    }

    public boolean isPrime() {
        System.out.println("Test for public boolean isPrime()");

        {
            if(this.abraham <= 1)
            {
                return false;
            }
            for(int i = 2; i <= this.abraham/2 ; i++)
            {
               if(( this.abraham % i) == 0)//residue of abraham divided by i
                   return  false;
            }
            return true;
        }
}


//--------------------------Static Methods with signatures-------------- 

    public static boolean isEven(int intParameter) {
        System.out.println("Test for public static boolean isEven(int intParameter)");

        if ((intParameter % 2) == 0) {
            return true;
         } else {
            return false;
         }
    }

    public static boolean isOdd(int intParameter) {
        System.out.println("Test for public static boolean isOdd(int intParameter)");

        if ((intParameter % 2) == 0) {
            return false;
         } else {
            return true;
         }
        
    }

    public static boolean isPrime(int intParameter) {
        System.out.println("Test for public static boolean isPrime(int intParameter)");

            if(intParameter <= 1)
            {
                return false;
            }
            for(int i = 2; i <= intParameter/2 ;)
            {
                return false;
            }
            return true;
    }
//----------------------------Static Methods with signatures in wrapped parameters-----------

    public static boolean isEven(Integer wrappedParameter1) {
        System.out.println("Test for public static boolean isEven(Integer wrappedParameter1)");
        if ((wrappedParameter1 % 2) == 0) {
            return true;
         } else {
            return false;
         }
    }

    public static boolean isOdd(Integer wrappedParameter2) {
        System.out.println("Test for public static boolean isOdd(Integer wrappedParameter2)");

        if ((wrappedParameter2 % 2) == 0) {
            return false;
         } else {
            return true;
         }
        
    }

    public static boolean isPrime(Integer wrappedintParameter) {
        System.out.println("Test for public static boolean isPrime(Integer wrappedintParameter)");

        if(wrappedintParameter <= 1)
        {
            return false;
        }
        for(int i = 2; i <= wrappedintParameter/2 ;)
        {
            return false;
        }
        return true;
}
//-----------------------------Equals methods return true or false---------------------------

public static boolean equals(int para1, int para2) {
    System.out.println("Test for public static boolean equals(int para1, int para2)");

    if (para1 == para2) {
        return true;
    } else {
        return false;
    }
}

public static boolean equals(Integer para1, Integer para2) {
    System.out.println("Test for public static boolean equals(Integer para1, Integer para2)");

    if (para1 == para2) {
        return true;
    } else {
        return false;
    }
        
}

    public static void main(String[] args) {

        Integer varAsInteger = 12;
        Integer varAsInteger2 = 13;
        Integer varAsInteger3 = 15;


        AbrahamInteger firstAbeInt = new AbrahamInteger(1);
        AbrahamInteger secondAbeInt = new AbrahamInteger(1);
        AbrahamInteger thirdAbeInt = new AbrahamInteger(2);

        System.out.println("");
        System.out.println("----------instances values ");
        System.out.println("");

        System.out.println(firstAbeInt.getAbraham());
        System.out.println(secondAbeInt.getAbraham());
        System.out.println(thirdAbeInt.getAbraham());

        System.out.println("");
        System.out.println("------------non-static methods ");
        System.out.println("");

        System.out.println(firstAbeInt.isEven());
        System.out.println(secondAbeInt.isOdd());
        System.out.println(thirdAbeInt.isPrime());

        System.out.println("");
        System.out.println("-------------Static Methods with signatures primitive data types parameters ");
        System.out.println("");

        System.out.println(AbrahamInteger.isEven(13)); 
        System.out.println(AbrahamInteger.isOdd(14)); 
        System.out.println(AbrahamInteger.isPrime(11)); 

        System.out.println("");
        System.out.println("---------------Static Methods with signatures in wrapped parameters ");
        System.out.println("");

        System.out.println(AbrahamInteger.isEven(varAsInteger)); 
        System.out.println(AbrahamInteger.isOdd(varAsInteger2)); 
        System.out.println(AbrahamInteger.isPrime(varAsInteger3)); 

        System.out.println("");
        System.out.println("---------------equals methods ");
        System.out.println("");

        System.out.println(equals(firstAbeInt.getAbraham(), secondAbeInt.getAbraham())); 
        System.out.println(equals(firstAbeInt.getAbraham(), thirdAbeInt.getAbraham()));

    
}

}