package Entity;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private String StoreID;
    private String StoreName;
    private Location Location;
    private VehicleInventoryManagement vehicleInventoryManagement;
    private List<Reservation> reservations = new ArrayList<>();

    public Store(String storeID, String storeName, Location location, VehicleInventoryManagement vehicleInventoryManagement) {
        StoreID = storeID;
        StoreName = storeName;
        Location = location;
        this.vehicleInventoryManagement = vehicleInventoryManagement;
    }

    public String getStoreID() {
        return StoreID;
    }

    public void setStoreID(String storeID) {
        StoreID = storeID;
    }

    public String getStoreName() {
        return StoreName;
    }

    public void setStoreName(String storeName) {
        StoreName = storeName;
    }

    public Entity.Location getLocation() {
        return Location;
    }

    public void setLocation(Entity.Location location) {
        Location = location;
    }

    public VehicleInventoryManagement getVehicleInventoryManagement() {
        return vehicleInventoryManagement;
    }

    public void setVehicleInventoryManagement(VehicleInventoryManagement vehicleInventoryManagement) {
        this.vehicleInventoryManagement = vehicleInventoryManagement;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    List<Vehicle> getVehicles(){
        return this.vehicleInventoryManagement.vehicles;
    }

    Reservation createReservation(Vehicle vehicle, User user){
        Reservation reservation = new Reservation();
        reservation.setVehicle(vehicle);
        reservation.setUser(user);
        reservations.add(reservation);
        return reservation;
    }




}
