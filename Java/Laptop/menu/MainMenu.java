package Java.Laptop.menu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * MainMenu
 */
public class MainMenu {


    public MainMenu() {
        int action;
        do{
            printMainMenu();
            action = getAction();
        }
        while(action == -1);

    }

    static int getAction(){
        try {
            Scanner scanner = new Scanner(System.in);
            String tempAction = scanner.nextLine();    
            int action = Integer.parseInt(tempAction);
            scanner.close();
            return action;
        } catch (final NumberFormatException  e){
            System.out.println("Not corrected input");
            return -1;
        }
    }
    static void printMainMenu(){
        System.out.print("\033[H\033[2J");
        System.out.println("Добро пожаловать, выберете пункт меню:");
        System.out.println("1) - Меню работы записями");
        System.out.println("2) - Меню загрузки и сохранения");
        System.out.println("3) - Справка");
        System.out.println("4) - Выход");
    }

    static void printTableMenu(){
        System.out.print("\033[H\033[2J");
        System.out.println("1) - Отобразить перечень ноутбуков");
        System.out.println("2) - Добавить запись с ноутбуком");
        System.out.println("3) - Удалить запись с ноутбуком");
        System.out.println("4) - Поиск по вхождению");
        System.out.println("5) - Фильтрация по параметрам");
        System.out.println("6) - Возврат в предыдущее меню");
    }
    static void printFilterMenu(){
        System.out.print("\033[H\033[2J");
        System.out.println("1) - Производитель");
        System.out.println("2) - Модель");
        System.out.println("3) - Операционная система");
        System.out.println("4) - Объем памяти");
        System.out.println("5) - Объем диска");
        System.out.println("6) - Сбросить фильтр");
        System.out.println("7) - Возврат в предыдущее меню");
    }
    
    static void printFileMenu(){
        System.out.print("\033[H\033[2J");
        System.out.println("1) - Задать имя и путь для чтения из файла");
        System.out.println("2) - Загрузить записи из файла");
        System.out.println("3) - Добавить данные в файл");
        System.out.println("4) - Перезаписать данные в файл");
        System.out.println("5) - Возврат в предыдущее меню");
    }
    
}
