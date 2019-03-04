package Traingle;

public class Traingle extends Shape {
    private double side1;
    private double side2;
    private double side3;

    public Traingle() {
    }

    public Traingle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Traingle : side1= " + this.getSide1() + ", side2= " + this.getSide2() + ", side3= " + this.getSide3() + "\n\t"+super.toString();
    }
    public double getArea() {
        double p = (this.getSide1() + this.getSide2() + this.getSide3())*0.5;
        double s=  Math.sqrt((p*(p-this.getSide1())*(p-this.getSide2())*(p-this.getSide3())));
        return s;
    }
    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }
}

