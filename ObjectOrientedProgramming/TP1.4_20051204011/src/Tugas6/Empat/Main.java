/**
 *
 * @author viandwi24
 */
package Tugas6.Empat;

public class Main {
    public static void main(String[] args) {
        String names[] = {
            "Beah",
            "Bianca",
            "Beah",
            "Linda",
        };
        int count = 0;
        for (int i = 0; i < names.length; i++) {
            if (!names[i].equals("Beah")) {
                continue;
            }
            count++;
        }
        System.out.println("There are " + count + " beachs in the list");
    }
}
