package Entity;

import java.util.Random;

public class Payment {

    Bill bill;
    String transactionID;
    PaymentStatus status;
    String paymentDate;
    PaymentType paymentType;

    public Payment() {
    }


    public void payBill(Bill bill,PaymentType paymentType) {
        this.bill = bill;
        this.transactionID = generateTransactionID();
        this.status = PaymentStatus.SUCCESS;
        this.paymentDate = currentDateTime();
        this.paymentType = paymentType;
    }

    private String generateTransactionID() {
        Random random = new Random();
        return String.valueOf(random.nextInt(1000000));
    }

    private String currentDateTime() {
        return java.time.LocalDateTime.now().toString();
    }
}
