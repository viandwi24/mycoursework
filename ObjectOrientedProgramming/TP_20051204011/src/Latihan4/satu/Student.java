/*
 * @author viandwi24
 */
package Latihan4.satu;

public class Student extends StudentRecord {
    protected String name;
    protected String address;
    
    public Student() {
        name = "";
        address = "";
    }
    
    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
