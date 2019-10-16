/*
* Creates a Ford Mustang Shelby with cost and description
*/

public class FordMustangShelby extends RentWithoutDriver{

    public FordMustangShelby(){
        description = "Ford Mustang Shelby";
    }

    @Override
    public double cost() {
        return 700;
    }

}
