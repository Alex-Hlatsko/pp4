import java.io.*;
import java.util.*;
 
public class ToFile {
    String text;

    public void zapisz(String text){
        try(FileWriter writer = new FileWriter("text.txt", true))
        {
            writer.write(text+"\n");
             
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    }

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your text: ");
        String text = myObj.nextLine(); 

        ToFile file = new ToFile();
        file.zapisz(text); 
    } 
}