import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Question2 {
    public static void main(String[] args) throws IOException {
        Scanner fileScanner = new Scanner(new File("./src/test.txt"));
        double sum = 0;
        int count = 0;
        while (fileScanner.hasNext()) {
            String line = fileScanner.nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(line, ",");
            String name = stringTokenizer.nextToken();
            String address = stringTokenizer.nextToken();
            int age = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(name + " lives at " + address + " and is " + age + " years old");
            sum += age;
            count++;
        }
        if (count >0) {
            System.out.printf("Average age = %.2f", sum/count);
        }
    }
}
