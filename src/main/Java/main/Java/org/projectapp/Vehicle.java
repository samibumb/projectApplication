package main.Java.org.projectapp;

public class Vehicle implements Features {

    private int id;

    private String Brand;

    private String Model;

    private String Country;

    private int year;

    private String Fuel_Type;

    private double Engine_Size;

    private int Horsepower;

    private String price;

    private VehicleComposition composition;


    public Vehicle(int id, String brand, String model, String country, int year,
                   String fuel_Type, double engine_Size, int horsepower, String price , main.Java.org.projectapp.VehicleComposition vehicleComposition) {

        this.id = id;
        Brand = brand;
        Model = model;
        Country = country;
        this.year = year;
        Fuel_Type = fuel_Type;
        Engine_Size = engine_Size;
        Horsepower = horsepower;
        this.price = price;
        this.composition = vehicleComposition;
    }

    @Override
    public void drive(int speedInCity) throws Exception{
        if (speedInCity>60 && speedInCity<100){
            System.out.println("\nSoferul masinii "+Brand+" "+Model+" va avea primi amenda pentru ca a depasit" +
                    " viteza legala de 60km/h.");
            throw new Exception("Amend");
        }else if (speedInCity>100){
            System.out.println("\nSoferul masinii "+Brand+" "+Model+" va avea permisul suspendat pentru ca a depasit" +
                    " viteza maxima legala de 100km/h.");
            throw new Exception("Driver license SUSPENDED");
        }else{
            System.out.println("\n Have a nice trip!");
        }
    }

    @Override
    public void reverse() {
        System.out.println("Going back");
    }

    public String toString() {
        return "\n"+Brand+" "+Model+" "+ Country+" "+year+" "+
                " "+Fuel_Type+" "+Engine_Size+" "+Horsepower+" "+price+".\nCar contains :"+composition;
    }



}
