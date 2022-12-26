package Les3;

import java.util.Iterator;
import java.util.List;

public class StudentsGroup implements Iterable<Student>{
    private List<Student> students;

    public StudentsGroup(List<Student> students) {
        this.students = students;
    }

    public int getSize() {
        return students.size();
    }

    public Student get(int index) {
        return students.get(index);
    }

    @Override
    public Iterator<Student> iterator() {
        return new ReversrIterator(this);
    }


}
