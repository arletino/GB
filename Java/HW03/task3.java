package Java.HW03;


import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

class Answer {
    public static void analyzeNumbers(Integer[] arr) {
      // 
        ArrayList<Integer> temp = new ArrayList<Integer>( Arrays.asList(arr));
        Collections.sort(temp);
        System.out.println(temp);
        System.out.println("Minimum is "+ temp.get(0));
        System.out.println("Maximum is "+ temp.get(temp.size()-1));
        int average = (int) temp.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
        System.out.println("Average is = " + average);
       
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class task3{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.analyzeNumbers(arr);
    }
}