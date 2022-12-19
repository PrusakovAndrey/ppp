package HW.OOP_HW2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class JSONWritetr extends Writer {
    private Map<String, String> list;

    public JSONWritetr(Map<String, String> list) {
        this.list = list;
    }

    @Override
    public void Writer() {
        try (FileWriter writer = new FileWriter("notesJSON.json", false)) {
            writer.write((list.toString()).replace("=", "\":")
                    .replace(", ", ",\n\"")
                    .replace("{", "{\n\"")
                    .replace("}","\n}"));
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
