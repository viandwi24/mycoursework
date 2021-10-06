package Latihan4.Tiga;

public class Main {
    public static void main(String[] args) {
        // vars
        String myName = "Alfian Dwi Nugraha";
        int count = 100;

        // print myname for count with for loop
        for (int i = 0; i < count; i++) {
            System.out.print(myName);
        }
        System.out.println();

        // print myname for count with while loop
        int i = 0;
        while (i < count) {
            System.out.print(myName);
            i++;
        }
        System.out.println();

        // print myname for count with do while loop
        int j = 0;
        do {
            System.out.print(myName);
            j++;
        } while (j < count);
    }
}
