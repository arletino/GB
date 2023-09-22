package Java.seminars.seminar_1;
import java.util.Scanner;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class task1{
    public static void main(String[] args) throws InterruptedException {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Hello World ");
        System.out.println(LocalTime.now());
        String name = iScanner.nextLine();
        iScanner.close();
        System.out.printf("%s %s", name, LocalDateTime.now());
        Thread.sleep(1000);
    }
    
    }
