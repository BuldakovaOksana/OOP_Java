package HW3;

import java.time.LocalDate;

public class Student {
    private String name;
    private LocalDate date;
    private float mark;

    public Student(String name, LocalDate date, float mark) {
        this.name = name;
        this.date = date;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", date=" + date + ", mark=" + mark + "]";
    }

}
