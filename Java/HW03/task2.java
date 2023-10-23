package Java.HW03;

import java.util.Arrays;
import java.util.ArrayList;

class RemEvenNum {
    public static void removeEvenNumbers(Integer[] arr) {
      // 
        ArrayList<Integer> temp = new ArrayList<Integer>(Arrays.asList(arr));
        for (int i = 0; i < arr.length; i   ++) {
            if (arr[i] % 2 == 0){
                temp.remove(arr[i]);
            }
        }
        arr = new Integer[temp.size()];
        arr = temp.toArray(arr); 
        System.out.println(Arrays.toString(arr));
        System.out.println(temp);    

       
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class task2{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      RemEvenNum ans = new RemEvenNum();      
      ans.removeEvenNumbers(arr);
    }
}