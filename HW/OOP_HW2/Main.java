package HW.OOP_HW2;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        
        Map<String, String> students = new HashMap<>();
        students.put("Степан Кузьмин", "3.6");
        students.put("Мария Кузнецова", "5.0");
        students.put("Иван Иванов", "4.8"); 
        
        // Writer wr = new Writer();
        // wr.Writer();
        TextWriter twr = new TextWriter(students);
        twr.Writer();
        JSONWritetr jwr = new JSONWritetr(students);
        jwr.Writer();  
        XMLWriter xmlwr = new XMLWriter(students);
        xmlwr.Writer();
    }
}