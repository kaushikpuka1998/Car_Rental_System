package Entity;

public class Bill {
    Reservation reservation;
    double amount;
    boolean isPaid;

    public Bill(Reservation reservation) {
        this.reservation = reservation;
        this.reservation.status = ReservationStatus.PENDING;
        this.amount = computeBillAmount(reservation);
        this.isPaid = false;
    }

    public double computeBillAmount(Reservation reservation) {
        switch (reservation.getVehicle().getVehicleType()) {
            case CAR:
                return 50;
            case MOTORCYCLE:
                return 100;
            default:
                return 0; // or any other default value
        }
    }

    public Reservation payBill(Reservation reservation, PaymentType paymentType) {
        // logic to pay the bill
        double payableAmount = computeBillAmount(reservation);
        if(reservation.status == ReservationStatus.CONFIRMED){
            System.out.println("Reservation is already confirmed/Paid.");
            return reservation;
        }
        reservation.setStatus(ReservationStatus.ONGOING);
        switch (paymentType) {
            case ONLINE:
                // logic to pay online
                System.out.println(String.format("Paid %.2f online", payableAmount));
                break;
            case CASH:
                // logic to pay cash
                System.out.println(String.format("Paid %.2f in cash", payableAmount));
                break;
            case UPI:
                // logic to pay using UPI
                System.out.println(String.format("Paid %.2f using UPI", payableAmount));
                break;
            case CC:
                // logic to pay using credit card
                System.out.println(String.format("Paid %.2f using credit card", payableAmount));
                break;
            case DEBIT_CARD:
                // logic to pay using debit card
                System.out.println(String.format("Paid %.2f using debit card", payableAmount));
                break;
        }
        return reservation;
    }


}
