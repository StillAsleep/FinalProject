/**
 * Decorator pattern that adds long distance packages to a car if needed
 */
public abstract class LongDistanceModeDecorator extends RentWithoutDriver{

    public abstract String getDescription();
}