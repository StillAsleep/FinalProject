/*
* Creates an Audi A7 with cost and description
*/

public class Audi extends RentWithoutDriver{

    public Audi(){
        description = "Audi";
    }

    @Override
    public double cost() {
        return 10;
    }

}
