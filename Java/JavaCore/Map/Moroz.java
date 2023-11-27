package Java.JavaCore.Map;
/*
 * Взять набор строк, например,
 * Мороз и солнце день чудесный 
 * Еще ты дремлешь друг прелестный 
 * Пора красавица проснись.
Написать метод, который отсортирует эти слова по длине с помощью TreeMap. 
Слова с одинаковой длиной не должны “потеряться”.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Moroz {
    public static void main(String[] args) {
        String string = "Мороз и солнце день чудесный\n"+
        "Еще ты дремлешь друг прелестный\n"+
        "Пора красавица проснись.";
        System.out.println(sortWordsLength(string).toString());
         
    }
    
    static Map<Integer, List<String>> sortWordsLength(String string){
        String[] poem = string.replace(".", "").replace("\n"," ").split(" ");
        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());
        
        for (String word : poem) {
            List<String> list1 = map.getOrDefault(word.length(), new ArrayList<>());
            list1.add(word);
            map.put(word.length(), list1);
        //     if(map.containsKey(word.length())){
        //        map.get(word.length()).add(word); 
        //     }
        //     else {
        //         List<String> value = new ArrayList<>();
        //         value.add(word); 
        //         map.put(word.length(), value);
        //     }
        // }
        return map;
    }
}
