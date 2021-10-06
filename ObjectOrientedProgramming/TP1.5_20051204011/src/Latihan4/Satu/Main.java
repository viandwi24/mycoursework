package Latihan4.Satu;

public class Main {
    public static void main(String[] args) {
        String days[] = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        };

        // looping with for
        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }

        // looping with do-while
        int j = 0;
        do {
            System.out.println(days[j]);
            j++;
        } while (j < days.length);

        // looping with while
        int k = 0;
        while (k < days.length) {
            System.out.println(days[k]);
            k++;
        }
    }
}
