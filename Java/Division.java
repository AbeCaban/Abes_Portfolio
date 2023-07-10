/*
Abraham Caban Rios 2/5/2023

This is an abstract class with fields for a company's division name and account number, and an abstract display() method that will be defined in the subclasses.
 */

public abstract class Division{

    protected String divName;
    protected int divAccNum;

    public Division(String divisionName, int divAccNumber){

        divName = divisionName;
        divAccNum = divAccNumber;
        
    }

    public abstract void display();

}