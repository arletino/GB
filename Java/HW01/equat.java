package Java.HW01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Equation {
  public static String reader(String str) {
    String temp; 
    temp ="";
    try(FileReader reader = new FileReader(str)){
      BufferedReader br = new BufferedReader(reader);
      temp=br.readLine();
    }       
    catch(IOException ex){
      System.out.println(ex.getMessage());
    }
    return temp.replace(" ", "");
  }

  public static void getNums(String eq, String[] nums) {
    nums[0] = eq.substring(0, eq.indexOf("+"));
    nums[1] = eq.substring(eq.indexOf("+")+1, eq.indexOf("="));
    nums[2] = eq.substring(eq.indexOf("=")+1);
  }  
  public static String mathSearch(String[] nums) {
    int temp, x, y, len;
    len = nums[0].length() + nums[1].length();
    int[] intNum = new int[len];
    temp = Integer.parseInt(nums[2]);
    for (int i = 0; i < intNum.length; i++) {
      
    }
    
  return
  }
  public static String searchNum(String[] nums) {
    String temp;
    int a, b, c, i, j;
    i = 0;
    j = 0;
    a = 0;
    b = 0;
    c = Integer.parseInt(nums[2]);
    while ((a + b != c) && (i < 10)){
      a = Integer.parseInt(nums[0].replace("?", Integer.toString(i)));
      while (((a + b) != c) && (j < 10)) {
        b = Integer.parseInt(nums[1].replace("?", Integer.toString(j)));
        j++;
      }
      j = 0;
      i++;
    }
    if (a+b == c){
      temp = String.format("%d + %d = %d",a, b, c);
    }
    else{
      temp = "No solution";
    }
    return temp;
  }
  public static String getSolution(String str) {
      // Введите свое решение ниже
      String[] nums = new String[3];
      getNums(reader(str), nums); 
  return searchNum(nums);
  }
}



// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class equat{ 
    public static void main(String[] args) { 
      String file = "";
      
      if (args.length == 0) {
        file = "input.txt";
      }
      else{
        file = args[0];
      }     
      
      Equation eq = new Equation();
      String result = eq.getSolution(file);      
      System.out.println(result);
    }
}
