package src.projectApp;

import java.util.ArrayList;
import java.util.List;

public class DealerAuto {

    List<Vehicle> vehicleList = new ArrayList<>();
    private String name;
    private String address;
    private String phoneNumber;

    public void addVehicleToDealerShip(Vehicle vehicle){
        vehicleList.add(vehicle);
    }

    public void sell(Vehicle vehicle){
        if (vehicleList.remove(vehicle)) {
            System.out.println("Vehicle sold\n");
        }
    }

    public void getStock(){
        System.out.println(name+" DealerShip has now "+vehicleList.size()+" cars in stock.");
        for (Vehicle list : vehicleList){
            System.out.println(list);
        }
    }


    public DealerAuto(String companyName , String address , String phoneNumber){

        this.name = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress(){
        return address;
    }


}
