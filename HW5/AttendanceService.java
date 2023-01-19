package HW5;

import java.util.List;

import HW5.data.Student;
import HW5.data.StudentsGroup;

public class AttendanceService {
    private StudentsGroup studentsGroup = new StudentsGroup();

    public AttendanceService() {
        studentsGroup.addStudent(new Student("Lena"));
        studentsGroup.addStudent(new Student("Petr"));
        studentsGroup.addStudent(new Student("Ivan"));
        studentsGroup.addStudent(new Student("Katia"));
        studentsGroup.addStudent(new Student("Maria"));
    }

    @Override
    public String toString() {
        return studentsGroup.toString();
    }

    public List<Student> getStudentsGroup() {
        List<Student> copStudentsGroup = studentsGroup.getStudents();
        return copStudentsGroup;
    }

}
