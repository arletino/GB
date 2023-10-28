package Java.OOP.OOP_Abstarct_interface;

import java.util.ArrayList;
import java.util.List;

public class program {
    public static void main(String[] args) {
    Market market = new Market();
    Human person1 = new Human("Jon");
    Human person2 = new Human("Jin");
    Human person3 = new Human("Henry");
    Human person4 = new Human("Gerry");
    List<Human> persons = new ArrayList<>();
    persons.add(person1);
    persons.add(person2);
    persons.add(person3);
    persons.add(person4);
    for (Human human : persons) {
        market.acceptToMarket(human);
        market.update();    
    }
    
    }
}
