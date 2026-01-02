import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

class IOStreamsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input file name: ");
        String inputFile = sc.nextLine();
        System.out.print("Enter output file name: ");
        String outputFile = sc.nextLine();

        try {
            FileInputStream fis = new FileInputStream(inputFile);
            FileOutputStream fos = new FileOutputStream(outputFile);

            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char)data);  
                fos.write(data);               
            }

            fis.close();
            fos.close();
            System.out.println("\nFile copied successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
