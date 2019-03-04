package Traingle;

public class Init {
    public static void main(String[] args) {
        Traingle traingle1 = new Traingle("Red", true , 10,10,15);
        System.out.println(traingle1.toString() + " S= " + traingle1.getArea() + " CV= " + traingle1.getPerimeter());
    }
}
