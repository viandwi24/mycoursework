/*
 * @author viandwi24
 */
package Tugas5.satu;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Irfan", "Jl.Kaliurang");

        // get name
        System.out.println("Nama : "+ s1.getName());

        // change name
        s1.setName("Budi");

        // get name after change
        System.out.println("Nama : "+ s1.getName());
    }
}
