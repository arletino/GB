package Java.HW06.service;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.SortedSet;

import Java.HW06.laptop.Laptop;

public class Menu {
    private Scanner scanner = new Scanner(System.in);
    private LinkedHashMap<String, String> params = new LinkedHashMap<>();
    private String search;
    private String action;

    public Menu() {
        System.out.print("\033[H\033[2J");
        System.out.println("Добро пожаловать");
        System.out.println("l - Вывести весь перечень ноутбуков");
        System.out.println("s - Поиск");
        System.out.println("f - Фильтрация по параметрам");
        System.out.println("q - Выход");
        this.action = scanner.next();

    }

    public String actionGet() {
        return this.action;
    }

    public void filterParamsSet() {
        System.out.println("Введите параметры: ");

        System.out.println("Введите поле для фильтра(name, ram, ssd, os, color):");
        this.params.put("field", this.scanner.next());
        System.out.println("Введите поле нижнюю границу(если вы хотите только меньше введите \"-1\"):");
        this.params.put("lower", this.scanner.next());
        System.out.println("Введите поле верхнюю границу(если вы хотите только больше введите \"-1\"):");
        this.params.put("higher", this.scanner.next());
    }

    public LinkedHashMap<String, String> filterParamsGet() {
        return this.params;
    }

    public void searchSet() {
        System.out.println("Ведите строку для поиска");
        this.search = this.scanner.next();
    }

    public String searchGet() {
        return this.search;
    }

    public void print(SortedSet<Laptop> laptops) {
        System.out.println("name  ram  ssd   os   color");
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }

    }

}
