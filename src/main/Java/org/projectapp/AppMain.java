package main.Java.org.projectapp;


import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {

        Date date = new Date();

        Scanner scanner = new Scanner(System.in);
        int nrOfAttempts = 0, nrMaxAttempts = 3;
        boolean guess = false;

        System.out.println("---LOGIN---");

        while (guess != true && nrOfAttempts < nrMaxAttempts) {
            System.out.print("Username :");
            String userName = scanner.nextLine();

            System.out.print("Password :");
            String password = scanner.nextLine();

            if (userName.equals("samibumb") && password.equals("samieboss")) {
               try {
                   Thread.sleep(1000);
                   System.out.println(date);
                   Thread.sleep(1000);
               }catch (InterruptedException e){
                   System.out.println("");
               }

                guess = true;

               //Creating dealerAuto object
                DealerAuto dealerAuto = new DealerAuto("AutoWorld",
                        "Cluj-Napoca/Romania", "0264-436-905", "autoworld@audi.com");

                //Display informations about dealerAuto object
                try{ System.out.println("\nDealer " + dealerAuto.getName() + "\n" + "Address :" + dealerAuto.getAddress() + "\n"
                            + "Phone number :" + dealerAuto.getPhoneNumber() + "\n" + "Email :" + dealerAuto.geteMail() + "\n");
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println(e);
                }

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

                for (Vehicle vehicle : dealerAuto.vehicleList){
                    System.out.println(vehicle);
                }

                //selling the mentioned car to a random client
                dealerAuto.sell(vehicle1);

                //how much cars remained & cars
                dealerAuto.getStock();

                CEO ceo =new CEO("Bumb Samuel","0746564743.");



                try {
                    vehicle1.drive(55);
                } catch (Exception e) {
                    System.out.println("This happens when you violate the law " + e);
                }

            } else {
                System.out.println("Invalid username or password.Please try again!");
            }
            nrOfAttempts++;
        }
       try {
           if (nrOfAttempts==nrMaxAttempts){
               throw new Error("You have exceeded the number of attempts! ");
           }
       }catch (Error logging){
           System.out.println(logging+"Please , try again later!");
       }
    }
}
