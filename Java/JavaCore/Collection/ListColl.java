package Java.JavaCore.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести его на экран.
public class ListColl {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        fillList(list, 10, 0, 10);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<>()  ;
        fillList(list1, 10, 0, 10);
        list1.sort(Comparator.reverseOrder());
        System.out.println(list1);
    }
    public static void fillList(ArrayList<Integer> list, int n, int min, int max) {
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            list.add(random.nextInt(min, max + 1));
        }
    }
}
