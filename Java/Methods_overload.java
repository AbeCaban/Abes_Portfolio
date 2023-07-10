/*Abraham Caban Rios 11/27/2022 Module 8 assignment
Methods overloading and checking of each method.
This is a code that overloads methods and checks each method twice.
*/ 

public class Methods_overload {
    //this variable is for setting the basic service charge value. 
    static double ssc = 50.00;
    
    public static void main(String [] args){
    double noParamMeth;
    double noParamMethDou;
    
// Results were formatted with two decimal points because the outputs are USD units.
// Method with no parameters tested 2 times.
noParamMeth =  Methods_overload.yearlyService();
System.out.printf("Standard service charge.\n$%.2f", noParamMeth);

noParamMethDou = Methods_overload.yearlyService() + 5.5;
System.out.printf("\nStandard service charge.\n$%.2f", noParamMethDou);
System.out.println();

// Method with one parameter tested 2 times.
System.out.printf("Standard service charge with an added oil change fee.\n$%.2f", Methods_overload.yearlyService(120.00));
System.out.printf("\nStandard service charge with an added oil change fee.\n$%.2f", Methods_overload.yearlyService(150.00));
System.out.println();

// Method with two parameters tested 2 times.
System.out.printf("Standard service charge with an added oil change fee, a tire rotation charge.\n$%.2f", Methods_overload.yearlyService(100.00, 15.00));
System.out.printf("\nStandard service charge with an added oil change fee, a tire rotation charge.\n$%.2f", Methods_overload.yearlyService(1.50, 18.50));
System.out.println();

// Method with three parameters tested 2 times.
System.out.printf("Standard service charge with an added oil change fee, a tire rotation charge,\nalong with a coupon amount that will be deducted from the total cost.\n$%.2f", Methods_overload.yearlyService(190.00, 18.56, 15.00));
System.out.printf("\nStandard service charge with an added oil change fee, a tire rotation charge,\nalong with a coupon amount that will be deducted from the total cost.\n$%.2f", Methods_overload.yearlyService(101.00, 29.00, 10.00));
System.out.println();
    }


        // The 4 methods required.
        public static double yearlyService() 
        {
        return ssc;   
        }

        public static double yearlyService(double para_1)
        {
        return ssc + para_1;   
        }

        public static double  yearlyService(double para_1, double para_2)
        {
        return ssc + para_1 + para_2;
        }

        public static double yearlyService(double para_1, double para_2, double para_3) 
        {
        return (ssc + para_1 + para_2) - ((ssc + para_1 + para_2)*(para_3/100));
        }

        }
