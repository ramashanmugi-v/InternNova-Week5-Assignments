interface Payment {
    void pay();
    void showPaymentDetails();
}

class UPIPayment implements Payment {
    public void pay() {
        System.out.println("Payment completed using UPI.");
    }

    public void showPaymentDetails() {
        System.out.println("Payment Method: UPI");
        System.out.println("Amount: Rs. 1500");
    }
}

class CardPayment implements Payment {
    public void pay() {
        System.out.println("Payment completed using Debit Card.");
    }

    public void showPaymentDetails() {
        System.out.println("Payment Method: Debit Card");
        System.out.println("Amount: Rs. 2500");
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment upi = new UPIPayment();
        Payment card = new CardPayment();

        System.out.println("UPI Payment");
        upi.showPaymentDetails();
        upi.pay();

        System.out.println();

        System.out.println("Card Payment");
        card.showPaymentDetails();
        card.pay();
    }
}