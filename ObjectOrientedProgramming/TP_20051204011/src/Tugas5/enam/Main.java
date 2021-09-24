/*
 * @author viandwi24
 */
package Tugas5.enam;

public class Main {
    public static void main(String[] args) {
        Line l1 = new Line(1.0, 3.0, 3.0, 3.0);
        Line l2 = new Line(2.0, 2.0, 2.0, 2.0);

        System.out.println("Line 1 isGreater than Line 2 = " + Boolean.toString(l1.isGreater(l2)));
        System.out.println("Line 1 isLess than Line 2 = " + Boolean.toString(l1.isGreater(l2)));
        System.out.println("Line 1 isEqual than Line 2 = " + Boolean.toString(l1.isGreater(l2)));
    }
}
