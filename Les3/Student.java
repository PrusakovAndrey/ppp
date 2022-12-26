package Les3;

import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate date;
    private float averageMark;
    public Student(String name, LocalDate date, float averageMark) {
        this.name = name;
        this.date = date;
        this.averageMark = averageMark;
    }
    public String getName() {
        return name;
    }
    public LocalDate getDate() {
        return date;
    }
    public float getAverageMark() {
        return averageMark;
    }
    @Override
    public String toString() {
        return "student [name=" + name + ", date=" + date + ", averageMark=" + averageMark + "]";
    }

}
