public class Main {
    public static void main(String[] args) {
        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("Hector Mathonsi", "Standard Bank", "5391 0375 9387 5309", 5000);
        wallet[1] = new CreditCard("Hector Mathonsi", "ABSA", "3485 0399 3395 1954", 3500);
        wallet[2] = new CreditCard("Hector Mathonsi", "Capitec", "5391 0375 9387 5309", 2500, 300);

        // Charge some purchases
        for (int val = 1; val <= 16; val++) {
            wallet[0].charge(3 * val);
            wallet[1].charge(2 * val);
            wallet[2].charge(val);
        }

        // Make some payments
        for (CreditCard card : wallet) {
            CreditCard.printSummary(card);
            while (card.getBalance() > 200.0) {
                card.makePayment(200);
                System.out.println("New balance = R" + card.getBalance());
            }
        }
    }
}