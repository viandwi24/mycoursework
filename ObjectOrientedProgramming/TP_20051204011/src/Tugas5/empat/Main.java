/*
 * @author viandwi24
 */
package Tugas5.empat;

public class Main {
    public static void main(String[] args) {
        PrivateElevator2 elevator = new PrivateElevator2();
        elevator.buka();
        elevator.tutup();
        elevator.turun();
        elevator.naik();
        elevator.naik();
        elevator.buka();
        elevator.tutup();
        elevator.turun();
        elevator.buka();
        elevator.turun();
        elevator.tutup();
        elevator.turun();
        elevator.turun();
        Integer lantai = elevator.getLantai();
        if (lantai != 5 && !elevator.getStatusPintu()) {
            elevator.setLantai(5);
        }
        elevator.setLantai(10);
        elevator.buka();
    }
}
