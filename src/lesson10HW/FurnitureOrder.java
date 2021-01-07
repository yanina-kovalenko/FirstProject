package lesson10HW;

import java.util.Date;

public class FurnitureOrder extends Order {
    private String furnitureCode;
    final String[] allowedCities = {"Kiev", "Lvov"};

    public FurnitureOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, String furnitureCode) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.furnitureCode = furnitureCode;
    }

    @Override
    public void validateOrder() {
        if (getCustomerOwned() != null) {
            if (isRangeContainsValue(allowedCities, getShipFromCity()) && !getCustomerOwned().getName().equalsIgnoreCase("Test") && getBasePrice() >= 500) {
                calculatePrice();
                confirmShipping();
            }
        }
    }

    private double shippingCharge() {
        if (getBasePrice() < 5000) {
            return 0.05;
        }
        return 0.02;
    }

    @Override
    public void calculatePrice() {
        double shippingPrice = getBasePrice() * shippingCharge();
        setTotalPrice(shippingPrice + getBasePrice());
    }
}
