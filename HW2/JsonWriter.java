/*
{
"Иван Иванов": 4.8,
"Мария Кузнецова": 5.0,
"Степан Кузьмин": 3.6
}
 */

package HW2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class JsonWriter implements Writer {

    @Override
    public void writer(Map<String, Double> students) {
        try (PrintWriter file = new PrintWriter("file.json", "UTF-8")) {
            int count = 1;
            file.println("{");
            for (Map.Entry<String, Double> entry : students.entrySet()) {
                if (count == 1) {
                    file.printf("\"%s\":%s", entry.getKey(), entry.getValue());
                } else {
                    file.printf(",\n\"%s\":%s", entry.getKey(), entry.getValue());
                }
                count++;
            }
            file.println("\n}");
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
