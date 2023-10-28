package Java.OOP.OOP_Abstarct_interface;

import java.util.List;

public interface MarketBehaverior {
    void acceptToMarket(Actor actor);

    void relaseFromeMarket(List<Actor> actors);

    void update();

}
