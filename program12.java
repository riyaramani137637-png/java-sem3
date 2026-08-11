// Program16.java

// Abstract class
abstract class A {
    // Abstract method
    abstract void display();

    // Normal method
    void show() {
        System.out.println("This is normal method.");
    }
}

// Child class
class B extends A {

    // Implement abstract method
    void display() {
        System.out.println("This is abstract method.");
    }
}

// Main class
public class Program16 {
    public static void main(String[] args) {
        B obj = new B();

        obj.display();
        obj.show();
    }
}