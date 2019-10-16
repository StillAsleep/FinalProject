/*
* Creates a Ferrari Spyder with cost and description
*/

public class Ferrari extends RentWithoutDriver{

    public Ferrari(){
        description = "Ferrari";
    }

    @Override
    public double cost() {
        return 75;
    }

}
