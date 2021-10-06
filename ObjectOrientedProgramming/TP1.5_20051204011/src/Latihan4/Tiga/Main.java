package Latihan4.Tiga;

public class Main {
    public static void main(String[] args) {
        String[][] entry = {
            {"Florence", "735-1234", "Manila"},
            {"Joyce", "983-3333", "Quezon City"},
            {"Becca", "456-3322", "Manila"}
        };

        for (int i = 0; i < entry.length; i++) {
            System.out.println("Name \t\t: " + entry[i][0]);
            System.out.println("Tel. # \t\t: " + entry[i][1]);
            System.out.println("Address \t: " + entry[i][2]);
            System.out.println();
        }
    }
}
