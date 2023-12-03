import java.io.File;

public class InfoFile {
    public static void main(String[] args) {
        File file = new File("info.txt");
        if (file.exists()) {
            System.out.println("Filename: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("File size: " + file.length() + " bytes"); // Use file.length() to get file size
        } else {
            System.out.println("File does not exist.");
        }
    }
}
