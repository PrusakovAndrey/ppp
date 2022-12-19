package HW.OOP_HW2;

import java.io.FileWriter;
import java.util.Map;

public class TextWriter extends Writer {
    private Map<String, String> list;

    public TextWriter(Map<String, String> list) {
        this.list = list;
    }

    @Override
    public void Writer() {

        try {
            FileWriter writer = new FileWriter("notesText.txt", false);
            for (Map.Entry<String, String> entry : list.entrySet()) {
                writer.write(entry.getKey() + "=" + entry.getValue());
                writer.append("\n");
            }
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}