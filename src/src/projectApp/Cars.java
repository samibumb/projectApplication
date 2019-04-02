package src.projectApp;

public class Cars extends CarDealership{

    private int id;

    private String nameOfCar;

    private String carModel;

    private String priceInEuro;

    private int yearOfManufacture;

    private String fuel;

    private long kilometers;



    public Cars(){

}

    public Cars(int id ,String nameOfCar, String carModel, String priceInEuro,
                int yearOfManufacture, String fuel, long kilometers) {
        this.id = id;
        this.nameOfCar = nameOfCar;
        this.carModel = carModel;
        this.priceInEuro = priceInEuro;
        this.yearOfManufacture = yearOfManufacture;
        this.fuel = fuel;
        this.kilometers = kilometers;
    }

    public String toString(){
        return id+". "+nameOfCar+" "+carModel+" "+priceInEuro+" "+yearOfManufacture+" "+fuel+" "+kilometers;
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

    public String getNameOfCar() {
        return nameOfCar;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getPriceInEuro() {
        return priceInEuro;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public String getFuel() {
        return fuel;
    }

    public long getKilometers() {
        return kilometers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
