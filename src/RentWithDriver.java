/**
 * Template method pattern that specifies the basic methods that are implemented
 * by different templates
 */
public interface RentWithDriver {

    public String getDescription();

    public double cost();

    public void prepareCar();
}