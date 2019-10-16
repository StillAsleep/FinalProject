

public abstract class RentWithoutDriver {

    String description="";

    public abstract double cost();

    public String getDescription(){
        return description;
    }

    public void prepareCar(String type) {
        System.out.println("Preparing " + type);
    }
}
