package Java.OOP.BasicOOP;

public class VendingMachine {
    
    String name;
    String brand;
    double price;

    String displayInfo(){
        return String.format("%s - %s - %.2f", brand, name, price);
    }

}
