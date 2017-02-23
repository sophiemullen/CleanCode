package selfEvaluation_Lab3;


import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.TreeMap;

public class testShop {
    private String lastName;
    private String firstName;
    private Customer testCustomer;
    private LoyaltyCard testLoyaltyCard;
    private TreeMap<Customer,LoyaltyCard> testCard;



    @Test
    public void testCustomerAndCardAddedToMap()throws Exception{
        String lastName = "Mullen";
        String firstName = "Sophie";
        int barcode = 1234;
        int bonusPoints = 0;
        testCustomer = new Customer(lastName,firstName);
        testLoyaltyCard = new LoyaltyCard(barcode,bonusPoints);
        Shop.AddtoMap(testCustomer,testLoyaltyCard);
        Assertions.assertThat(Shop.AddtoMap(testCustomer,testLoyaltyCard).
    }

    @Test
    public void testFindCustomerInMap()throws Exception{


    }




}
