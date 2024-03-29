package Java.JavaCore.Map;
/* 
 * Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет. Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:
Input: s = "foo", t = "bar"
Output: false
Пример 2:
Input: s = "paper", t = "title"
Output: true
*/

import java.util.HashMap;

public class IzomorfString {
    public static void main(String[] args) {
        
    String word1 = "paker";
    String word2 = "title";
    System.out.println(izomorfCheck(word1, word2));
    }
    static boolean izomorfCheck(String word1, String word2){
        if (word1.length() != word2.length()){
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            if (map.containsKey(word1.charAt(i))){
                if (map.get(word1.charAt(i)) != word2.charAt(i)){
                    return false;
                }    
            } else {
                if (map.containsValue(word2.charAt(i))){
                    return false;
                }
                map.put(word1.charAt(i), word2.charAt(i));
            }
            
        }        
        return true;
    }
}
