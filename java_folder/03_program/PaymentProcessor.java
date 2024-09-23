// PaymentMethod interface
interface PaymentMethod {
    void processPayment();
}

// Accept CreditCard payment
class CreditCardPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment");
    }
}

// Accept Debit card Payment
class DebitCardPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing debit card payment");
    }
}

// Accept UPI Payment
class UPIPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing UPI payment");
    }
}

// Netbanking Payment
class NetbankingPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing netbanking payment");
    }
}

// Bitcoins Payment methods
class BitcoinsPayment implements PaymentMethod {
    @Override
    public void processPayment() {
        System.out.println("Processing bitcoin payment");
    }
}

// PaymentProcessor class can process any payment method
public class PaymentProcessor {  // File name should match this class name
    public void process(PaymentMethod method) {
        method.processPayment();
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        PaymentMethod creditCardPayment = new CreditCardPayment();
        PaymentMethod debitCardPayment = new DebitCardPayment();
        PaymentMethod upiPayment = new UPIPayment();

        // Process different payments
        processor.process(creditCardPayment);
        processor.process(debitCardPayment);
        processor.process(upiPayment);
    }
}
