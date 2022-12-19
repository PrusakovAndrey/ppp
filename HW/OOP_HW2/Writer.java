package HW.OOP_HW2;

import java.io.FileWriter;
import java.io.IOException;

public abstract class Writer {
    public void Writer() {
        try(FileWriter writer = new FileWriter("notes3.txt", false))
        {
            String text = "Test writer";
            writer.write(text);
            writer.flush();
        }
        catch(IOException ex){ 
            System.out.println(ex.getMessage());
        } 
        
    }
}
