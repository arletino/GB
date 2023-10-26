import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BottleOfWatter b1 = new BottleOfWatter("1", 1, 1);
        BottleOfWatter b2 = new BottleOfWatter("2", 2, 2);
        BottleOfWatter b3 = new BottleOfWatter("5", 4, 3);
        BottleOfWatter b4 = new BottleOfWatter("15", 123, 1);
        BottleOfWatter b5 = new BottleOfWatter("20", 6, 5);

        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(new ArrayList<>());
        vendingMachine.addBottleOfWater(b1);
        vendingMachine.addBottleOfWater(b2);
        vendingMachine.addBottleOfWater(b3);
        vendingMachine.addBottleOfWater(b4);
        vendingMachine.addBottleOfWater(b5);
        System.out.println(vendingMachine.getProduct("20", 5));
        System.out.println(vendingMachine.getProduct("20", 100));
//        for (BottleOfWatter b : vendingMachine.getBottleOfWatters()) {
//            System.out.println(b);
//        }
        HotDrink drink1 = new HotDrink("americano", 10, 5, 95);
        HotDrink drink2 = new HotDrink("espresso", 20, 6, 90);
        HotDrink drink3 = new HotDrink("cappuccino", 30, 4, 80);

        HotDrinksAutomat hotDrinksAutomat = new HotDrinksAutomat(new ArrayList<>());
        hotDrinksAutomat.addHotDrink(drink1);
        hotDrinksAutomat.addHotDrink(drink2);
        hotDrinksAutomat.addHotDrink(drink3);

        System.out.println(hotDrinksAutomat.getProduct("espresso",  6, 90));
        System.out.println(hotDrinksAutomat.getProduct("espresso",  6, 80));

    }

}