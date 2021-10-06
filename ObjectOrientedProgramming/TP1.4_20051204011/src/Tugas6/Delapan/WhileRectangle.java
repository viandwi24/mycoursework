package Tugas6.Delapan;

public class WhileRectangle {
    public int height = 3;
    public int width = 10;

    public void display() {
        int colCount = 0;
        int rowCount = 0;
        while (rowCount < height) {
            while (colCount < width) {
                System.out.print("*");
                colCount++;
            }
            System.out.println();
            colCount = 0;
            rowCount++;
        }
    }
}
