package Entity;

public class Bill {
    Reservation reservation;
    double amount;
    boolean isPaid;

    public Bill(Reservation reservation, double amount) {
        this.reservation = reservation;
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


}
