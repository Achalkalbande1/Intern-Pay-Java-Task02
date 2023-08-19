public class CircleProperties {
    public static void main(String[] args) {
        double radius = 7.5;
        
        // Calculate perimeter (Circumference) of the circle
        double perimeter = 2 * Math.PI * radius;
        
        // Calculate area of the circle
        double area = Math.PI * radius * radius;
        
        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
}
