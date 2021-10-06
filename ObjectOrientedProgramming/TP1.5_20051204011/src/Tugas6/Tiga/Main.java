package Tugas6.Tiga;

public class Main {
    public static void main(String[] args) {
        int[][] twoD = new int[512][128];
        char [][][] threeD = new char[8][16][24];
        String[][] dogs = {
            { "Terry", "Brown" },
            { "Lassie", "White" },
            { "Snoopy", "Black" },
            { "Scooby Doo", "Brown" }
        };
        System.out.println("twoD[0][0] = " + twoD[0][0]);
        System.out.println("threeD[0][0][0] = " + threeD[0][0][0]);
        System.out.println("dogs[0][0] = " + dogs[0][0]);
    }
}
