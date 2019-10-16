
/** 
* Creates a Toyota Corolla with cost and description
*/
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Toyota extends Normal {

    double cost = 14;

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String getDescription() {

        return "Toyota Corolla";
    }

    @Override
    public void silence() {
        System.out.println("There will be silence.");
    }

    // hook
    public boolean customerWantsNoConv() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("n")) {
            return true;
        } else if (answer.toLowerCase().startsWith("y")) {
            return false;
        } else
            return false;
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like your driver to talk? (y/n)");

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