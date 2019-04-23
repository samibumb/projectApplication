package main.Java.org.projectapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class VehicleRepository {

    private final static String url= "jdbc:mysql://localhost:3306/world";
    private final static String user="root";
    private final static String password="Material1!";

   public static void insertVehicleToDatabase(Vehicle vehicle){

      try {
          Connection connection= DriverManager.getConnection(url,user,password);

          PreparedStatement statement = connection.prepareStatement("insert into Vehicle(id,Brand,Model,Country,Year," +
                  "Fuel_type,Engine_size,Horsepower,Price) values(?,?,?,?,?,?,?,?,?)");

          statement.setInt(1,vehicle.getId());
          statement.setString(2,vehicle.getBrand());
          statement.setString(3,vehicle.getModel());
          statement.setString(4,vehicle.getCountry());
          statement.setInt(5,vehicle.getYear());
          statement.setString(6,vehicle.getFuel_Type());
          statement.setDouble(7,vehicle.getEngine_Size());
          statement.setInt(8,vehicle.getHorsepower());
          statement.setString(9,vehicle.getPrice());

          statement.execute();
          System.out.println("Vehicle inserted");
          statement.close();
          connection.close();
      }catch (Exception e){
          e.printStackTrace();
      }
   }
   public static void showAvailableCars(){
       try (Connection connection = DriverManager.getConnection(url, user, password)) {
       PreparedStatement preparedStatement = connection.prepareStatement("Select * from Vehicle");
           ResultSet resultSet = preparedStatement.executeQuery();
           System.out.println("Vehicle table with available cars:\nID/Brand/Model/Country/Year/Fuel_type/Engine_size/Horsepower/Price\n");
           while (resultSet.next()){
               System.out.println(resultSet.getString("id")+" "+resultSet.getString("Brand")+
                       " "+resultSet.getString("Model")+" "+resultSet.getString("Country")+
                       " "+resultSet.getString("Year")+" "+resultSet.getString("Fuel_type")+
                       " "+resultSet.getString("Engine_size")+" "+resultSet.getString("Horsepower")+
                       " "+resultSet.getString("Price"));

           }
       }catch (Exception e){
           e.printStackTrace();
       }

   }

   public static void main(String[] args){

//       Vehicle vehicle1 = new Vehicle(1, "Audi", "Q8", "Germany",
//               2018, "Diesel", 3.000, 286, "90.000€");

//       Vehicle vehicle2 = new Vehicle(2, "BMW", "320d", "Romania",
//               2019, "Diesel", 2.000, 184, "25.000€");
//
//       Vehicle vehicle3 = new Vehicle(3, "Mercedes-Benz", "C63S", "Germany",
//               2017, "Diesel", 4.000, 550, "70.000€");
//
//       Vehicle vehicle4 = new Vehicle(4, "Volkswagen", "Passat", "United Kingdom",
//               2018, "Diesel", 2.000, 170, "20.000€");
//
//       Vehicle vehicle5 = new Vehicle(5, "Audi", "Q5", " France",
//               2018, "Diesel", 2.000, 190, "50.000€");
//
//       Vehicle vehicle6 = new Vehicle(6, "Audi", "RS7", "Spain",
//               2019, "Diesel", 4.000, 605, "80.000€");
//
//       Vehicle vehicle7 = new Vehicle(7, "Mercedes", "G350", " Germany",
//               2019, "Diesel", 3.000, 333, "120.000€");
//       insertVehicleToDatabase(vehicle1);
//       insertVehicleToDatabase(vehicle2);
//       insertVehicleToDatabase(vehicle3);
//       insertVehicleToDatabase(vehicle4);
//       insertVehicleToDatabase(vehicle5);
//       insertVehicleToDatabase(vehicle6);
//       insertVehicleToDatabase(vehicle7);

         showAvailableCars();
   }
}
