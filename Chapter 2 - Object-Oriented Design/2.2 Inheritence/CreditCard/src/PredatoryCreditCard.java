public class PredatoryCreditCard extends CreditCard {
    // Additional instance variable
    private double apr;  // annual percentage rate

    // Constructor for this class
    public PredatoryCreditCard(String customer, String bank, String account, int limit, double balance, double rate) {
        super(customer, bank, account, limit, balance);  // initialize superclass attributes
        apr = rate;
    }

    // A new method for assessing monthly interest charges
    public void processMonth() {
        if (balance > 0) {  // only charge interest on a positive balance
            double monthlyFactor = Math.pow(1 + apr, 1.0/12);  // compute monthly interest rate
            balance *= monthlyFactor;  // apply interest
        }
    }

    // Overriding the charge method defined in the superclass
    public boolean charge(double price) {
        boolean isSuccess = super.charge(price);  // call inherited method
        if (!isSuccess) {
            balance += 5;  // assess a R5 penalty if charge is denied
        }
        return isSuccess;
    }
}
