/*
Abraham Caban Rios 2/5/2023 
This is a class includes a field for the country in which the division is located, a field for the language spoken, and a constructor that requires all fields when created.
*/

public class InternationalDivision extends Division{

    protected String intDivCountry;
    protected String intDivLang;

    public InternationalDivision(String divisionName, int divAccNumber, String divCountry, String divLanguage){

        super(divisionName, divAccNumber);
        intDivCountry = divCountry;
        intDivLang = divLanguage;
        
    }

    @Override
    public void display(){
        System.out.println("The International " + divName + " division with account number " + divAccNum + " is located in the country " + intDivCountry + " and the language spoken is " + intDivLang + ".");
    }

}
