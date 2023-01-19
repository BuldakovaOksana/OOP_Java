package HW5.data;

import java.util.*;

public class AttendanceLog {
    private List<Pair> pairsList = new LinkedList<>();

    public AttendanceLog() {
        for (int i = 0; i < 5; i++) {
            pairsList.add(new Pair());
        }
    }

    public List<Pair> getPairsList() {
        return pairsList;
    }

    @Override
    public String toString() {
        return "AttendanceLog [pairsList=" + pairsList + "]";
    }

}
