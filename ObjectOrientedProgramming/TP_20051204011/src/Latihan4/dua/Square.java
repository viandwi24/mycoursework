package Latihan4.dua;

public class Square extends Shape {
    private float height;

    public Square(int height) {
        this.height = height;
    }

    @Override
    public String getName() {
        return "Square";
    }
    
    @Override
    public Float getArea() {
        return height * height;
    }
}
