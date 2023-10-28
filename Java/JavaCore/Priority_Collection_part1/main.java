package Java.JavaCore.Priority_Collection_part1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
// Если введено revert, удаляет предыдущую введенную строку из памяти.
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("my");
        list.add("name");
        list.add("Arkady");
        boolean flag = true;
        while (flag) {
            String temp = scanner.nextLine();
            switch (temp) {
                case "print":
                    ListIterator<String> iterator = list.listIterator(list.size());
                    // for (int i = list.size() -1 ; i >= 0; i--) {
                    //     System.out.print(list.get(i)+ ", ");
                    // }
                    while(iterator.hasPrevious()){
                       System.out.print(iterator.previous()+", "); 
                    }
                    System.out.println();
                    break;
                case "revert":
                    if (list.isEmpty()) {
                        System.out.println("В списке нет элементов, добавьте новый");
                    } else {
                        list.remove(list.size() - 1);
                    }
                    break;
                case "q":
                    flag = false;
                    break;
                default:
                    list.add(temp);

            }
        }
    }

}
