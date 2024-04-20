package Vehicles;

import Entity.Status;
import Entity.Vehicle;
import Entity.VehicleType;

public class Car extends Vehicle {
    public Car(String VehicleID, Entity.VehicleType VehicleType, String VehicleBrand, String VehicleModel, String occupancy, String VehicleColor, int dailyRentalCost, int hourlyRentalCost, Status status) {
        super(VehicleID, VehicleType, VehicleBrand, VehicleModel, occupancy, VehicleColor, dailyRentalCost, hourlyRentalCost, status);
    }
}
