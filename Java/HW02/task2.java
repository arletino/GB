package Java.HW02;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;


class BubbleSort {
    private static File log;
    private static FileWriter fileWriter;
    public static void sort(int[] mas) {
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm ");
        Date d1 = new Date();
        log = new File("log.txt");
        try {
            fileWriter = new FileWriter(log, false);
            for (int i = 0; i < mas.length; i++) {
                int count = 0;
                for (int j = 0; j < mas.length - i -1; j++) {
                    if (mas[j] > mas[j+1]){
                        int temp = mas[j];
                        mas[j] = mas[j+1];
                        mas[j+1] = temp;
                        count++;
                    }
                }
                fileWriter.write(date.format(d1));
                fileWriter.write(Arrays.toString(mas));
                fileWriter.write("\n");    
                if (count == 0){break;}
                else {count = 0;}
            }
            fileWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
  }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class task2{ 
    public static void main(String[] args) { 
      int[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new int[]{9, 3, 4, 8, 2, 5, 7, 1, 6, 10};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
      }     
      
      BubbleSort ans = new BubbleSort();      
      ans.sort(arr);

      try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}