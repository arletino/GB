// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, 
// который запишет эту строку в простой текстовый файл, обработайте исключения.
package Java.seminars.seminar_new;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task_1 {
    static Logger logger = Logger.getAnonymousLogger();
    public static void main(String[] args) {
        createLoger();
        String temp = "TEST";
        String pathName = "Java/seminars/seminar_new/test.txt";
        int n = 5;
        // System.out.println(repeat(temp, n));
        writeFile(repeat(temp, n), pathName);
        System.out.println(readFile(pathName));
        closeLogger();
    }

    public static String repeat(String args, int n) {
        StringBuilder stringBuilder = new StringBuilder(args);
        for (int i = 1; i < n; i++) {
            stringBuilder.append(" ");
            stringBuilder.append(args);
        }
        return stringBuilder.toString();
    }
    public static void writeFile(String args, String nameFile) {
        try {
            FileWriter writer = new FileWriter(nameFile);
            writer.write(args);
            writer.close();
            logger.info("Файл успешно сохранен");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            logger.warning("Сохранить не удалось");
            e.printStackTrace();
        }

    }
    public static String readFile(String nameFile) {
        String temp = "";
        try (Scanner scanner = new Scanner(new File(nameFile))) {
            temp = scanner.nextLine();
            
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return temp;
    }
    public static void createLoger() {
        try {
            FileHandler fileHandler = new FileHandler("log1.txt", true);
            SimpleFormatter simpleFormatter = new SimpleFormatter();
            fileHandler.setFormatter(simpleFormatter);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void closeLogger() {
       Handler[] temp = logger.getHandlers(); 
        for (Handler handler : temp) {
            handler.close();            
        }
    }
}

// nextPerebor(int[] perebor) {
//         for (int i = perebor.length - 1; i >= 0; i--) {
//             if (perebor[i] == 9){
//                 perebor[i] = 0;
//             } else {
//                 perebor[i]++;
//                 return true;
//             }
//         }
//         return false;
//     }
// }
