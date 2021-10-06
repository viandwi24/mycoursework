package Tugas6.Tujuh;

public class WhileElevator {
    public boolean doorOpen = false;
    public int currentFloor = 1;
    public final int TOP_FLOOR = 5;
    public final int BOTTOm_FLOOR = 1;

    public void openDoor() {
        System.out.println("Opening door.");
        doorOpen = true;
        System.out.println("Door is open.");
    }

    public void closeDoor() {
        System.out.println("Closing door.");
        doorOpen = false;
        System.out.println("Door is closed.");
    }

    public void goUp() {
        if (doorOpen) {
            System.out.println("Elevator is already on the top floor.");
        } else {
            if (currentFloor < TOP_FLOOR) {
                currentFloor++;
                System.out.println("Elevator is now on floor " + currentFloor + ".");
            } else {
                System.out.println("Elevator is already on the top floor.");
            }
        }
    }

    public void goDown() {
        if (doorOpen) {
            System.out.println("Elevator is already on the bottom floor.");
        } else {
            if (currentFloor > BOTTOm_FLOOR) {
                currentFloor--;
                System.out.println("Elevator is now on floor " + currentFloor + ".");
            } else {
                System.out.println("Elevator is already on the bottom floor.");
            }
        }
    }

    public void setFloor(int floor) {
        if (doorOpen) {
            System.out.println("Elevator is already on floor " + currentFloor + ".");
        } else {
            while (currentFloor != floor) {
                if (currentFloor < floor) {
                    goUp();
                } else {
                    goDown();
                }
            }
        }
    }
}
