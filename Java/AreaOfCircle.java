public class AreaOfCircle {

    static double area;
    static double radius;
    
    public static void calculateCircleArea(double circleRadius) {
        area = Math.pow(circleRadius, 2) * Math.PI;
        System.out.println(area);
    }
    public static void main(String[] args) {
        
        
        calculateCircleArea(10);

    }

    
    
}
