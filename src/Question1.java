import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Question1 {
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
        pw.close();

        Scanner fileScanner = new Scanner(new File("./src/test.txt"));
        double sum = 0;
        int count = 0;
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(line, ",");
            String nameUser = stringTokenizer.nextToken();
            String addressUser = stringTokenizer.nextToken();
            int age = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(nameUser + " lives at " + addressUser + " and is " + age + " years old");
            sum += age;
            count++;
        }
        if (count >0) {
            System.out.printf("Average age = %.2f", sum/count);
        }
    }
}