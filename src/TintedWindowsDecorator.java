/**
 * Decorater that adds the tinted window package with cost and description
 */
public class TintedWindowsDecorator extends GoodLookModeDecorator {

    RentWithoutDriver rentWithoutDriver;

    public TintedWindowsDecorator(RentWithoutDriver rentWithoutDriver) {
        this.rentWithoutDriver = rentWithoutDriver;
    }

    @Override
    public String getDescription() {
        return rentWithoutDriver.getDescription() + " with the Tinted Windows Package.";
    }

    @Override
    public double cost() {
        return 50 + rentWithoutDriver.cost();
    }

}