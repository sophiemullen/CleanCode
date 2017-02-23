package selfEvaluation_Lab3;


public class LoyaltyCard {
    private LoyaltyCard loyaltyCard;
    private int barcode;
    private int bonusPoints;

    public LoyaltyCard(int barcode, int bonusPoints) {
        this.barcode = barcode;
        this.bonusPoints = bonusPoints;
    }



    public void addBarcodeToLoyaltyCard(int barcode, int bonusPoints){
        loyaltyCard = new LoyaltyCard(barcode,bonusPoints);}

        public LoyaltyCard getLoyaltyCard() {
            return loyaltyCard;
        }
}
