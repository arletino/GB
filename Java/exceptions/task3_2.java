package Java.exceptions;
// Запишите в файл следующие строки:
// Анна=4 [0] = Анна; [1] = 4;
// Елена=5
// Марина=6
// Владимир=?
// Константин=?
// Иван=4
// Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив 
// (либо HashMap, если студенты с ним знакомы). 
// В отдельном методе нужно будет пройти по структуре данных, если сохранено значение ?, 
// заменить его на соответствующее число.Если на каком-то месте встречается символ, отличный от числа или ?, 
// бросить подходящее исключение.Записать в тот же файл данные с замененными символами ?.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class task3_2 {
    public static void main(String[] args) {
        String path = "test";
        List<String[]> data = fileReader(path); 
        printConsole(data);
        checkList(data);
        printConsole(data);
        fileWriter(data, path);      
    }
    static void printConsole(List<String[]> data){
 
        for (String[] strings : data) {
            for (String strings2 : strings) {
                System.out.print(strings2);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static List<String[]> fileReader(String path){
        List<String[]> data = new ArrayList<>();
        String line = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            while((line = bufferedReader.readLine()) != null){
                data.add(line.split("="));
        }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return data;
    }
    static void fileWriter(List<String[]> data, String path){
            FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(path);
            for (String[] strings : data) {
                String line = strings[0] + "=" + strings[1] + "\n";
                fileWriter.write(line);    
            }
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
        
    }

    static void checkList(List<String[]> data){
        for (String[] line : data) {
            if (!line[1].equals("?") && !checkNum(line[1])){
            //    System.out.println("not number and not ? "+ line[1]); 
            } else{
                line[1] = "" + line[0].length(); 
            }
        }
    }

    static boolean checkNum(String str){
        try{
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e){
            System.out.println(e);
            return false;
        }
    }

}
