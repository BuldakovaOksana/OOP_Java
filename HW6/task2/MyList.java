package HW6.task2;

import java.util.List;

public abstract class MyList<T> {
    public List<T> list;

    public void getSize() {
        System.out.println(list.size());
    }

    public void getInt(int i) {
        System.out.println(list.get(i));
    }

    public void getList() {
        System.out.println(list);

    }

    public MyList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "MyList [list=" + list + "]";
    }

}
