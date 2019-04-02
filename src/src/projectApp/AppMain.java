package src.projectApp;

import java.util.ArrayList;
import java.util.List;

public class AppMain {
    public static void main(String[] args){

        List<Cars> list = new ArrayList<>();

        Cars car1=new Cars(1,"Audi","A6"
                ,"25000€",2016,"Diesel",30000);

        Cars car2=new Cars(2,"Audi","A7"
                ,"32250€",2015,"Diesel",30000);

        Cars car3=new Cars(3,"Audi","Q8"
                ,"60000€",2018,"Petrol",1000);

        Cars car4=new Cars(4,"Audi","A5"
                ,"54000€",2019,"Petrol",30000);


        CarDealership dealer = new CarDealership();
        dealer.addRow();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        System.out.println("List of cars :");
        for (Cars carList : list){
            System.out.println(carList);
        }


    }


}
