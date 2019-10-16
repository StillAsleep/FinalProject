/**
 * Decorator that adds no modification other than the "normal" factory ones with
 * description and cost
 */
public class NormalDecorator extends NeedForSpeedModeDecorator {

    RentWithoutDriver rentWithoutDriver;

    public NormalDecorator(RentWithoutDriver rentWithoutDriver) {
        this.rentWithoutDriver = rentWithoutDriver;
    }

    @Override
    public String getDescription() {
        return rentWithoutDriver.getDescription() + " with the normal speed package.";
    }

    @Override
    public double cost() {
        return 50 + rentWithoutDriver.cost();
    }

}