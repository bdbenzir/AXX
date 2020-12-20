/*
Name: Benzir Ahammed Shawon
ID: 1922270042
*/
public class TestShape {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle("Rectangle", 3.5, 4.6);
        System.out.println("Length : " + rect.getLength());
        System.out.println("Width : " + rect.getWidth());
        System.out.println("Perimeter : " + rect.perimeter());
        System.out.println("Area : " + rect.area());
    }
}
abstract class Shape {
    private String name;
    public Shape(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract double area();
    public abstract double perimeter();
}
class Rectangle extends Shape {
    private double length;
    private double width;
    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    @Override
    public double area() {
        return length * width;
    }
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}
