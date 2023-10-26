package Java.OOP.BasicOOP;

public class program {

    public static void main(String[] args) {
        VendingMachine machine1 = new VendingMachine();
        machine1.name = "Автомат 1";
        machine1.brand = "Производитель";
        machine1.price = 200;
        System.out.println(machine1.displayInfo());
    }
    
}
