// First interface
interface Animal {
    void eat();
}

// Second interface extends the first interface
interface Dog extends Animal {
    void bark();
}

// Class implementing the extended interface
class Puppy implements Dog {
    public void eat() {
        System.out.println("Puppy is eating.");
    }

    public void bark() {
        System.out.println("Puppy is barking.");
    }
}

// Main class
public class program12 {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
    }
}