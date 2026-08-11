// Interface declaration
interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}


public class program11 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
    }
}