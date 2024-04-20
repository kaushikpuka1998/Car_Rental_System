package Entity;

public class User {
    int userId;
    String username;
    String driverLicense;

    public User() {
    }

    public User(int userId, String username, String driverLicense) {
        this.userId = userId;
        this.username = username;
        this.driverLicense = driverLicense;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }
}
