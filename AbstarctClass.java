interface Printable {
    void print();
}

abstract class Shape {
    abstract void draw();
    void show() {
        System.out.println("This is an abstract class method");
    }
}

class Circle extends Shape implements Printable {
    public void draw() {
        System.out.println("Drawing Circle");
    }

    public void print() {
        System.out.println("Printing Circle");
    }
}

public class AbstarctClass {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.show();
        c.print();
    }
}
