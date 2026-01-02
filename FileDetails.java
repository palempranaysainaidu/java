import java.io.File;
import java.util.Scanner;

class FileDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        File file = new File(fileName);

        System.out.println("File exists: " + file.exists());
        if (file.exists()) {
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("File type: " + (file.isDirectory() ? "Directory" : "Regular file"));
            System.out.println("File size in bytes: " + file.length());
        }
    }
}
