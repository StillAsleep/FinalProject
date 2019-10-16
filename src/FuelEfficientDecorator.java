/**
 * Creates a Fuel efficient package that will have higher mpg/higher mileage with cost and description
 */
public class FuelEfficientDecorator extends LongDistanceModeDecorator{

    RentWithoutDriver rentWithoutDriver;

    public FuelEfficientDecorator(RentWithoutDriver rentWithoutDriver) {
        this.rentWithoutDriver = rentWithoutDriver;
    }
    @Override
    public String getDescription() {
        return rentWithoutDriver.getDescription() + " with the Fuel Efficiency Package.";
    }

    @Override
    public double cost() {
        return 45 + rentWithoutDriver.cost();
    }

    
}