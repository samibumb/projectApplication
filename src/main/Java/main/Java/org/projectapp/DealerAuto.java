package main.Java.org.projectapp;

import java.util.ArrayList;
import java.util.List;

public class DealerAuto {

    public List<Vehicle> vehicleList = new ArrayList<>();
    private String name;

    private String address;

    private String phoneNumber;

    private String eMail;

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


    public DealerAuto(String companyName , String address , String phoneNumber , String companyEMail){

        this.name = companyName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.eMail = companyEMail;
    }

    public String getName() {
        return name;
    }

    public String getAddress(){
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String geteMail(){
        return eMail;
    }
}
