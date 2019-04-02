package src.projectApp;

public class Cars extends CarDealership {

    private String nameOfCar;

    private String carModel;

    private String priceInEuro;

    private int yearOfManufacture;

    private String fuel;

    private long kilometers;

    public String toString(){
        return nameOfCar+" "+carModel+" "+priceInEuro+" "+yearOfManufacture+" "+fuel+" "+kilometers;
    }

    public void setNameOfCar(String nameOfCar) {
        this.nameOfCar = nameOfCar;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setPriceInEuro(String priceInEuro) {
        this.priceInEuro = priceInEuro;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setKilometers(long kilometers) {
        this.kilometers = kilometers;
    }
}
