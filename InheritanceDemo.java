class SingleLevel {
    void show() {
        System.out.println("Single Level Inheritance");
    }
}

class SingleLevelChild extends SingleLevel {
    void display() {
        System.out.println("Child class of Single Level");
    }
}

class MultiLevel {
    void print() {
        System.out.println("Multi Level Inheritance");
    }
}

class MultiLevelChild extends MultiLevel {
    void show() {
        System.out.println("Parent class of Multi Level");
    }
}

class MultiLevelGrandChild extends MultiLevelChild {
    void display() {
        System.out.println("Child class of Multi Level");
    }
}

class InheritanceDemo {
    public static void main(String[] args) {

        SingleLevelChild s = new SingleLevelChild();
        s.show();
        s.display();

        MultiLevelGrandChild m = new MultiLevelGrandChild();
        m.print();
        m.show();
        m.display();
    }
}
