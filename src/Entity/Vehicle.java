package Entity;

public class Vehicle {
    private String VehicleID;
    private VehicleType  VehicleType;
    private String VehicleBrand;
    private String VehicleModel;
    private String occupancy;
    private String VehicleColor;

    private int dailyRentalCost;
    private int hourlyRentalCost;

    private Status status;

    public Vehicle() {
    }

    public Vehicle(String VehicleID, VehicleType VehicleType, String VehicleBrand, String VehicleModel, String occupancy, String VehicleColor, int dailyRentalCost, int hourlyRentalCost, Status status) {
        this.VehicleID = VehicleID;
        this.VehicleType = VehicleType;
        this.VehicleBrand = VehicleBrand;
        this.VehicleModel = VehicleModel;
        this.occupancy = occupancy;
        this.VehicleColor = VehicleColor;
        this.dailyRentalCost = dailyRentalCost;
        this.hourlyRentalCost = hourlyRentalCost;
        this.status = status;
    }

    public String getVehicleID() {
        return VehicleID;
    }

    public void setVehicleID(String vehicleID) {
        VehicleID = vehicleID;
    }

    public Entity.VehicleType getVehicleType() {
        return VehicleType;
    }

    public void setVehicleType(Entity.VehicleType vehicleType) {
        VehicleType = vehicleType;
    }

    public String getVehicleBrand() {
        return VehicleBrand;
    }

    public void setVehicleBrand(String vehicleBrand) {
        VehicleBrand = vehicleBrand;
    }

    public String getVehicleModel() {
        return VehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        VehicleModel = vehicleModel;
    }

    public String getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(String occupancy) {
        this.occupancy = occupancy;
    }

    public String getVehicleColor() {
        return VehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        VehicleColor = vehicleColor;
    }

    public int getDailyRentalCost() {
        return dailyRentalCost;
    }

    public void setDailyRentalCost(int dailyRentalCost) {
        this.dailyRentalCost = dailyRentalCost;
    }

    public int getHourlyRentalCost() {
        return hourlyRentalCost;
    }

    public void setHourlyRentalCost(int hourlyRentalCost) {
        this.hourlyRentalCost = hourlyRentalCost;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
