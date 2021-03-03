package lesson11HW;

import java.util.Date;
import java.util.Objects;

public class Room {
    private long id;
    private int price;
    private int persons;
    private Date dateAvailableFrom;
    private String hotelName;
    private String cityName;

    public Room(long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    public long getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public int getPersons() {
        return persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return getPrice() == room.getPrice() &&
                getPersons() == room.getPersons() &&
                getHotelName().equals(room.getHotelName()) &&
                getCityName().equals(room.getCityName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getPersons(), getHotelName(), getCityName());
    }

    @Override
    public String toString() {
        return "id: " + getId()
                + "\nprice " + getPrice()
                + "\npersons " + getPersons()
                + "\nhotelName " + getHotelName()
                + "\ncityName " + getCityName();
    }
}
