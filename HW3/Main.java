/*
Класс Группа содержит в себе коллекцию Студентов. По группе можно перемещаться с помощью итератора. 
(Это повторяет 1-ю задачу из классной работы). Остальные задачи надстраиваются поверх неё.

Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях.
Он реализует интерфейс ListIterator<Student>.
Добавьте в Группу метод listIterator (), который позволяет начать итерацию с помощью GroupListIterator.

Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
• Он отслеживает текущую позицию в переборе
• Он изначально выставлен на конечную позицию
• Он движется справа налево
 */

package HW3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Kate", LocalDate.of(2000, 1, 20), 4.5f));
        list.add(new Student("Petr", LocalDate.of(2001, 2, 21), 3.5f));
        list.add(new Student("Ivan", LocalDate.of(2002, 3, 22), 4.4f));
        list.add(new Student("Pavel", LocalDate.of(2003, 4, 23), 5.0f));

        StudentGroup studentGroup = new StudentGroup(list);

        Iterator<Student> iterator = studentGroup.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        ListIterator<Student> listIterator = studentGroup.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.nextIndex() + "\n" + listIterator.next());
        }
        System.out.println();

        ListIterator listIterator2 = studentGroup.listIterator();

        while (listIterator2.hasPrevious()) {
            System.out.println(listIterator2.previousIndex() + "\n" + listIterator2.previous());
        }
        System.out.println();

        Iterator<Student> revIter = studentGroup.revIterator();
        while (revIter.hasNext()) {
            for (int i = studentGroup.getSize() - 1; i >= 0; i--) {
                System.out.println(i);
                System.out.println(revIter.next());
            }
        }
    }
}
