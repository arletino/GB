package Java.Laptop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Java.Laptop.controller.Controller;
import Java.Laptop.data.Laptop;
import Java.Laptop.menu.MainMenu;
import Java.Laptop.service.ServiceLaptop;

public class Main {
    public static void main(String[] args) {
        // MainMenu mainMenu = new MainMenu();
        // Laptop product1 = new Laptop("0", "1", "1", "1", 1, 1 );
        // Laptop product2 = new Laptop("1", "1", "1", "1", 1, 1 );
        // Laptop product3 = new Laptop("1", "1", "1", "1", 1, 1 );
        // List<Laptop> laptop = new ArrayList<>();
        // laptop.add(product1);
        // laptop.add(product2);
        // laptop.add(product3);
        
        // // menu.put("1", () -> System.out.println(product1.toString()));
        // // menu.put("2", () -> System.out.println(product2.toString()));
        // // System.out.println(laptop.toString());
        // laptop.remove(product2);
        // System.out.println(laptop);
        // // System.out.println(product1.equals(product2));
        // // Scanner scanner = new Scanner(System.in);
        // // String temp = scanner.next();
        // // menu.get(temp).run();;
        // while (new MainMenu().getAction() == "-1") {
        // Scanner scanner = new Scanner(System.in);
        // String temp = ""; 
        // while (!temp.equals("q")){
        //     temp = scanner.nextLine();
        //     System.out.println("ghbdtb");
        // }
        // scanner.close();
       Controller controller = new Controller();
       controller.createLaptop("Asus", "VivoBook", "Windows", "Black", "8", "128");
       controller.createLaptop("Acer", "VivoBook", "Windows", "Black", "16", "128");
       controller.createLaptop("Huawai", "VivoBook", "Windows", "Black", "8", "256");
       controller.createLaptop("Honor", "VivoBook", "Windows", "Black", "16", "128");
       controller.createLaptop("Azerty", "VivoBook", "Windows", "Black", "16", "256");
       controller.createLaptop("Acer", "VivoBook", "Windows", "Black", "16", "128");
       controller.createLaptop("CHUWI", "VivoBook", "Windows", "Black", "16", "128");
       controller.createLaptop("Thunderobot", "VivoBook", "Windows", "Black", "16", "128");
       controller.createLaptop(null, null, null, null, null, null);
       controller.createLaptop(" ", " ", " ", " ", "5", "5");
       controller.printOnConsole();
    //    controller.createOnConsole();
    //    controller.printOnConsole();
    //    controller.deleteLaptop();
    //    controller.printOnConsole();
            controller.crateFilter();
    

    }
}
