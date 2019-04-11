package main.Java.org.projectapp;

public class VehicleComposition {


    private String wheels;

    private String chassis;

    private int nrOfDoors ;

    private String engine;

    private String distributionSystem;

    private String gearBox;


    public VehicleComposition(String wheels , String chassis , int nrOfDoors , String Engine , String distributionSystem
                                ,String gearBox){
        this.wheels=wheels;
        this.chassis=chassis;
        this.nrOfDoors=nrOfDoors;
        engine = Engine;
        this.distributionSystem = distributionSystem;
        this.gearBox = gearBox;
    }

    public String toString(){
        return "\n-a number of "+ wheels+"\n-an "+chassis+"\n-a number of "+nrOfDoors+" doors."+"\n-the engine is from "+
                engine+" company\n-distribution system from "+distributionSystem+"\n-it has a "+gearBox;
    }
}
