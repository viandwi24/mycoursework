package Tugas6.Sepuluh;

public class ForRectangle {
    public int height = 3;
    public int width = 10;

    public void display() {
        // with for
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
