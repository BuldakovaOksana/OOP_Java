# Репозиторий для сдачи домашних заданий по курсу JavaOOP


## HW1 (Домашнее задание по первому семинару)

### 1. (task1) При решении этих задач следуйте принципам абстракции, инкапсуляции, наследования, полиморфизма.

### Создайте унаследованный класс ГорячийНапиток с дополнительным полем int температура.

### Создайте класс АвтоматГорячихНапитков, реализующий интерфейс ТорговыйАвтомат и реализуйте перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт, соответствующий имени, объему и температуре.

### В main проинициализируйте несколько ГорячихНапитков и АвтоматГорячихНапитков и позвольте покупателю купить товар.


## HW2 (Домашнее задание по второму семинару)

### 1. (task1) Имеются данные о группе студентов. У каждого студента есть средний балл (например, 4.6).
### Создайте родительский класс ЗаписывательВФайл. Создайте три детских класса, которые записывают 
### в файл информацию о студентах в разных формах:
### Просто текст:
### Иван Иванов=4.8
### Мария Кузнецова=5.0
### Степан Кузьмин=3.6

### JSON:

### {
### "Иван Иванов": 4.8,
### "Мария Кузнецова": 5.0,
### "Степан Кузьмин": 3.6
### }

### XML:

### <?xml version="1.0" encoding="utf-8" ?>
### <students>
### <student>
### <name>Иван Иванов</name>
### <grade>4.8</grade>
### </student>
### <student>
### <name>Мария Кузнецова</name>
### <grade>5.0</grade>
### </student>
### <student>
### <name>Степан Кузьмин</name>
### <grade>3.6</grade>
### </student>
### </students>
