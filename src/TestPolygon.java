/*
Name: Benzir Ahammed Shawon
ID: 1922270042
*/
public class TestPolygon {
    public static void main(String[] args) {
        Triangle tri = new Triangle(5.4, 3.5, 4.6);
        System.out.println("Side A : " + tri.getSideA());
        System.out.println("Side B : " + tri.getSideB());
        System.out.println("Side C : " + tri.getSideC());
        System.out.println("Perimeter : " + tri.perimeter());
        System.out.println("Area : " + tri.area());
    }
}
abstract class Polygon {
    private int numSide;
    public Polygon(int num) {
        this.numSide = num;
    }
    public int getNum() {
        return numSide;
    }
    public void setName(int numSide) {
        this.numSide = numSide;
    }
    public abstract double area();
    public abstract double perimeter();
}
class Triangle extends Polygon {
    private static int numSide;
    private double sideA;
    private double sideB;
    private double sideC;
    public Triangle(double sideA, double sideB, double sideC) {
        super(numSide);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
    public double getSideA() {
        return sideA;
    }
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }
    public double getSideB() {
        return sideB;
    }
    public void setSideB(double sideB) {
        this.sideB = sideB;
    }
    public double getSideC() {
        return sideC;
    }
    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    @Override
    public double area() {
        return sideA * sideB * sideC;
    }
    @Override
    public double perimeter() {
        return 2 * (sideA + sideB + sideC);
    }
}
