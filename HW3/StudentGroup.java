package HW3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import seminar3.task1_1.StudentGroupIterator;

public class StudentGroup implements Iterable<Student> {

    List<Student> studentsList = new ArrayList<>();

    public StudentGroup(List<Student> studentsList) {
        this.studentsList = studentsList;
    }

    public int getSize() {
        return studentsList.size();
    }

    public Student get(int index) {
        return studentsList.get(index);
    }

    public ListIterator<Student> listIterator() {
        return new GroupListIterator(this);
    }

    public Iterator<Student> revIterator() {
        return new GroupListIterator(this);
    }

    @Override
    public String toString() {
        return "StudentGroup [studentsList=" + studentsList + "]";
    }

    @Override
    public Iterator<Student> iterator() {
        return new HW3.StudentGroupIterator(this);
    }

}
