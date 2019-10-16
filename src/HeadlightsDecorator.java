/**
 * Decorator that adds custom headlights with description and cost
 */
public class HeadlightsDecorator extends GoodLookModeDecorator{

    RentWithoutDriver rentWithoutDriver;

    public HeadlightsDecorator(RentWithoutDriver rentWithoutDriver) {
        this.rentWithoutDriver = rentWithoutDriver;
    }

    @Override
    public String getDescription() {
        return rentWithoutDriver.getDescription() + " with the HID4 headlights Package.";
    }

    @Override
    public double cost() {
        return 20 + rentWithoutDriver.cost();
    }
    
}