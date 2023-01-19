package HW5;

import HW5.data.*;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    AttendanceService attendanceService;
    AttendanceView attendanceView;

    public Controller() {
        this.attendanceService = new AttendanceService();
        this.attendanceView = new AttendanceView();
    }

    public List<Student> getSGroup() {
        List<Student> copyStudents = new ArrayList<>();
        copyStudents = attendanceService.getStudentsGroup();
        List<Student> students = new ArrayList<>();
        for (Student student : copyStudents) {
            students.add(student);
        }
        return students;
    }

    public List<Student> sorStudents() {
        List<Student> copyStudents = new ArrayList<>();
        copyStudents = attendanceService.getStudentsGroup();
        Student temp;
        for (int i = 0; i < copyStudents.size(); i++) {
            for (int index = 0; index < copyStudents.size(); index++) {
                if (copyStudents.get(i).attPercents() < copyStudents.get(index).attPercents()) {
                    temp = copyStudents.get(index);
                    copyStudents.set(index, copyStudents.get(i));
                    copyStudents.set(i, temp);
                }
            }
        }
        return copyStudents;
    }

    public List<Student> filterStudents(float par) {
        List<Student> copyStudents = new ArrayList<>();
        copyStudents = attendanceService.getStudentsGroup();
        List<Student> result = new ArrayList<>();

        for (int i = 0; i < copyStudents.size(); i++) {
            if (copyStudents.get(i).attPercents() <= par) {
                result.add(copyStudents.get(i));
            }
        }
        return result;
    }

    public AttendanceService getAttendanceService() {
        return attendanceService;
    }

    public AttendanceView getAttendanceView() {
        return attendanceView;
    }

}
