// Interface untuk metode pembayaran
interface PaymentMethod {
    void process(); // Metode yang harus diimplementasikan oleh semua jenis pembayaran
}

// Implementasi pembayaran kartu kredit
class CreditCardPayment implements PaymentMethod {
    @Override
    public void process() {
        System.out.println("Processing credit card payment...");
    }
}

// Implementasi pembayaran PayPal
class PayPalPayment implements PaymentMethod {
    @Override
    public void process() {
        System.out.println("Processing PayPal payment...");
    }
}

// Implementasi pembayaran transfer bank
class BankTransferPayment implements PaymentMethod {
    @Override
    public void process() {
        System.out.println("Processing bank transfer payment...");
    }
}

// Kelas yang bertanggung jawab memproses pembayaran
class PaymentProcessor {
    public void processPayment(PaymentMethod paymentMethod) {
        paymentMethod.process(); // Panggil metode process() dari metode pembayaran yang diberikan
    }
}

// Kelas Main untuk menjalankan program
public class rplbk {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Memproses pembayaran dengan kartu kredit
        processor.processPayment(new CreditCardPayment());

        // Memproses pembayaran dengan PayPal
        processor.processPayment(new PayPalPayment());

        // Memproses pembayaran dengan transfer bank
        processor.processPayment(new BankTransferPayment());
    }
}

