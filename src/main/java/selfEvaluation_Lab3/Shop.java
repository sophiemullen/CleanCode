package selfEvaluation_Lab3;


import java.util.TreeMap;

public class Shop {

    public Customer customer;
    public LoyaltyCard loyaltyCard;
    public static TreeMap<Customer,LoyaltyCard> customerCard = new TreeMap<>();

    public Shop(Customer customer, LoyaltyCard loyaltyCard) {
        this.customer = customer;
        this.loyaltyCard = loyaltyCard;
    }


    public static TreeMap AddToMap(Customer customer, LoyaltyCard loyaltyCard) {
        customerCard.put(customer,loyaltyCard);
        return customerCard;
    }

}
