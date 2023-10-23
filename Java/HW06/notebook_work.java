package Java.HW06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

import Java.HW06.laptop.Laptop;
import Java.HW06.service.File_operation;
import Java.HW06.service.Filters;
import Java.HW06.service.Menu;
import Java.HW06.service.Search;
import Java.HW06.service.Comparators;

// Задание
// Подумать над структурой класса Ноутбук (Laptop) для магазина техники - выделить поля и методы. 
// Реализовать в java.
// Создать множество ноутбуков Set<Laptop>. (добиться чтобы во множестве не было одинаковых ноутбуков)
// (*) Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и 
// выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. 
// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …

// Далее нужно запросить минимальные значения для указанных критериев - 
// сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

public class notebook_work {
    public static void main(String[] args) {
        File_operation laptopsFile = new File_operation("Java/HW06/laptops.txt");
        laptopsFile.readFile();
        ArrayList<Laptop> fileBase = new ArrayList<>(laptopsFile.getFileListLaptops());
        SortedSet<Laptop> temp = new TreeSet<>();
        Menu menu = new Menu();
        String action = menu.actionGet();
        switch (action) {
            case "l":
                menu.print(temp = new TreeSet<>(fileBase));
                break;
            case "s":
                menu.searchSet();
                Search search = new Search(fileBase, menu.searchGet());
                menu.print(search.search());
                break;
            case "f":
                menu.filterParamsSet();
                Filters filter = new Filters(menu.filterParamsGet());
                if (filter.upperBorderGet() == "-1"){
                    for (Laptop laptop : fileBase) {
                        if ( filter.FieldL(laptop)){temp.add(laptop);}
                    }

                }
                else if (filter.downBorderGet() == "-1"){
                    for (Laptop laptop : fileBase) {
                        if ( filter.FieldH(laptop)){temp.add(laptop);}
                    }
                }
                else if (filter.downBorderGet() != "" && filter.upperBorderGet() != ""){
                    for (Laptop laptop : fileBase) {
                        if (filter.FieldSub(laptop)){
                            temp.add(laptop);
                        }
                    }
                menu.print(temp);
                }
                break;
            case "q":
                break;
        }

    }

}
