/**
 *
 * @author viandwi24
 */
package Tugas6.Enam;

public class Main {
    public static void main(String[] args) {
        outerLoop:
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.println("inside for(j) loop = " + j);
                    if (j == 2) {
                        continue outerLoop;
                    }
                }
                System.out.println("inside for(i) loop = " + i);
            }
    }
}
