/*
<?xml version="1.0" encoding="utf-8" ?>
<students>
<student>
<name>Иван Иванов</name>
<grade>4.8</grade>
</student>
<student>
<name>Мария Кузнецова</name>
<grade>5.0</grade>
</student>
<student>
<name>Степан Кузьмин</name>
<grade>3.6</grade>
</student>
</students>
 */

package HW2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

public class XmlWriter implements Writer {

    @Override
    public void writer(Map<String, Double> students) {
        try (PrintWriter file = new PrintWriter("file.xml", "utf-8")) {
            file.append("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");
            file.append("\n<students>\n");
            for (Map.Entry<String, Double> entry : students.entrySet()) {

                file.append("<student>\n");
                file.append("<name>" + entry.getKey() + "</name>\n");
                file.append("<grade>" + entry.getValue() + "</grade>\n");
                file.append("</student>\n");
            }
            file.append("/<students>\n");
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
