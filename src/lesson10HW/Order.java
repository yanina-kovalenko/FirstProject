package lesson10HW;

import java.util.Date;

public abstract class Order {
    private String itemName;
    private Date dateCreated;
    private Date dateConfirmed;
    private Date dateShipped;
    private String shipFromCity;
    private String shipToCity;
    private int basePrice;
    private double totalPrice;

    private Customer customerOwned;

    public Order(String itemName, Date dateCreated, String shipFromCity, String shipToCity, int basePrice, Customer customerOwned) {
        this.itemName = itemName;
        this.dateCreated = dateCreated;
        this.shipFromCity = shipFromCity;
        this.shipToCity = shipToCity;
        this.basePrice = basePrice;
        this.customerOwned = customerOwned;
    }

    abstract void validateOrder();

    abstract void calculatePrice();

    public void confirmShipping() {
        if (dateShipped == null) {
            dateShipped = new Date();
        }
    }

    protected boolean isRangeContainsValue(String[] range, String value) {
        for (String el : range) {
            if (el.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "CustomerName: " + customerOwned.getName()
                + "\ngender " + customerOwned.getGender()
                + "\nitemName " + itemName
                + "\ndateCreated " + dateCreated
                + "\ndateConfirmed " + dateConfirmed
                + "\ndateShipped " + dateShipped
                + "\nshipFromCity " + shipFromCity
                + "\nshipToCity " + shipToCity
                + "\nbasePrice " + basePrice
                + "\ntotalPrice " + totalPrice;
    }

    public String getItemName() {
        return itemName;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getDateConfirmed() {
        return dateConfirmed;
    }

    public Date getDateShipped() {
        return dateShipped;
    }

    public String getShipFromCity() {
        return shipFromCity;
    }

    public String getShipToCity() {
        return shipToCity;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public Customer getCustomerOwned() {
        return customerOwned;
    }

    public void setDateConfirmed(Date dateConfirmed) {
        this.dateConfirmed = dateConfirmed;
    }

    public void setDateShipped(Date dateShipped) {
        this.dateShipped = dateShipped;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

