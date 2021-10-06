/**
 *
 * @author viandwi24
 */
package Latihan4.Dua;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        // vars
        String[] numberString = {
            "Satu",
            "Dua",
            "Tiga",
            "Empat",
            "Lima",
            "Enam",
            "Tujuh",
            "Delapan",
            "Sembilan",
            "Sepuluh",
        };

        // input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        try {
            System.out.print("Masukkan angka : ");
            number = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("Input tidak valid");
        }


        // with ifElse
        if (number == 1) {
            System.out.println("Terbilang : " + numberString[0]);
        } else if (number == 2) {
            System.out.println("Terbilang : " + numberString[1]);
        } else if (number == 3) {
            System.out.println("Terbilang : " + numberString[2]);
        } else if (number == 4) {
            System.out.println("Terbilang : " + numberString[3]);
        } else if (number == 5) {
            System.out.println("Terbilang : " + numberString[4]);
        } else if (number == 6) {
            System.out.println("Terbilang : " + numberString[5]);
        } else if (number == 7) {
            System.out.println("Terbilang : " + numberString[6]);
        } else if (number == 8) {
            System.out.println("Terbilang : " + numberString[7]);
        } else if (number == 9) {
            System.out.println("Terbilang : " + numberString[8]);
        } else if (number == 10) {
            System.out.println("Terbilang : " + numberString[9]);
        } else {
            System.out.println("Input tidak valid");
        }


        // with switch
        switch (number) {
            case 1:
                System.out.println("Terbilang : " + numberString[0]);
                break;
            case 2:
                System.out.println("Terbilang : " + numberString[1]);
                break;
            case 3:
                System.out.println("Terbilang : " + numberString[2]);
                break;
            case 4:
                System.out.println("Terbilang : " + numberString[3]);
                break;
            case 5:
                System.out.println("Terbilang : " + numberString[4]);
                break;
            case 6:
                System.out.println("Terbilang : " + numberString[5]);
                break;
            case 7:
                System.out.println("Terbilang : " + numberString[6]);
                break;
            case 8:
                System.out.println("Terbilang : " + numberString[7]);
                break;
            case 9:
                System.out.println("Terbilang : " + numberString[8]);
                break;
            case 10:
                System.out.println("Terbilang : " + numberString[9]);
                break;
            default:
                System.out.println("Input tidak valid");
                break;
        }
    }
}
