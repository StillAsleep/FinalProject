import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;

class MainTest {

        @Test
        void testMainWith() {
                // Setup
                final String suzuki = "Suzuki Celerio";
                final String toyota = "Toyota Corolla";
                final String rollsRoyce = "Rolls Royce";
                final String lamborghini = "Lamborghini Gallardo";
                Order order = new Order();
                CustomerServiceRep rep = new CustomerServiceRep();

                // Run the test
                RentWithDriverOrder withDriverOrder = new RentWithDriverOrder(order, suzuki);
                rep.takeOrder(withDriverOrder);
                assertEquals(withDriverOrder.rent, suzuki);

                RentWithDriverOrder withDriverOrder2 = new RentWithDriverOrder(order, toyota);
                rep.takeOrder(withDriverOrder2);
                assertEquals(withDriverOrder2.rent, toyota);

                RentWithDriverOrder withDriverOrder3 = new RentWithDriverOrder(order, lamborghini);
                rep.takeOrder(withDriverOrder3);
                assertEquals(withDriverOrder3.rent, lamborghini);

                // Should not pass
                RentWithDriverOrder withDriverOrder4 = new RentWithDriverOrder(order, toyota);
                rep.takeOrder(withDriverOrder4);
                assertEquals(withDriverOrder4.rent, suzuki);

                RentWithDriverOrder withDriverOrder5 = new RentWithDriverOrder(order, rollsRoyce);
                rep.takeOrder(withDriverOrder5);
                assertEquals(withDriverOrder5.order, rollsRoyce);
        }

        @Test
        void testMainWithout() {
                // Setup
                final String audi = "Audi";
                Order order = new Order();
                CustomerServiceRep rep = new CustomerServiceRep();
                final String bugatti = "Bugatti";
                final String ferrari = "Ferrari";
                final String tesla = "Tesla";
                ArrayList<String> nFSList = new ArrayList<>();
                ArrayList<String> longDistanceModeList = new ArrayList<>();
                ArrayList<String> goodLookList = new ArrayList<>();
                ArrayList<String> emptyList1 = new ArrayList<>();
                ArrayList<String> emptyList2 = new ArrayList<>();
                ArrayList<String> emptyList3 = new ArrayList<>();

                longDistanceModeList.add("Comfort");
                nFSList.add("Normal");
                goodLookList.add("Roof");

                String[] longDistanceArray = new String[longDistanceModeList.size()];
                longDistanceArray = longDistanceModeList.toArray(longDistanceArray);

                String[] speedArray = new String[nFSList.size()];
                speedArray = nFSList.toArray(speedArray);

                String[] goodLookArray = new String[goodLookList.size()];
                goodLookArray = goodLookList.toArray(goodLookArray);

                String[] emptyArray1 = new String[emptyList1.size()];
                emptyArray1 = emptyList1.toArray(emptyArray1);

                String[] emptyArray2 = new String[emptyList2.size()];
                emptyArray2 = emptyList2.toArray(emptyArray2);

                String[] emptyArray3 = new String[emptyList3.size()];
                emptyArray3 = emptyList3.toArray(emptyArray3);

                // Run Tests

                RentWithoutDriverOrder withoutDriverOrder = new RentWithoutDriverOrder(order, audi, emptyArray1,
                                emptyArray2, goodLookArray);
                rep.takeOrder(withoutDriverOrder);
                assertEquals(withoutDriverOrder.rent, audi);
                assertEquals(Arrays.toString(rentWithoutDriverOrder.goodLookList, goodLookList));

                RentWithoutDriverOrder withoutDriverOrder2 = new RentWithoutDriverOrder(order, bugatti,
                                longDistanceArray, emptyArray2, emptyArray3);
                rep.takeOrder(withoutDriverOrder2);
                assertEquals(withoutDriverOrder2.rent, bugatti);
                assertEquals(Arrays.toString(rentWithoutDriverOrder.longDistanceModeList, longDistanceModeList));

                RentWithoutDriverOrder withoutDriverOrder3 = new RentWithoutDriverOrder(order, ferrari, emptyArray1,
                                speedArray, emptyArray3);
                rep.takeOrder(withoutDriverOrder3);
                assertEquals(withoutDriverOrder3.rent, ferrari);

                // Should fail the next test
                assertNotEquals(Arrays.toString(rentWithoutDriverOrder.nFSList, nFSList));

                RentWithoutDriverOrder withoutDriverOrder4 = new RentWithoutDriverOrder(order, tesla, emptyArray1,
                                emptyArray2, emptyArray3);
                rep.takeOrder(withoutDriverOrder4);
                assertEquals(withoutDriverOrder4.rent, tesla);
        }
}
