package HW3;

import java.util.Iterator;

public class ReversIterator implements Iterator<Student> {

    private StudentGroup studentGroup;
    public int index;

    public ReversIterator(StudentGroup studentGroup, int index) {
        this.studentGroup = studentGroup;
        this.index = index;
    }

    @Override
    public boolean hasNext() {
        return index >= 0;
    }

    @Override
    public Student next() {
        return studentGroup.get(index--);
    }

    public int getIndex() {
        return this.index;
    }

}
