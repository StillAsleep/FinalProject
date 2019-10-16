/**
 * Decorator that adds interior custom lighting with description and cost
 */
public class InteriorLightingDecorator extends GoodLookModeDecorator{

    RentWithoutDriver rentWithoutDriver;

    public InteriorLightingDecorator(RentWithoutDriver rentWithoutDriver) {
        this.rentWithoutDriver = rentWithoutDriver;
    }

    @Override
    public String getDescription() {
        return rentWithoutDriver.getDescription() + " with the Custom Interior Lighting Package.";
    }

    @Override
    public double cost() {
        return 45 + rentWithoutDriver.cost();
    }

    
}