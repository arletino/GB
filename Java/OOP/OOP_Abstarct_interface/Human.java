package Java.OOP.OOP_Abstarct_interface;

public class Human extends Actor {

    public Human(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {

        // TODO Auto-generated method stub
        super.isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean takeOrder) {
        // TODO Auto-generated method stub
        super.isTakeOrder = takeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        // TODO Auto-generated method stub
        return super.isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        // TODO Auto-generated method stub
        return super.isTakeOrder;
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.name;
    }
    
}
