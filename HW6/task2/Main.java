/*
 * ImmutableList<T> — коллекция, которая никогда ни при каких обстоятельствах не меняется. Методы:
• getSize ()
• get (int i)

MutableList<T> — коллекция, которая допускает изменения. Методы:
• getSize ()
• get (int i)
• set (int i, T newValue)
• add (T newValue)
• remove (T value)

Найдите наследование между этими классами, которое отвечает LSP.

 */


package HW6.task2;

import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>(Arrays.asList(6, 9, 9999, 987));
        LinkedList<Integer> lst2 = new LinkedList<>(Arrays.asList(43333, 4322349, 987));
        ImmutableList immutableList = new ImmutableList(lst);
        immutableList.getSize();
        immutableList.getList();
        immutableList.getInt(2);
        System.out.println();
        MutableList mutableList = new MutableList(lst2);
        mutableList.add(4);
        mutableList.add(3);
        mutableList.getList();
        mutableList.getInt(3);
        mutableList.remove(2);
        mutableList.getSize();
        mutableList.getList();
    }
}
