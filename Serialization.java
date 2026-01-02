import java.io.*;

class Student implements Serializable {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Serialization {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20);

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("student.ser"));
            out.writeObject(student);
            out.close();

            ObjectInputStream in = new ObjectInputStream(new FileInputStream("student.ser"));
            Student s = (Student) in.readObject();
            in.close();

            System.out.println("Name: " + s.name);
            System.out.println("Age: " + s.age);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
