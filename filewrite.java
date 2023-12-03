import java.io.FileWriter;
import java.io.IOException;

public class filewrite {
    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("alex.txt");
            f.write("AI AND ML S3");
            f.close();
            System.out.println("File created successfully!");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
