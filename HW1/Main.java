/*
 * При решении этих задач следуйте принципам абстракции, инкапсуляции, наследования, полиморфизма.

Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.

Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат и реализуйте перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт, соответствующий имени, объему и температуре.

В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков и позвольте покупателю купить товар.
 */
package HW1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<HotDrink> drinks = new LinkedList<>(List.of(new HotDrink(1, "Coffee", 100, 70),
                new HotDrink(1, "Coffee", 100, 80),
                new HotDrink(1, "Coffee", 100, 90),
                new HotDrink(1, "Coffee", 200, 70),
                new HotDrink(1, "Coffee", 200, 80),
                new HotDrink(1, "Coffee", 200, 90),
                new HotDrink(1, "Coffee", 400, 70),
                new HotDrink(1, "Coffee", 400, 80),
                new HotDrink(1, "Coffee", 400, 90),
                new HotDrink(2, "Cappuccino", 100, 70),
                new HotDrink(2, "Cappuccino", 100, 80),
                new HotDrink(2, "Cappuccino", 100, 90),
                new HotDrink(2, "Cappuccino", 200, 70),
                new HotDrink(2, "Cappuccino", 200, 80),
                new HotDrink(2, "Cappuccino", 200, 90),
                new HotDrink(2, "Cappuccino", 400, 70),
                new HotDrink(2, "Cappuccino", 400, 80),
                new HotDrink(2, "Cappuccino", 400, 90)));
        HotVendingMachine machine = new HotVendingMachine(drinks);

        machine.getDrink(getId(), getVolume(), getTemperature());

    }

    public static Integer getId() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер напитка: ");
        Integer drinkId = scanner.nextInt();

        return drinkId;

    }

    public static Integer getVolume() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите обьем напитка(100мл, 200мл, 400мл): ");
        Integer drinkVolume = scanner.nextInt();

        return drinkVolume;
    }

    public static Integer getTemperature() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру напитка(70°, 80°, 90°): ");
        Integer drintemperature = scanner.nextInt();

        return drintemperature;
    }
}
