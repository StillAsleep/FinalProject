public class RentWithoutDriverOrder implements Command {

    Order order;
    String[] longDistanceModeList;
    String[] nFSList;
    String[] goodLookList;
    String rent;

    public RentWithoutDriverOrder(Order order, String rent, String[] longDistanceModeList, String[] nFSList, String[] goodLookList){
        this.nFSList = nFSList;
        this.goodLookList = goodLookList;
        this.longDistanceModeList = longDistanceModeList;
        this.order = order;
        this.rent = rent;
    }

    @Override
    public void giveOrder() {
        order.carWithoutDriverType = rent;
        order.goodLookList = this.goodLookList;
        order.longDistanceModeList = this.longDistanceModeList;
        order.nFSList = this.nFSList;
        order.recieveOrder("Without");
    }

}