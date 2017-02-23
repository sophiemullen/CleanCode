package selfEvaluation_Lab3;


public class Customer {
    private Customer customer;
    private String lastName;
    private String firstName;


    public Customer(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

   public void Customer (String lastName, String firstName,int barcode, int bonusPoints){
        customer = new Customer(lastName,firstName);
   }
}
