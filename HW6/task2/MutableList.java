package HW6.task2;

import java.util.List;

public class MutableList extends MyList<Integer> {

    public MutableList(List<Integer> list) {
        super(list);
    }

    public void add(int i) {
        list.add(i);
    };

    public void remove(int i) {
        list.remove(i);
    };

    public void set(int i, int j) {
        list.set(i, j);
    };

}
