/*
* Creates a Corvette Stingray with cost and description
*/

public class Corvette extends RentWithoutDriver{

    public Corvette(){
        description = "Corvette";
    }

    @Override
    public double cost() {
        return 10;
    }

}
