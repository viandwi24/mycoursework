/*
 * @author viandwi24
 */
package Latihan4.satu;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alfian", "Jl.Kamas Setyoadi");
        student.setRecord("Catatan untuk mata pelajaran");
        System.out.println(student.getRecord());
    }
}
