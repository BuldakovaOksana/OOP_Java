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

## HW3 (Домашнее задание по третьему семинару)

### Класс Группа содержит в себе коллекцию Студентов. По группе можно перемещаться с помощью итератора. 
### (Это повторяет 1-ю задачу из классной работы). Остальные задачи надстраиваются поверх неё.

### Создайте класс GroupListIterator, который позволяет перемещаться по группе в обоих направлениях.
### Он реализует интерфейс ListIterator<Student>.
### Добавьте в Группу метод listIterator (), который позволяет начать итерацию с помощью GroupListIterator.

### Создайте класс ReverseIterator, который работает как итератор по группе в обратном направлении:
### • Он отслеживает текущую позицию в переборе
### • Он изначально выставлен на конечную позицию
### • Он движется справа налево

## HW4 (Домашнее задание по четвертому семинару)

### Создайте интерфейс IsGood<T>. Внутри него содержится единственная функция:
### boolean isGood (T item);
### Создайте следующие детские классы:
### IsEven — ему дают целое число, он одобряет его, если оно чётное
### IsPositive — ему дают целое число, он одобряет его, если оно положительное
### BeginsWithA — ему дают строку, он одобряет её, если она начинается с буквы A
### BeginsWith — в конструкторе запоминает строку. Ему дают строку, он проверяет, что она начинается с того, что он запомнил
### Создайте обобщённую функцию filter. Ей дают любую коллекцию любого типа, и одобрятель IsGood. 
### Функция возвращает новую коллекцию, куда входят только одобренные элементы из коллекции.

## HW5 (Домашнее задание по пятому семинару)

### Напишите программу, позволяющую анализировать посещаемость студентов. Используйте паттерн MVP.
### Есть группа студентов. Для каждого студента есть журнал его посещаемости: 
### список дат занятий и для каждой даты — посетил студент занятие или нет. Создайте класс AttendanceService (сервис посещаемости), 
### в котором хранится информация обо всех студентах.
### Создайте класс AttendanceView, который позволяет отображать студентов и их посещаемость.
### Создайте класс presenter со следующими функциями:
### • Распечатать всех студентов и посещаемость каждого в процентах
### • Распечатать студентов, отсортировав их по убыванию посещаемости (вверху самые посещающие)
### • Распечатать студентов с посещаемостью ниже 25%

## HW6 (Домашнее задание по шестому семинару)

### 1. (task1)
### Пользователь выбирает способ разблокировки телефона: без пароля; пин; отпечаток пальца; лицо.
### class Unlocker {
### 	private int mode;  // режим
### 	private int pin;  // на случай пин-кода
### 	private String fingerprint;  // на случай отпечатка пальца
### 	private String faceID;  // на случай лица
### }
### Найдите решение, которое отвечает SRP и OCP

### 2. (task2)
### ImmutableList<T> — коллекция, которая никогда ни при каких обстоятельствах не меняется. Методы:
### • getSize ()
### • get (int i)

### MutableList<T> — коллекция, которая допускает изменения. Методы:
### • getSize ()
### • get (int i)
### • set (int i, T newValue)
### • add (T newValue)
### • remove (T value)
### Найдите наследование между этими классами, которое отвечает LSP.

## HW7 (Домашнее задание по седьмому семинару)

### Напишите приложение, которое позволяет пользователю управлять своим списком контактов.
### Используйте наследование, полиморфизм, принципы SOLID.
### Контрагент — это либо человек, либо компания.
### У каждого контрагента есть список способов связаться: телефон, email, ник в telegram, адрес страницы VK, уличный адрес. 
### Разрешается, что у одного контрагента сколько угодно способов связаться, например, несколько телефонов или несколько адресов.
### Программа должна позволять следующие действия:
### • Посмотреть список контрагентов
### • Найти контрагента по названию. Посмотреть подробную информацию о нём
### • Добавить контрагента
### • Удалить контрагента
### • Добавить новый способ связаться с контрагентом
### • Удалить способ связаться с контрагентом