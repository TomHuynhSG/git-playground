import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String name, address;
        int ages;
        PrintWriter pw;
        System.out.println("Enter the name of the file: ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        if (Files.notExists(Path.of(fileName))) {
             pw = new PrintWriter(new FileWriter(fileName));
        } else {
            pw = new PrintWriter(new FileWriter(fileName, true));
        }
            System.out.println("Enter name: ");
            name = scanner.nextLine();
            System.out.println("Enter address: ");
            address = scanner.nextLine();
            System.out.println("Enter age: ");
            ages = Integer.parseInt(scanner.nextLine());
            pw.println(name + "," + address+ ","+ ages);
            System.out.println("Continue: ");
        pw.close();

    }
}