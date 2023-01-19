package HW5;

import java.util.List;
import java.util.Scanner;

import HW5.data.Student;

public class Menu {

    Controller controller = new Controller();
    Scanner in;

    public void buttonClick() {
        try (Scanner in = new Scanner(System.in)) {
            boolean stop = true;

            while (stop) {
                System.out.println(
                        "Menu:" + "\n0 - Вывести весь список студентов с их посещаемостью"
                                + "\n1 - Вывести отсортированный по убыванию посещаемости список студентов"
                                + "\n2 - Вывести студентов по заданной посещаемости" + "\n3 - Выход"
                                + "\nВвод: ");
                switch (in.next()) {
                    case "0":
                        List<Student> lst0 = controller.getSGroup();
                        controller.getAttendanceView().print(lst0);
                        System.out.println();
                        break;
                    case "1":
                        List<Student> lst1 = controller.sorStudents();
                        controller.getAttendanceView().print(lst1);
                        System.out.println();
                        break;
                    case "2":
                        System.out.println("Введите процент посещаемости: ");
                        float percent = in.nextFloat();
                        List<Student> lst2 = controller.filterStudents(percent);
                        controller.getAttendanceView().print(lst2);
                        System.out.println();
                        break;
                    case "3":
                        stop = false;
                        break;

                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }

    }
}
