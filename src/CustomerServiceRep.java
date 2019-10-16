/**
 * Creates the invoker in a Command Pattern
 */
public class CustomerServiceRep {

    Command command;

    public void takeOrder(Command c){
        command = c;
        command.giveOrder();
    }
}