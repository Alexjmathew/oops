import java.io.File;
import java.io.IOException;

public class fileh{
    public static void main(String[] args){
        try{
            File f = new File("alex.txt");
            if(f.createNewFile()){
                System.out.println("file created successfully!");   
                }else{
                    System.out.println("file already exists!");
                }
                }catch (IOException e){
                    System.out.println("error in creating the file: ");
                    e.printStackTrace();
                }
     }
 }
