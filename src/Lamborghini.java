
/**
 * Creates a Lamborghini Gallardo. Extension of XL which is a template method
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lamborghini extends XL {

    double cost = 50;

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "Lamborghini Gallardo";
    }

    @Override
    public void getFood() {
        System.out.println("Your driver will stop to get you food if you ask.");

    }

    // hook
    public boolean customerWantsFood() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else if (answer.toLowerCase().startsWith("n")) {
            return false;
        } else
            return false;
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like your driver to get you food? (y/n)");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (answer == null) {
            answer = "no";
        }

        return answer;
    }

}