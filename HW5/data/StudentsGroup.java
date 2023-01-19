package HW5.data;

import java.util.LinkedList;
import java.util.List;

public class StudentsGroup {
    private List<Student> students = new LinkedList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        List<Student> copySList = new LinkedList<>();
        copySList = students;
        return copySList;
    }

    @Override
    public String toString() {
        return students.toString();
    }

}
