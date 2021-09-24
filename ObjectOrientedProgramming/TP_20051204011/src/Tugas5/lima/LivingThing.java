package Tugas5.lima;

public abstract class LivingThing {
    public void breath() {
        System.out.println("LivingThing breathing");
    }
    
    public void eat() {
        System.out.println("LivingThing eating");
    }
    
    public abstract void walk();
}
