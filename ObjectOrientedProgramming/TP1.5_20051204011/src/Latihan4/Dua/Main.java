package Latihan4.Dua;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // get input with buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 
        int[] number = new int[10];
        int highestNumber = 0;
        for (int i = 0; i < number.length; i++) {
            try {
                System.out.print("Masukkan angka ke-" + (i + 1) + " : ");
                number[i] = Integer.parseInt(br.readLine());
                if (highestNumber < number[i]) {
                    highestNumber = number[i];
                }
            } catch (Exception e) {
                System.out.println("Input tidak valid");
                System.exit(0);
            }
        }

        // print highest number with JOptionPane
        JOptionPane.showMessageDialog(null, "Angka terbesar adalah " + highestNumber);
    }
}
