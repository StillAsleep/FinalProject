/**
 * Main class for the client
 */
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.IOException;

public class Main {
    static String carWithDriverType = "";

    public static void main(String[] args) {
        Order order = new Order();
        CustomerServiceRep rep = new CustomerServiceRep();

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("======================================");
            System.out.println("\n WELCOME TO THE RENTAL GENIE");
            System.out.println("\n======================================");
            System.out.println("\n What would you like to order?");
            System.out.println("\n 1. Car with Driver");
            System.out.println("\n 2. Car without Driver");
            System.out.println("\n 3. Exit");

            int ans = scan.nextInt();

            if (ans == 1) {
                Scanner scanWithDriver = new Scanner(System.in);
                System.out.println("\n -------------------- CARS WITH DRIVERS --------------------");
                System.out.println("\n (1) Suzuki Celerio--- $12/hr");
                System.out.println("\n (2) Toyota Corolla--- $14/hr");
                System.out.println("\n (3) Lamborghini Gallardo--- $50/hr");
                System.out.println("\n (4) Rolls Royce --- $80/hr");
                System.out.println("\n (5) Exit");

                int cars = scanWithDriver.nextInt();

                if (cars == 1) {
                    carWithDriverType = "Suzuki Celerio";
                    System.out.println("You have selected: ");
                    System.out.println("\n Suzuki Celerio");
                } else if (cars == 2) {
                    carWithDriverType = "Toyota Corolla";
                    System.out.println("You have selected: ");
                    System.out.println("\n Toyota Corolla");
                } else if (cars == 3) {
                    carWithDriverType = "Lamborghini Gallardo";
                    System.out.println("You have selected: ");
                    System.out.println("\n Suzuki Celerio");
                } else if (cars == 4) {
                    carWithDriverType = "Rolls Royce";
                    System.out.println("You have selected: ");
                    System.out.println("\n Rolls Royce");
                } else {
                    break;
                }

                System.out.println("\n Your car will be ready shortly");
                System.out.println("\n Please wait in our Customer Lounge until then");
                System.out.println("");

                // Send the order to the invoker of the command pattern

                RentWithDriverOrder withDriverOrder = new RentWithDriverOrder(order, carWithDriverType);
                rep.takeOrder(withDriverOrder);

            }

            else if (ans == 2) {
                ArrayList<String> nFSList = new ArrayList<>();
                ArrayList<String> longDistanceModeList = new ArrayList<>();
                ArrayList<String> goodLookList = new ArrayList<>();

                String carWithoutDriverType = null;
                String answer = null;

                while (true) {
                    System.out.println("Which car would you like to rent without a driver?");
                    System.out.println("\n(1) Audi A7--- $80/hr");
                    System.out.println("\n(2) Bugatti Veyron --- $300/hr");
                    System.out.println("\n(3) Corvette Stingray--- $100/hr");
                    System.out.println("\n(4) Ferrari Spyder --- $160/hr");
                    System.out.println("\n(5) Ford Mustang Shelby --- $90/hr");
                    System.out.println("\n(6) Porche Taycan Turbo--- $140/hr");
                    System.out.println("\n(7) Tesla Roadster--- $100/hr");
                    System.out.println("\n(8) Exit");

                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    // Catch exception
                    try {
                        answer = reader.readLine();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    if (answer.equals("1")) {
                        carWithoutDriverType = "Audi";
                        System.out.println("Audi A7 is chosen");
                        break;
                    } else if (answer.equals("2")) {
                        carWithoutDriverType = "Bugatti";
                        System.out.println("Bugatti Veyron is chosen.");
                        break;
                    } else if (answer.equals("3")) {
                        carWithoutDriverType = "Corvette";
                        System.out.println("Corvette Stingray is chosen.");
                        break;
                    } else if (answer.equals("4")) {
                        carWithoutDriverType = "Ferrari";
                        System.out.println("Ferrari Spyder is chosen.");
                        break;
                    } else if (answer.equals("5")) {
                        carWithoutDriverType = "Ford Mustang Shelby";
                        System.out.println("Ford Mustang Shelby is chosen.");
                        break;
                    } else if (answer.equals("6")) {
                        carWithoutDriverType = "Porsche";
                        System.out.println("Porsche Taycan Turbo is chosen.");
                        break;
                    } else if (answer.equals("7")) {
                        carWithoutDriverType = "Tesla";
                        System.out.println("Tesla Roadster is chosen.");
                        break;
                    } else {
                        continue;
                    }
                }
                System.out.println("");

                System.out.println("-------------------------- CAR MODIFICATIONS ----------------------------");
                Scanner scanMods = new Scanner(System.in);
                for (int i = 0; i < 4; i++) {
                    System.out.println("-------------------- Asthetic Modification --------------------");
                    System.out.println("(1) HID4 Headlights --- $20");
                    System.out.println("(2) Interior Lighting --- $45");
                    System.out.println("(3) Roof Wrap --- $10");
                    System.out.println("(4) Tinted Windows --- $50");
                    System.out.println("(5) Exit");

                    int a = scanMods.nextInt();

                    if (a == 1) {
                        goodLookList.add("Headlights");
                        System.out.println("The HID4 package was chosen");
                    } else if (a == 2) {
                        goodLookList.add("Interior");
                        System.out.println("The Interior Lighting package was chosen");
                    } else if (a == 3) {
                        goodLookList.add("Roof");
                        System.out.println("The Roof Wrap package was chosen");
                    } else if (a == 4) {
                        goodLookList.add("Tinted");
                        System.out.println("The Tinted Windows package was chosen");
                    } else
                        break;
                }
                System.out.println("Asthetic selection is complete");
                System.out.println("");

                Scanner scan2 = new Scanner(System.in);
                for (int i = 0; i < 2; i++) {
                    System.out.println("-------------------- Long Distance Modification --------------------");
                    System.out.println("(1) Comfort --- $50");
                    System.out.println("(2) Fuel Efficient --- $45");
                    System.out.println("(3) Exit");

                    int b = scan2.nextInt();

                    if (b == 1) {
                        longDistanceModeList.add("Comfort");
                        System.out.println("The Comfort package was chosen");
                    } else if (b == 2) {
                        longDistanceModeList.add("Fuel");
                        System.out.println("The Fuel Efficient package was chosen");
                    } else {
                        break;
                    }
                }
                System.out.println("Long Distance Mode selection is complete");
                System.out.println("");

                Scanner scan3 = new Scanner(System.in);
                for (int i = 0; i < 2; i++) {
                    System.out.println("-------------------- Need For Speed Modification --------------------");
                    System.out.println("(1) Normal --- $50");
                    System.out.println("(2) Modified --- $100");
                    System.out.println("(3) Exit");

                    int c = scan3.nextInt();

                    if (c == 1) {
                        nFSList.add("Normal");
                        System.out.println("The Normal Speed package was chosen");
                    } else if (c == 2) {
                        nFSList.add("Modified");
                        System.out.println("The Modified package was chosen");
                    } else {
                        break;
                    }
                }
                System.out.println("Need For Speed mode selection is complete");
                System.out.println("");

                System.out.println("\n Your car will be ready shortly");
                System.out.println("\n Please wait in our Customer Lounge until then");
                System.out.println("");

                String[] longDistanceArray = new String[longDistanceModeList.size()];
                longDistanceArray = longDistanceModeList.toArray(longDistanceArray);

                String[] speedArray = new String[nFSList.size()];
                speedArray = nFSList.toArray(speedArray);

                String[] goodLookArray = new String[goodLookList.size()];
                goodLookArray = goodLookList.toArray(goodLookArray);

                RentWithoutDriverOrder rentWithoutDriverOrder = new RentWithoutDriverOrder(order, carWithoutDriverType,
                        longDistanceArray, speedArray, goodLookArray);
                rep.takeOrder(rentWithoutDriverOrder);

            }

            else {
                System.out.println("-------------------------------------------------------------------------------");
                System.out.println("HAPPY DRIVING!");
                break;
            }
        }

    }

}