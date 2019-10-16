
/*
* Creates an Rolls Royce with cost and description. Extends the XL template class and implements the hook.
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RollsRoyce extends XL {

    double cost = 80;

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {
        return "Rolls Royce";
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

    // Gets user input to plug into the hook
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