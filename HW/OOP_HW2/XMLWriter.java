package HW.OOP_HW2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class XMLWriter extends Writer{
    private Map<String, String> list;
    public  XMLWriter(Map<String,String> list) {
        this.list = list;
    }

    @Override
    public void Writer(){
        try (FileWriter writer = new FileWriter("notesXML.xml", false)) {
            writer.write("<?xml version=\"1.0\" encoding=\"utf-8\" ?>\n<students>");
            for (Map.Entry<String, String> entry : list.entrySet()) {
                writer.write("\n\t<student>\n\t\t<name>"+entry.getKey()+"</name>" + "\n\t\t<grade>" + entry.getValue()+"</grade>");
                writer.append("\n\t</student>");
            }
            writer.write("\n</students>");
            writer.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}


/*<?xml version="1.0" encoding="utf-8" ?>
<students>
<student>
<name>Иван Иванов</name>
<grade>4.8</grade>
</student>
<student>
<name>Мария Кузнецова</name>
<grade>5.0</grade>
</student>
<student>
<name>Степан Кузьмин</name>
<grade>3.6</grade>
</student>
</students> */
