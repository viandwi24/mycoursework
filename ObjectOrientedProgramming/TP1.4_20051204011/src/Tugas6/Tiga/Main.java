/**
 *
 * @author viandwi24
 */
package Tugas6.Tiga;

public class Main {
    public static void main(String[] args) {
        String names[] = {
            "Beah",
            "Bianca",
            "Lance",
            "Linda",
            "Mia",
            "Yza",
            "Gem",
            "Ethan",
        };
        String searchName = "Yza";
        boolean foundName = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(searchName)) {
                foundName = true;
                break;
            }
        }
        if (foundName) {
            System.out.println("Name " + searchName + " found");
        } else {
            System.out.println("Name " + searchName + " not found");
        }
    }
}
