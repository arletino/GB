package Java.seminars;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. 
// Распечатайте содержимое данного множества.
// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  
// Распечатайте содержимое данного множества.
// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  
// Распечатайте содержимое данного множества.
public class set_col {
    public static void main(String[] args) {    
        List<Integer> lst = new ArrayList<>(List.of(4, 4, 1, 2, 3, 2, 5, 6, 3));
        System.out.println(lst);
        Set<Integer> temp = new HashSet<>(lst);
        System.out.println(temp);
    
    }
}
