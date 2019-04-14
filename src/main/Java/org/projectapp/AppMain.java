package main.Java.org.projectapp;


import java.util.Iterator;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int nrOfAttemps = 0, nrMaxAttemps = 3;
        boolean guess = false;

        while (guess != true && nrOfAttemps < nrMaxAttemps) {

            System.out.println("Username and password :");
            String userName = scanner.nextLine();
            String password = scanner.nextLine();

            if (userName.equals("samibumb") && password.equals("samieboss")) {
                guess = true;
                DealerAuto dealerAuto = new DealerAuto("AutoWorld",
                        "Cluj-Napoca/Romania", "0264-436-905", "autoworld@audi.com");

                System.out.println("\nDealer " + dealerAuto.getName() + "\n" + "Address :" + dealerAuto.getAddress() + "\n"
                        + "Phone number :" + dealerAuto.getPhoneNumber() + "\n" + "Email :" + dealerAuto.geteMail() + "\n");

                System.out.println(dealerAuto.getName() + " Dealer from " + dealerAuto.getAddress() + " has the following cars:");

                VehicleComposition carElements = new VehicleComposition("4 Michelin wheels", "Audi chassis", 4
                        , "VG Motors", "CC system", "8-Speed TipTronic Gearbox");

                Vehicle vehicle1 = new Vehicle(1, "Audi", "Q8", "Germany",
                        2018, "Diesel", 3.000, 286, "90.000€", carElements);

                Vehicle vehicle2 = new Vehicle(2, "Audi", "A7", "Romania",
                        2018, "Petrol", 3.000, 245, "65.000€", carElements);


                Vehicle vehicle3 = new Vehicle(3, "Audi", "Q5", " France",
                        2017, "Diesel", 2.000, 190, "50.000€", carElements);

                dealerAuto.addVehicleToDealerShip(vehicle1);
                dealerAuto.addVehicleToDealerShip(vehicle2);
                dealerAuto.addVehicleToDealerShip(vehicle3);

                Iterator iterator = dealerAuto.vehicleList.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());
                }

                dealerAuto.sell(vehicle1);
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
            throw new Exception("Try again later");
        }

    }



}
