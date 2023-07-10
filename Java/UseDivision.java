/*
Abraham Caban Rios 2/5/2023 
This is a class that creates two instances of each of these concrete classes of DomesticDivision and InternationalDivision (4 total instances).
*/

public class UseDivision{
    public static void main(String[] args){

        System.out.println("");

        DomesticDivision ddobj1 = new DomesticDivision("Fraud", 643675, "North Carolina");
        DomesticDivision ddobj2 = new DomesticDivision("Narcotics", 38653, "New York");

        InternationalDivision idobj1 = new InternationalDivision("CIA", 53623, "Switzerland", "Romansh");
        InternationalDivision idobj2 = new InternationalDivision("NSA", 987089, "Mexico","Spanish");

        ddobj1.display();
        ddobj2.display();

        System.out.println("");

        idobj1.display();
        idobj2.display();

        System.out.println("");

    }
}
