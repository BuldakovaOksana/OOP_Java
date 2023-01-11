/*
 * Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
boolean isGood (T item);
Создайте следующие детские классы:
IsEven — ему дают целое число, он одобряет его, если оно чётное
IsPositive — ему дают целое число, он одобряет его, если оно положительное
BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет, что она начинается с того, что он запомнил
Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и одобрятель IsGood. 
Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.

 */

package HW4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        IsEven approverIsEven = new IsEven();
        IsPositiv approverIsPositiv = new IsPositiv();
        BiginsWith approverBiginsWith = new BiginsWith("H");
        BiginsWithA approverBiginsWithA = new BiginsWithA();

        List<Integer> intList = new ArrayList<>(Arrays.asList(-22, 35, -55, 54, 85, -68));
        List<String> stringList = new ArrayList<>(Arrays.asList("Aghh", "ghj", "Hjhg", "Ahjg", "Hsdd"));

        System.out.println(filter(intList, approverIsEven));
        System.out.println(filter(intList, approverIsPositiv));
        System.out.println(filter(stringList, approverBiginsWith));
        System.out.println(filter(stringList, approverBiginsWithA));

    }

    public static <T> Iterable<T> filter(Iterable<T> collection, IsGood<T> approver) {
        Iterable<T> newCollection = collection;
        Iterator<T> iterator = newCollection.iterator();
        while (iterator.hasNext()) {
            if (!(approver.isGood(iterator.next()))) {
                iterator.remove();
            }
        }
        return newCollection;
    }

}
