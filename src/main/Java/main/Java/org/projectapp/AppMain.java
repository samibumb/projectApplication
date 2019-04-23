package main.Java.org.projectapp;

import java.util.Date;

import java.util.Iterator;

import java.util.Scanner;


public class AppMain {
    public static void main(String[] args) {

        Date date = new Date();

        Scanner scanner = new Scanner(System.in);

        int nrOfAttempts = 0, nrMaxAttempts = 3;

        System.out.println("---LOGIN---");

        while (nrOfAttempts < nrMaxAttempts) {
            System.out.print("Username :");
            String userName = scanner.nextLine();

            System.out.print("Password :");
            String password = scanner.nextLine();

            if (userName.equals("samibumb") && password.equals("samieboss")) {
               try {
                   System.out.println(date);
                   Thread.sleep(1000);
               }catch (InterruptedException e){
                   e.printStackTrace();
               }

               /**Creating dealerAuto object*/
                DealerAuto dealerAuto = new DealerAuto("AutoWorld",
                        "Cluj-Napoca/Romania", "0264-436-905", "autoworld@audi.com");


               /**Display informations about dealerAuto object*/
                try{ System.out.println("\nDealer " + dealerAuto.getName() + "\n" + "Address :" + dealerAuto.getAddress() + "\n"
                            + "Phone number :" + dealerAuto.getPhoneNumber() + "\n" + "Email :" + dealerAuto.geteMail() + "\n");
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println(e);
                }

                System.out.println(dealerAuto.getName() + " Dealer from " + dealerAuto.getAddress() +
                                 " has the following cars:");

                /**composition of vehicles & creating object carElements*/
                VehicleComposition carElements = new VehicleComposition("4 Michelin wheels", "Audi chassis",
                         4, "VG Motors", "CC system", "8-Speed TipTronic Gearbox");

                VehicleComposition carElements1 = new VehicleComposition("Continental wheels","Audi chassis",
                        4,"Audi motors" ,"Audi system" , "7-Speed STronic Gearbox");


                /**creating vehicle objects*/
                Vehicle vehicle1 = new Vehicle(1, "Audi", "Q8", "Germany",
                        2018, "Diesel", 3.000, 286, "90.000€", carElements);

                Vehicle vehicle2 = new Vehicle(2, "BMW", "320d", "Romania",
                        2019, "Diesel", 2.000, 184, "25.000€", carElements1);

                Vehicle vehicle3 = new Vehicle(3, "Mercedes-Benz", "C63S", "",
                        2017, "Diesel", 2.000, 190, "50.000€", carElements);

                Vehicle vehicle4 = new Vehicle(4, "Volkswagen", "Q5", " France",
                        2017, "Diesel", 2.000, 190, "50.000€", carElements);

                Vehicle vehicle5 = new Vehicle(5, "Audi", "Q5", " France",
                        2017, "Diesel", 2.000, 190, "50.000€", carElements);

                Vehicle vehicle6 = new Vehicle(6, "Audi", "Q5", " France",
                        2017, "Diesel", 2.000, 190, "50.000€", carElements);

                Vehicle vehicle7 = new Vehicle(7, "Mercedes", "G350", " Germany",
                        2017, "Diesel", 2.000, 333, "120.000€", carElements);


                /**adding the vehicles to dealerAuto list*/
                dealerAuto.addVehicleToDealerShip(vehicle1);
                dealerAuto.addVehicleToDealerShip(vehicle2);
                dealerAuto.addVehicleToDealerShip(vehicle3);
                dealerAuto.addVehicleToDealerShip(vehicle4);
                dealerAuto.addVehicleToDealerShip(vehicle5);
                dealerAuto.addVehicleToDealerShip(vehicle6);
                dealerAuto.addVehicleToDealerShip(vehicle7);

                /**the cars in showroom with all specifications*/
                Iterator iterator = dealerAuto.vehicleList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }


                /**selling the mentioned car to a random client*/
                dealerAuto.sell(vehicle1);


                /**how much cars remained & cars*/
                dealerAuto.getStock();


                /**info's about chief executive officer*/
                CEO bumb_samuel =new CEO("Bumb Samuel","0746564743.");


                try {
                    vehicle1.drive(120);
                } catch (Exception e){
                    System.out.println("This happens when you violate the law " + e);
                }

                break;
            } else {
                System.out.println("Invalid username or password.Please try again!");
            }

            nrOfAttempts++;
        }
       try {
           if (nrOfAttempts>=nrMaxAttempts){

               throw new Error("You have exceeded the number of attempts! ");
           }
       } catch (Error logging){
           System.out.println(logging+"Please , try again later!");
       }
    }
}
