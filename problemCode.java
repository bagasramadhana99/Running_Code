class PaymentProcessor {
    public void processPayment(String paymentMethod) {
        if (paymentMethod.equals("credit_card")) {
            processCreditCard();
        } else if (paymentMethod.equals("paypal")) {
            processPayPal();
        }
    }

    private void processCreditCard() {
        // Logika pembayaran dengan kartu kredit
        System.out.println("Processing credit card payment...");
    }

    private void processPayPal() {
        // Logika pembayaran dengan PayPal
        System.out.println("Processing PayPal payment...");
    }
}
