/**
 * Creates the comfort package for long distance rides with description and cost
 */
public class ComfortDecorator extends LongDistanceModeDecorator {

    RentWithoutDriver rentWithoutDriver;

    public ComfortDecorator(RentWithoutDriver rentWithoutDriver) {
        this.rentWithoutDriver = rentWithoutDriver;
    }

    @Override
    public String getDescription() {
        return rentWithoutDriver.getDescription() + " with the Comfort Package.";
    }

    @Override
    public double cost() {
        return 50 + rentWithoutDriver.cost();
    }

}