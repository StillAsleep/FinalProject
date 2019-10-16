/**
 * Reciever structure of the command pattern. Takes in the orders from the
 * Factory patterns and sends it to the invoker to be executed
 */
public class Order {
    public static String carWithoutDriverType = "";
    public static String carWithDriverType = "";
    public static String[] longDistanceModeList = null;
    public static String[] nFSList = null;
    public static String[] goodLookList = null;
    RentWithDriver driver;
    RentWithoutDriver without;

    public void recieveOrder(String factoryType) {
        // Rent with driver order
        if (factoryType.equalsIgnoreCase("Driver")) {
            System.out.println(carWithDriverType + " order recieved");

            RentWithDriverFactory factory = new RentWithDriverFactory();
            driver = factory.rentCar(carWithDriverType);

            driver.prepareCar();

            System.out.println(driver.getDescription() + " order complete");
            System.out.println("Cost: $" + driver.cost() + " per hour");

            // Rent without driver order
        } else if (factoryType.equalsIgnoreCase("Without")) {
            System.out.println(carWithoutDriverType + " order recieved");

            RentWithoutDriverFactory factory = new RentWithoutDriverFactory();
            without = factory.rentCar(carWithoutDriverType);

            without.prepareCar(carWithoutDriverType);
            without = modify(longDistanceModeList, nFSList, goodLookList);

            System.out.println(without.getDescription() + " order complete");
            System.out.println("Cost: $" + without.cost() + " per hour");

        }
    }

    public RentWithoutDriver modify(String[] longDistanceModeList, String[] nFSList, String[] goodLookList) {
        for (int i = 0; i < longDistanceModeList.length; i++) {
            String longDistance = longDistanceModeList[i];
            if (longDistance.equals("Comfort")) {
                without = new ComfortDecorator(without);
            } else if (longDistance.equals("Efficient")) {
                without = new FuelEfficientDecorator(without);
            }
        }

        for (int i = 0; i < goodLookList.length; i++) {
            String asthetics = goodLookList[i];
            if (asthetics.equals("Lighting")) {
                without = new InteriorLightingDecorator(without);
            } else if (asthetics.equals("Headlights")) {
                without = new HeadlightsDecorator(without);
            } else if (asthetics.equals("Wrap")) {
                without = new RoofWrapDecorator(without);
            } else if (asthetics.equals("Tinted")) {
                without = new TintedWindowsDecorator(without);
            }
        }

        for (int i = 0; i < nFSList.length; i++) {
            String speed = nFSList[i];
            if (speed.equals("Normal")) {
                without = new NormalDecorator(without);
            } else if (speed.equals("Modified")) {
                without = new ModifiedDecorator(without);
            }
        }
        return without;
    }

}