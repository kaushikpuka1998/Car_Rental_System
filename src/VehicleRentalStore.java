import Entity.Location;
import Entity.Store;
import Entity.User;

import java.util.List;

public class VehicleRentalStore {
    List<User> users;
    List<Store> stores;

    public VehicleRentalStore(List<User> users, List<Store> stores) {
        this.users = users;
        this.stores = stores;
    }

    public Store getStore(Location location){
        for(Store store: stores){
            if(store.getLocation().equals(location)){
                return store;
            }
        }
        return null;
    }
}
