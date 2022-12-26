package Les3;

import java.util.Iterator;

/*Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях. 
Он реализует интерфейс ListIterator<Student>. */

public class GroupListIterator implements Iterator<Student>{
    private int inx = -1;
    private StudentsGroup studentsGroup;
    public GroupListIterator(StudentsGroup studentsGroup) {
        this.studentsGroup = studentsGroup;
    }
    @Override
    public boolean hasNext() {
        return (inx < studentsGroup.getSize()-1);
    }
    @Override
    public Student next() {
        return studentsGroup.get(++inx);
    }

    
}
