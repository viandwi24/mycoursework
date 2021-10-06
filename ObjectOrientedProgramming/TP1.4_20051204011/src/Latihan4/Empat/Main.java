package Latihan4.Empat;

public class Main {
    public static void main(String[] args) {
        int base = 5;
        int exponent = 3;

        // power with for loop
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        System.out.println("Result of " + base + "^" + exponent + " is " + result);

        // power with while loop
        result = 1;
        int counter = 0;
        while (counter < exponent) {
            result *= base;
            counter++;
        }
        System.out.println("Result of " + base + "^" + exponent + " is " + result);

        // power with do-while loop
        result = 1;
        counter = 0;
        do {
            result *= base;
            counter++;
        } while (counter < exponent);
        System.out.println("Result of " + base + "^" + exponent + " is " + result);
    }
}
