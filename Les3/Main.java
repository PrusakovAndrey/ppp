package Les3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> listStudents = new ArrayList<>();
        listStudents.add(new Student("Иванов", LocalDate.of(1978, 1, 9), 4.8f));
        listStudents.add(new Student("Петров", LocalDate.of(1984, 1, 31), 4.5f));
        listStudents.add(new Student("Сидоров", LocalDate.of(1982, 9, 11), 5.0f));
        listStudents.add(new Student("Смирнов", LocalDate.of(1981, 11, 23), 3.2f));

        StudentsGroup studentGroup = new StudentsGroup(listStudents);
        for (Student student : studentGroup) {
            System.out.println(student);
        }
    }
}
