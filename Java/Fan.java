/*Abraham Caban Rios 1/14/2023
 * Module 2 assignment.
 * 
 * This is a program that starts with the Fan Class code from Module 1
 * 
 * The Instructions for this code are as follows.
 * Create the following new class titled UseFans:
 * Create a collection of Fan instances.
 * Create a method taking a collection of Fan instances for displaying without using the toString() method.
 * Create a method that takes a single instance of a Fan for displaying without using the toString() method.
 * Use the this reference throughout the Fan class where allowed.
 * Write test code that creates a collection of Fans and displays the functionality of all of the Fan instances in the collection.
 * 
 * 
*/

public class Fan {

    final static int STOPPED = 0;
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;

    private int speed = STOPPED;
    private Boolean on;
    private int radius = 6;
    String color = "white";

// ----------------------------------GET METHODS------------

    public int getSpeed()
    {
        return this.speed;
    }

    public boolean getOn()
    {
        return this.on;
    }

    public int getRadius()
    {
        return this.radius;
    }

    public String getColor()
    {
        return this.color;
    }

    // -------------------------------------SET METHODS--------------------------

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public void setOn(boolean on)
    {
        this.on = on;
    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    // -------------Default costructor---------------
    Fan()
    {
    speed = STOPPED;
    on = false;
    radius = 6;
    color = "white";
    }

    // -------------Argument costructor taking arguments and setting values---------------
    Fan(String fanColor, boolean fanState, int fanSpeed)
    {
        this.speed = fanSpeed;
        this.on = fanState;
        this.color = fanColor;
    }

    public String toString(){
        return speed + " " + on  + " " + color;
    }

    public void currentFan(){
        System.out.println("The current speeed of this fan is " 
            + speed + ", it is " + on  + " the fan is on and the color is " + color + "." + " The radius of the fan is " + radius + ".");
    }

    public static void main(String[] args)
    {
        //-------------Two instances, one using the default constructor and the other using the argument constructor------
        Fan f1 = new Fan("Red", true, 2);
        Fan f2 = new Fan();
        // ----------------------New fan instances for assignment on module 2-------------------


        System.out.println(f1);
        System.out.println(f2);

        System.out.println(" ");

        //---------------------code that displays the functionality of the Fan class methods----------
        System.out.println("The original fan is " + f2.getColor() + ", it is " + f2.getOn() + 
        " that it is on, the speed is set to " + f2.getSpeed() + " and the current radius is"+ f2.getRadius());

        System.out.println(" ");

        f2.setColor("blue");
        f2.setOn(true);
        f2.setSpeed(FAST);
        f2.setRadius(8);
        f2.currentFan();
    }
}

class UseFan{
    public static void main(String[] args)
    {
        //Write test code that creates a collection of Fans and displays the functionality of all of the Fan instances in the collection.

        UseFan uf_01 = new UseFan();
        Fan dataFan_1 = new Fan("Blue", false, 1);
        Fan dataFan_2 = new Fan("gold", true, 2);
        Fan dataFan_3 = new Fan("green", false, 3);
        Fan[] fanObjects = {dataFan_1, dataFan_2, dataFan_3};
        
        System.out.println("First method:");
        uf_01.displayingInstances(fanObjects);

        System.out.println("Second method:");
        uf_01.singleInstance(dataFan_1);
        uf_01.singleInstance(dataFan_2);
        uf_01.singleInstance(dataFan_3);


    }
    
        

    // Create a method taking a collection of Fan instances for displaying without using the toString() method
    public void displayingInstances(Fan[] dataFanInstances){
        for (int i = 0; i < dataFanInstances.length; i++) {
            System.out.println();
            System.out.println("Fan number " + (i + 1));
            System.out.print("color: ");
            System.out.println(dataFanInstances[i].getColor());
            System.out.print("Turned on: ");
            System.out.println(dataFanInstances[i].getOn());
            System.out.print("Speed at: ");
            System.out.println(dataFanInstances[i].getSpeed());
            System.out.println();
        }
    }
    //Create a method that takes a single instance of a Fan for displaying without using the toString() method.
    public void singleInstance(Fan fanInstance) {
        System.out.println();
        System.out.println("Fan with:");
        System.out.print("color: ");
        System.out.println(fanInstance.getColor());
        System.out.print("Turned on: ");
        System.out.println(fanInstance.getOn());
        System.out.print("Speed at: ");
        System.out.println(fanInstance.getSpeed());
    }
    


}
