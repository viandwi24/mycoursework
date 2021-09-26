/*
 * @author viandwi24
 */
package Latihan4.dua;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        System.out.println("Name: " + c1.getName());
        System.out.println("Luas: " + c1.getArea());

        Square s1 = new Square(10);
        System.out.println("Name: " + s1.getName());
        System.out.println("Luas: " + s1.getArea());
    }
}
