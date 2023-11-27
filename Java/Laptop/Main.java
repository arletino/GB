package Java.Laptop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import Java.Laptop.data.Laptop;
import Java.Laptop.menu.MainMenu;

public class Main {
    public static void main(String[] args) {
        Laptop product1 = new Laptop("0", "1", "1", "1", 1, 1 );
        Laptop product2 = new Laptop("1", "1", "1", "1", 1, 1 );
        Laptop product3 = new Laptop("1", "1", "1", "1", 1, 1 );
        List<Laptop> laptop = new ArrayList<>();
        laptop.add(product1);
        laptop.add(product2);
        laptop.add(product3);
        
        // menu.put("1", () -> System.out.println(product1.toString()));
        // menu.put("2", () -> System.out.println(product2.toString()));
        // System.out.println(laptop.toString());
        laptop.remove(product2);
        System.out.println(laptop);
        // System.out.println(product1.equals(product2));
        // Scanner scanner = new Scanner(System.in);
        // String temp = scanner.next();
        // menu.get(temp).run();;
        while (new MainMenu().getAction() == "-1") {

        }
    }
}
