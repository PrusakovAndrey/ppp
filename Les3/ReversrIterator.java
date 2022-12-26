package Les3;

import java.util.Iterator;

public class ReversrIterator implements Iterator<Student> {

    private StudentsGroup studentsGroup;
    private int inx = 0;

    public ReversrIterator(StudentsGroup studentsGroup) {
        this.studentsGroup = studentsGroup;
    }

    @Override
    public boolean hasNext() {
        return (studentsGroup.getSize() - inx > 0);
    }

    @Override
    public Student next() {
        return studentsGroup.get(studentsGroup.getSize() - ++inx);
    }

}
