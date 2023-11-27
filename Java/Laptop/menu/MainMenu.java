package Java.Laptop.menu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public interface  MainMenu {
    public String action;

    public MainMenu() {
        Scanner scanner = new Scanner(System.in);
        Set<String> commands = new HashSet<>(Arrays.asList("l", "a", "d", "f", "p", "s", "S", "q"));
        System.out.print("\033[H\033[2J");
        System.out.println("Добро пожаловать, выберете пункт меню:");
        System.out.println("l - Вывести весь перечень ноутбуков");
        System.out.println("a - Добавить запись с ноутбуком");
        System.out.println("d - Удалить запись с ноутбуком");
        System.out.println("s - Поиск по вхождению");
        System.out.println("f - Фильтрация по параметрам");
        System.out.println("p - Задать имя и путь для чтения из файла");
        System.out.println("S - Сохранить перечень в файл");
        System.out.println("q - Выход");
        String tempAction = scanner.next();
        if (!commands.contains(tempAction)) {
            this.action = tempAction;
        } else {
            this.action = "-1";
        }
    }

    public String getAction() {
        return action;
    }

}
