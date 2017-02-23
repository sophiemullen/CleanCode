package selfEvaluation_Lab3;


import org.assertj.core.api.AbstractMapAssert;
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

        String lastName;
        String firstName;
        int barcode= 0;
        int bonusPoints = 0;
        testCustomer = new Customer("Mullen","Sophie");
        testLoyaltyCard = new LoyaltyCard(1234,0);
        Shop.AddToMap(testCustomer,testLoyaltyCard);
        AbstractMapAssert equalTo = Assertions.assertThat(Shop.AddToMap(testCustomer,testLoyaltyCard)).isEqualTo("Mullen","Sophie", 1234, 0);
    }

    @Test
    public void testFindCustomerInMap()throws Exception{


    }




}
