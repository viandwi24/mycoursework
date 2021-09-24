/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5.satu;

/**
 *
 * @author viandwi24
 */
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
