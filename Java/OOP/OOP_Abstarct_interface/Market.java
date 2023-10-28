package Java.OOP.OOP_Abstarct_interface;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaverior, QueueBehavior {

    private final List<Actor> queue;

    public Market() {
        this.queue = new ArrayList<>();
    }

    @Override
    public void takeInQueue(Actor actor) {
        // TODO Auto-generated method stub
        System.out.println(actor.getName() + " got in Line");
        queue.add(actor);
    }

    @Override
    public void takeOrders() {
        // TODO Auto-generated method stub
        for (Actor actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " make order");
            }
        }
    }

    @Override
    public void giveOrders() {
        // TODO Auto-generated method stub
        for (Actor actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " get own order");
            }
        }
    }

    @Override
    public void relaseFromQueue() {
        // TODO Auto-generated method stub
        List<Actor> actorList = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) {
                actorList.add(actor);
                System.out.println(actor.getName() + " out from line");
            }
        }
    }

    @Override
    public void acceptToMarket(Actor actor) {
        // TODO Auto-generated method stub
        System.out.println(actor.getName() + " come in Market");
        takeInQueue(actor);
    }

    @Override
    public void relaseFromeMarket(List<Actor> actors) {
        // TODO Auto-generated method stub
        for (Actor actor : actors) {
            queue.remove(actor);
            System.out.println(actor.getName() + " out from market");
        }
    }

    @Override
    public void update() {
        // TODO Auto-generated method stub
        takeOrders();
        giveOrders();
        relaseFromQueue();
    }
}
