import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readfile {
    public static void main(String[] args) {
        try {
            File file = new File("alex.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
            e.printStackTrace();
        }
    }
}
