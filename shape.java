import java.util.Scanner;

abstract class Shape {
    public abstract double area();
}


class Circle extends Shape {
    private double radius; 

   
    public Circle(double radius) {
        this.radius = radius;
    }

   
    @Override
    public double area() {
        return Math.PI * radius * radius; 
    }
}


class Rectangle extends Shape {
    private double length; 
    private double width; 

   
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

   
    @Override
    public double area() {
        return length * width; 
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       
        double radius = input.nextDouble();
        Shape circle = new Circle(radius);

     
        double length = input.nextDouble();
        double width = input.nextDouble();
        Shape rectangle = new Rectangle(length, width); 

        
        System.out.printf("The area of the circle is %.5f%n", circle.area());
        System.out.printf("The area of the rectangle is %.1f%n", rectangle.area());


    }
}
