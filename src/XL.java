/**
 * Implements the template method. Creates the XL class which is expensive with
 * features the cars extending this class will implement
 */
public abstract class XL implements RentWithDriver {

    public abstract double cost();

    public abstract String getDescription();

    // template method
    @Override
    public void prepareCar() {
        setTemperature();
        listenToMusic();

        if (customerWantsFood()) {
            getFood();
        }
    }

    public abstract void getFood(); // implemented by cars that extend this class

    boolean customerWantsFood() {
        return true;
    }

    public void setTemperature() {
        System.out.println("You will have the option to change the temperature");
    }

    public void listenToMusic() {
        System.out.println("Music will be available");
    }
}