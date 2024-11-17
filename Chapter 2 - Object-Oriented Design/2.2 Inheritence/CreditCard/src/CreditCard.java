public class CreditCard {
    // Instance variables
    private String customer;        // name of the customer (e.g., "John Doe")
    private String bank;            // name of the bank (e.g., "Bank of America")
    private String account;         // account identifier (e.g., "5391 0375 9387 5309")
    private int limit;              // credit limit (measured in rands)
    protected double balance;       // current balance (measured in rands)

    // Constructors
    public CreditCard(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    public CreditCard(String customer, String bank, String account, int limit) {
        this(customer, bank, account, limit, 0.0);
    }

    // Accessor methods
    public String getCustomer() { return customer; }
    public String getBank() { return bank; }
    public String getAccount() { return account; }
    public int getLimit() { return limit; }
    public double getBalance() { return balance; }

    // Update methods

    /**
     * Method to make a charge to the card if the charge is less than the limit
     * @param price the amount to charge
     * @return true if the charge was accepted, false if the charge was denied
     */
    public boolean charge(double price) {
        if (price + balance > limit) {
            return false;
        }
        balance += price;
        return true;
    }

    /**
     * Method to make a payment to the card
     * @param amount the amount to pay
     */
    public void makePayment(double amount) {
        balance -= amount;
    }

    // Utility method to print a card's information
    public static void printSummary(CreditCard card) {
        System.out.println("\n *** Card Summary *** ");
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = R" + card.balance);  // implicit cast
        System.out.println("Limit = R" + card.limit);      // implicit cast
    }
}
