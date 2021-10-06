/**
 *
 * @author viandwi24
 */
package Latihan4.Satu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // with buffer reader
        withBR();
        // with joptionpane
        withJOP();
    }

    public static int average(int[] values) {
        int average = 0;
        for (int i = 0; i < values.length; i++) {
            average += values[i];
        }
        average /= values.length;
        return average;
    }

    public static String emot(int value) {
        if (value >= 60) {
            return ":)";
        } else {
            return ":(";
        }
    }

    public static void withBR() {
        int[] nilai = new int[3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // loop
        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai ujian ke-" + (i + 1) + " : ");
            try {
                nilai[i] = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("Input salah");
            }
        }

        // compute
        int average = average(nilai);

        // output
        System.out.println("Rata-rata nilai ujian adalah " + average + " " + emot(average));
    }
    
    // with joptionpane
    public static void withJOP() {
        int[] nilai = new int[3];
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Masukkan nilai ujian ke-" + (i + 1) + " : "
                    )
            );
        }

        // compute
        int average = average(nilai);

        // output
        JOptionPane.showMessageDialog(null, "Rata-rata nilai ujian adalah " + average + " " + emot(average));
    }
}
