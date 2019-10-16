/*
* Creates an Bugatti Veyron with cost and description
*/

public class Bugatti extends RentWithoutDriver{

    public Bugatti(){
        description = "Bugatti";
    }

    @Override
    public double cost() {
        return 250;
    }

}
