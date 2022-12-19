/*
 * Имеются данные о группе студентов. У каждого студента есть средний балл (например, 4.6).

Создайте родительский класс ЗаписывательВФайл. Создайте три детских класса, которые записывают в файл информацию о студентах в разных формах:

Просто текст:

Иван Иванов=4.8
Мария Кузнецова=5.0
Степан Кузьмин=3.6
 */

package HW2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> student = new HashMap<>();
        student.put("Иван Иванов", 4.8);
        student.put("Мария Кузнецова", 5.0);
        student.put("Степан Кузьмин", 3.6);

        JsonWriter jsonWriter = new JsonWriter();
        jsonWriter.writer(student);
        TxtWriter txtWriter = new TxtWriter();
        txtWriter.writer(student);
        XmlWriter xmlWriter = new XmlWriter();
        xmlWriter.writer(student);
    }
}
