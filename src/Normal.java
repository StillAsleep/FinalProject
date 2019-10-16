/**
 * Implements the template method. Creates the Normal class which is cheap with
 * features the cars extending this class will implement
 */
public abstract class Normal implements RentWithDriver {

    public abstract double cost();

    public abstract String getDescription();

    // template method
    @Override
    public void prepareCar() {
        shareCar();

        if (customerWantsNoConv()) {
            silence();
        }
    }

    public abstract void silence(); //implemented by cars that extend this class

    boolean customerWantsNoConv() {
        return true;
    }

    public void shareCar() {
        System.out.println("You will be sharing a ride until one of the passengers reach their destination.");
    }

}