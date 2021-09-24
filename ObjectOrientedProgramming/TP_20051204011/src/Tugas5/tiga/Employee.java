/*
 * @author viandwi24
 */
package Tugas5.tiga;

public class Employee extends Person {
    private String role;
    
    public Employee() {
        super();
    }

    public Employee(String name, String address, String role) {
        super(name, address);
        setRole(role);
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
