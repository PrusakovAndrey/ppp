package ClassWork.util;
import java.io.*;
import java.util.List;

import ClassWork.data.Student;
import ClassWork.data.Teacher;


public class dataWriter {
    
    private void studentWriter(List<Student> students, String txt){
        
        try (FileWriter writer = new FileWriter(txt + ".txt", false)){
            for (Student student : students){
                writer.write (student.toString() + "\n");
            }
            writer.flush();
        }
        catch(IOException ex){

        }
    }

    private void teacherWriter(List<Teacher> teachers, String txt){
        
        try (FileWriter writer = new FileWriter(txt + ".txt", false)){
            for (Teacher teacher : teachers){
                writer.write (teacher.toString() + "\n");
            }
            writer.flush();
        }
        catch(IOException ex){
            
        }
    }
}
