package Java.seminars.seminar_1;

import java.time.LocalTime;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = iScanner.nextLine();
        LocalTime currentTime = LocalTime.now();
        if (currentTime.isAfter(LocalTime.of(5, 0, 0)) && currentTime.isBefore(LocalTime.of(12, 0, 0)))
            {
                System.out.println("Доброе утро" + name);    
            }
        else if  (currentTime.isAfter(LocalTime.of(12, 0, 0)) && currentTime.isBefore(LocalTime.of(18, 0, 0)))
            {
                System.out.println("Доброе утро" + name);    
            }
        else if  (currentTime.isAfter(LocalTime.of(18, 0, 0)) && currentTime.isBefore(LocalTime.of(5, 0, 0)))
            {
                System.out.println("Доброе утро" + name);    
            }              
        }
    }

