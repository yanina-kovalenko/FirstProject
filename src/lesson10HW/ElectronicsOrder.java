package lesson10HW;

import java.util.Date;

public class ElectronicsOrder extends Order {
    private int guaranteeMonth;
    final String[] allowedCities = {"Kiev", "Odessa", "Dnepr", "Kharkov"};

    public ElectronicsOrder(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned, int guaranteeMonth) {
        super(itemName, dateCreated, shipFromCity, shipToCity, basePrice, customerOwned);
        this.guaranteeMonth = guaranteeMonth;
    }

    @Override
    public void calculatePrice() {
        double shippingPrice = getBasePrice() * shippingCharge();
        setTotalPrice(shippingPrice + makeDiscount());
    }

    @Override
    public void validateOrder() {
        if (getCustomerOwned() != null) {
            if (isRangeContainsValue(allowedCities, getShipFromCity()) &&
                    isRangeContainsValue(allowedCities, getShipToCity()) &&
                    getCustomerOwned().getGender() == "female" && getBasePrice() >= 100) {
                calculatePrice();
                confirmShipping();
            }
        }
    }

    private double shippingCharge() {
        if (getShipToCity() == "Kiev" || getShipToCity() == "Odessa") {
            return 0.10;
        }
        return 0.15;
    }

    private double makeDiscount() {
        double basePrice = getBasePrice();
        if (basePrice > 1000) {
            basePrice = basePrice - (basePrice * 0.05);
        }
        return basePrice;
    }
}
