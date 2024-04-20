import Entity.Bill;
import Entity.Location;
import Entity.Payment;
import Entity.PaymentType;
import Entity.Reservation;
import Entity.Status;
import Entity.Store;
import Entity.User;
import Entity.Vehicle;
import Entity.VehicleInventoryManagement;
import Entity.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Car Rental System");
        System.out.println("==================");
        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicles();
        List<Store> stores = addStores(vehicles);

        VehicleRentalStore vehicleRentalStore = new VehicleRentalStore(users, stores);
        Location searchLocation = new Location( "Address 1", "City 1", "State 1", "735101");
        Store store = vehicleRentalStore.getStore(searchLocation);
        System.out.println("Store Name: " + store.getStoreName());

        Reservation reservation = store.createReservation(vehicles.get(0), users.get(0));
        System.out.println("Reservation ID: " + reservation.getReservationId());

        Bill bill = new Bill(reservation);
        System.out.println("Bill Amount: " + bill.computeBillAmount(reservation));
        bill.payBill(reservation, PaymentType.UPI);

        store.completeReservation(reservation, reservation.getReservationId());
        bill.payBill(reservation, PaymentType.UPI);
        store.completeReservation(reservation, reservation.getReservationId());







    }

    public static List<User> addUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User(12345, "John Doe", "DL001"));
        users.add(new User(12346, "Jane Doe", "DL002"));
        return users;
    }

    public static List<Store> addStores(List<Vehicle> vehicles) {
        VehicleInventoryManagement vehicleInventoryManagement = new VehicleInventoryManagement(new ArrayList<>());
        Store store  =new Store();
        store.setStoreID("S1");
        store.setStoreName("Store 1");
        store.setLocation(new Location( "Address 1", "City 1", "State 1", "735101"));
        store.setVehicle(vehicles);
        List<Store> stores = new ArrayList<>();
        stores.add(store);
        return stores;
    }

    public static List<Vehicle> addVehicles() {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("V1", VehicleType.CAR, "TOYOTA", "Sedan", "Black", "Green", 105, 40, Status.UNRESERVED));
        vehicles.add(new Vehicle("V2", VehicleType.CAR, "JEEP", "Sedan", "Black", "Green", 95, 50, Status.UNRESERVED));
        return vehicles;
    }
}