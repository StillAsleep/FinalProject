/**
 * Decorator that extends the Good looks mode class. Creates a roof wrap
 * modification with cost and description
 */

public class RoofWrapDecorator extends GoodLookModeDecorator {

    RentWithoutDriver rentWithoutDriver;

    public RoofWrapDecorator(RentWithoutDriver rentWithoutDriver) {
        this.rentWithoutDriver = rentWithoutDriver;
    }

    @Override
    public String getDescription() {
        return rentWithoutDriver.getDescription() + " with the Roof Wrap Package.";
    }

    @Override
    public double cost() {
        return 10 + rentWithoutDriver.cost();
    }

}