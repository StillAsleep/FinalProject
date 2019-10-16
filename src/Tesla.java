/*
* Creates a Tesla Roadster with cost and description
*/

public class Tesla extends RentWithoutDriver{

    public Tesla(){
        description = "Tesla Roadster";
    }

    @Override
    public double cost() {
        return 100;
    }

}
