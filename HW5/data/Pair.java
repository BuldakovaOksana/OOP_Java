package HW5.data;

import java.time.LocalDate;
import java.util.Random;

public class Pair {
    private LocalDate date;
    private Boolean isAttendance;
    Random random = new Random();

    public Pair() {
        date = LocalDate.now();
        isAttendance = random.nextBoolean();
    }

    @Override
    public String toString() {
        return "Pair [date=" + date + ", isAttendance=" + isAttendance + "\n";
    }

    public Boolean getIsAttendance() {
        return isAttendance;
    }

}
