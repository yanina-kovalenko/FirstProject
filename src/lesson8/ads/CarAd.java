package lesson8.ads;

public class CarAd extends Ad  {
    String model;
    int yearOfManufacturing;
    String color;
    String ownerName;
    double weight;
    int horsePower;

    public CarAd(long id, int price) {
        super(id, price);
    }

    void confirmAdd() {
        //some logic
    }
}
