/**
 * Factory method that explains the renting without driver class.
 */
public class RentWithoutDriverFactory {

    public RentWithoutDriver rentCar(String carWithoutDriverType) {
    // If-else logic to establishe the different cars this factory is making
        if (carWithoutDriverType.equals(null)){
            return null;
        }
        else if(carWithoutDriverType.equals("Corvette")){
            return new Corvette();
        }
        else if(carWithoutDriverType.equals("Ford Mustang Shelby")){
            return new FordMustangShelby();
        }
        else if(carWithoutDriverType.equals("Bugatti")){
            return new Bugatti();
        }
        else if(carWithoutDriverType.equals("Porsche")){
            return new Porsche();
        }
        else if(carWithoutDriverType.equals("Ferrari")){
            return new Ferrari();
        }
        else if(carWithoutDriverType.equals("Audi")){
            return new Audi();
        }
        else if(carWithoutDriverType.equals("Tesla")){
            return new Tesla();
        }
        return null;
    }
}