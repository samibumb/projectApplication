package main.Java.org.projectapp;


import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Date date = new Date();

        Scanner scanner = new Scanner(System.in);
        int nrOfAttemps = 0, nrMaxAttemps = 3;
        boolean guess = false;

        while (guess != true && nrOfAttemps < nrMaxAttemps) {

            System.out.println("Username and password :");
            String userName = scanner.nextLine();
            String password = scanner.nextLine();

            if (userName.equals("samibumb") && password.equals("samieboss")) {
                System.out.println(date);

                guess = true;

               //Creating dealerAuto object
                DealerAuto dealerAuto = new DealerAuto("AutoWorld",
                        "Cluj-Napoca/Romania", "0264-436-905", "autoworld@audi.com");

                //Display informations about dealerAuto object
                System.out.println("\nDealer " + dealerAuto.getName() + "\n" + "Address :" + dealerAuto.getAddress() + "\n"
                        + "Phone number :" + dealerAuto.getPhoneNumber() + "\n" + "Email :" + dealerAuto.geteMail() + "\n");

                System.out.println(dealerAuto.getName() + " Dealer from " + dealerAuto.getAddress() + " has the following cars:");

                //composition of vehicles & creating object carElements
                VehicleComposition carElements = new VehicleComposition("4 Michelin wheels", "Audi chassis",
                         4, "VG Motors", "CC system", "8-Speed TipTronic Gearbox");

                //creating vehicle objects
                Vehicle vehicle1 = new Vehicle(1, "Audi", "Q8", "Germany",
                        2018, "Diesel", 3.000, 286, "90.000€", carElements);

                Vehicle vehicle2 = new Vehicle(2, "Audi", "A7", "Romania",
                        2018, "Petrol", 3.000, 245, "65.000€", carElements);


                Vehicle vehicle3 = new Vehicle(3, "Audi", "Q5", " France",
                        2017, "Diesel", 2.000, 190, "50.000€", carElements);

                //adding the vehicles to dealerAuto list
                dealerAuto.addVehicleToDealerShip(vehicle1);
                dealerAuto.addVehicleToDealerShip(vehicle2);
                dealerAuto.addVehicleToDealerShip(vehicle3);

                // the cars in showroom with all specifications =]
                Iterator iterator = dealerAuto.vehicleList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }

                //selling the mentioned car to a random client
                dealerAuto.sell(vehicle1);

                //how much cars remained & cars
                dealerAuto.getStock();



                try {
                    vehicle1.drive(55);
                } catch (Exception e) {
                    System.out.println("This happens when you violate the law " + e);
                }

            } else {
                System.out.println("Invalid username or password.Please try again!");
            }
            nrOfAttemps++;


        }
        if (nrOfAttemps>nrMaxAttemps){
            throw new Error("Try again later");
        }

    }



}
