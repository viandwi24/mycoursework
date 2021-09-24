/*
 * @author viandwi24
 */
package Tugas5.tiga;

public class Main {
    public static void main(String[] args) {
        Person ref;
        Student studentObj = new Student("Irfan", "Jl.Kaliurang");
        Employee employeeObj = new Employee("Rizki", "Jl.Kaliurang", "Manager Bussiness");

        ref = studentObj;
        System.out.println("Name : " + ref.getName());

        ref = employeeObj;
        System.out.println("Name : " + ref.getName());
    }
}
