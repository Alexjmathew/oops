import java.io.*;

class NewPersist {
    public static void main(String args[]) {
        try {
            // Creating the object
            NewStudent s1 = new NewStudent(211, "ravi");
            // Creating stream and writing the object
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            // Closing the stream
            out.close();
            System.out.println("success");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class NewStudent implements Serializable {
    int id;
    String name;

    public NewStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
