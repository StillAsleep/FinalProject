/**
 * Factory method that explains the renting with driver class.
 */
public class RentWithDriverFactory {

    public RentWithDriver rentCar(String carWithDriverType) {
        // Simple logic that establishes the different cars this factory is making
        if (carWithDriverType.equals(null)) {
            return null;
        } else if (carWithDriverType.equals("Suzuki Celerio")) {
            return new Suzuki();
        } else if (carWithDriverType.equals("Toyota Corolla")) {
            return new Toyota();
        } else if (carWithDriverType.equals("Rolls Royce")) {
            return new RollsRoyce();
        } else if (carWithDriverType.equals("Lamborghini Gallardo")) {
            return new Lamborghini();
        }
        return null;
    }
}