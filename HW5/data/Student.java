package HW5.data;

import java.util.List;

public class Student {
    private String name;
    private AttendanceLog attendance;

    public Student(String name) {
        this.name = name;
        attendance = new AttendanceLog();
    }

    public float attPercents() {
        List<Pair> copyList = attendance.getPairsList();
        int count = 0;
        for (int i = 0; i < copyList.size(); i++) {
            if (copyList.get(i).getIsAttendance().equals(true)) {
                count++;

            }
        }
        return 100 / copyList.size() * count;

    }

    @Override
    public String toString() {
        return name + "" + attPercents();
    }

    public String getName() {
        return name;
    }

    public AttendanceLog getAttendance() {
        return attendance;
    }

}
