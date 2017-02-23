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
    Shop shop;



    @Test
    public void testCustomerAndCardAddedToMap()throws Exception{
        String lastName = "Mullen";
        String firstName = "Sophie";
        int barcode = 1234;
        int bonusPoints = 0;
        testCustomer = new Customer(lastName,firstName);
        testLoyaltyCard = new LoyaltyCard(barcode,bonusPoints);
        shop.AddtoMap(testCustomer,testLoyaltyCard);
        Assertions.assertThat(shop.AddtoMap(testCustomer, testLoyaltyCard)).isEqualTo("Sophie", "Mullen", 1234, 0);
    }

    @Test
    public void testFindCustomerInMap()throws Exception{


    }




}
