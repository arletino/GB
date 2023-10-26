package Java.JavaCore.Collection;
// Создать список типа ArrayList
// Поместить в него как строки, так и целые числа. 
// Пройти по списку, найти и удалить целые числа.
// list.add("apple");
//         list.add("5");
//         list.add("orange");
//         list.add("cucumber");
//         list.add("6");
//         list.add("100");
//         list.add("raisins");
//         list.add("meat");

import java.util.ArrayList;

public class ListColl2 {
   public static void main(String[] args) {
    ArrayList list = new ArrayList<>();
    fillList(list);
    System.out.println(list);
    for (int i = list.size()-1; i >= 0; i--) {
        if (list.get(i) instanceof Number){
            list.remove(i);
        }       
    }
    System.out.println(list);
   }
   public static void fillList(ArrayList list) {
        list.add("apple");
        list.add(5);
        list.add("orange");
        list.add("cucumber");
        list.add(6);
        list.add(100);
        list.add(12.3);
        list.add("raisins");
        list.add("meat");
   } 
}
