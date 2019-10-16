public class RentWithDriverOrder implements Command{

    String rent;
    Order order;
    public RentWithDriverOrder(Order order, String rent){
        this.order = order;
        this.rent = rent;
    }

    @Override
    public void giveOrder(){
        order.carWithDriverType = rent;
        order.recieveOrder("Driver");
    }
}