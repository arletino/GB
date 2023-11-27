// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов.
package Java.JavaCore.Map;

public class task {
    public static void main(String[] args) {
        Phone_db phone_db = new Phone_db();
        phone_db.addNote(123456, "Иванов");
        phone_db.addNote(321456, "Васильев");
        phone_db.addNote(234561, "Петрова");
        phone_db.addNote(234432, "Иванов");
        phone_db.addNote(654321, "Петрова");
        phone_db.addNote(345678, "Иванов");
        System.out.println(phone_db.getNotebyName("Иванов"));
    }
}
