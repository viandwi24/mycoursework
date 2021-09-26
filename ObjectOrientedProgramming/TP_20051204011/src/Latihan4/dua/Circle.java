package Latihan4.dua;

public class Circle extends Shape {
    private Float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }
    
    @Override
    public Float getArea() {
        return (float) Math.PI * radius * radius;
    }
}
