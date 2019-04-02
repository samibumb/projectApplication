package src.projectApp;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args){

       Cars car = new Cars();
       car.setNameOfCar("Audi");
       car.setCarModel("A6");
       car.setPriceInEuro("30000€");
       car.setYearOfManufacture(2017);
       car.setFuel("Diesel");
       car.setKilometers(150);

        Cars car2 = new Cars();
        car2.setNameOfCar("Audi");
        car2.setCarModel("A7");
        car2.setPriceInEuro("25000€");
        car2.setYearOfManufacture(2015);
        car2.setFuel("Diesel");
        car2.setKilometers(30000);

        Cars car3 = new Cars();
        car3.setNameOfCar("Audi");
        car3.setCarModel("A5");
        car3.setYearOfManufacture(2014);
        car3.setPriceInEuro("15000€");
        car3.setFuel("Diesel");
        car3.setKilometers(150000);

        List<Cars> list = new ArrayList<>();

        list.add(car);
        list.add(car2);
        list.add(car3);

        for (Cars carList : list){
            System.out.println(carList);
        }

    }


}
