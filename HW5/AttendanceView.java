package HW5;

import java.util.List;

import HW5.data.Student;

public class AttendanceView {
    public void print(List<Student> listStudents) {
        for (Object object : listStudents) {
            System.out.println(object);
        }
    }
}
