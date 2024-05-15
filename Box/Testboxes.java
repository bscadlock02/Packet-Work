package Box;

public class Testboxes {
    public static void main(String[]args){
        Box Beckham = new Box(2.0,6.0);
        double area = Beckham.getArea();
        System.out.println("The area is " + area);
        Beckham.bigger(2.0);
        double perimeter = Beckham.getPerimeter();
        System.out.println("The perimeter is " + perimeter);   
    }
}