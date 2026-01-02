import java.sql.*;
import java.util.Scanner;

class StudentCRUD {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
        Statement stmt = con.createStatement();
        stmt.executeUpdate("CREATE TABLE IF NOT EXISTS student(id INT PRIMARY KEY, name VARCHAR(50), age INT)");

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        stmt.executeUpdate("INSERT INTO student VALUES(" + id + ",'" + name + "'," + age + ")");
        System.out.println("Inserted.");

        ResultSet rs = stmt.executeQuery("SELECT * FROM student");
        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
        }

        System.out.print("Enter ID to update: ");
        int updateId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter new Name: ");
        String newName = sc.nextLine();
        System.out.print("Enter new Age: ");
        int newAge = sc.nextInt();
        stmt.executeUpdate("UPDATE student SET name='" + newName + "', age=" + newAge + " WHERE id=" + updateId);
        System.out.println("Updated.");

        System.out.print("Enter ID to delete: ");
        int deleteId = sc.nextInt();
        stmt.executeUpdate("DELETE FROM student WHERE id=" + deleteId);
        System.out.println("Deleted.");

        con.close();
    }
}

