class MethodOverloading {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.add(10, 20);
        obj.add(5, 10, 15);
        obj.add(2.5, 3.5);
    }
}
