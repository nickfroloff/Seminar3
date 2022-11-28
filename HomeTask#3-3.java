// Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи.
// С помощью метода get() искать номер телефона по фамилии.
// Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
// тогда при запросе такой фамилии должны выводиться все телефоны.

package Seminar3;

public class PhoneBook {
    public static void PhoneBook() {
        Directory directory = new Directory();

        directory.add("Ivanov", "8000555666");
        directory.add("Ivanov", "8000777888");
        directory.add("Petrov", "8000999111");
        directory.add("Petrov", "80000222333");
        directory.add("Ivanov", "8000444555");
        directory.add("Sidorov", "8111332211");
        directory.add("Petrov", "8111445566");
        directory.add("Smirnov", "8111778899");
        directory.add("Sidorov", "8111225588");

        System.out.println(directory.get("Ivanov"));
        System.out.println(directory.get("Petorv"));
        System.out.println(directory.get("Sidorov"));
        System.out.println(directory.get("Smirnov"));
    }
}
