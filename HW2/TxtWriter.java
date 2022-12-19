/*
Иван Иванов=4.8
Мария Кузнецова=5.0
Степан Кузьмин=3.6
 */

package HW2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class TxtWriter implements Writer {

    @Override
    public void writer(Map<String, Double> students) {
        try (PrintWriter file = new PrintWriter("file.txt", "UTF-8")) {
            for (Map.Entry<String, Double> entry : students.entrySet()) {
                file.println(entry);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
