/*
Abraham Caban Rios 2/5/2023 
This is a class that includes a field for the state in which the division is located and a constructor that requires all fields when created.
*/

public class DomesticDivision extends Division{

    protected String domDivState;

    public DomesticDivision(String divisionName, int divAccNumber, String divState){
    
        super(divisionName, divAccNumber);
        domDivState = divState;

    }
    
    @Override
    public void display(){
        System.out.println("The domestic " + divName + " division with account number " + divAccNum + " is located in the state " + domDivState + ".");
    }

}
