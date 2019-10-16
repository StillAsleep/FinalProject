/**
 * Decorator that adds NOS, better exhaust pipes and plugs etc with description and cost
 */
public class ModifiedDecorator extends NeedForSpeedModeDecorator{

    RentWithoutDriver rentWithoutDriver;

    public ModifiedDecorator(RentWithoutDriver rentWithoutDriver) {
        this.rentWithoutDriver = rentWithoutDriver;
    }

    @Override
    public String getDescription() {
        return rentWithoutDriver.getDescription() + " with the Modified Car package.";
    }

    @Override
    public double cost() {
        return 100 + rentWithoutDriver.cost();
    }
    
}