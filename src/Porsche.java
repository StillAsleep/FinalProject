/*
* Creates an Porsche Taycan Turbo with cost and description
*/

public class Porsche extends RentWithoutDriver{

    public Porsche(){
        description = "Porsche";
    }

    @Override
    public double cost() {
        return 3000;
    }

}
