package lesson11HW;

public class BookingComAPI implements API {
    Room[] rooms;

    public BookingComAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] results = new Room[rooms.length];
        int index = 0;
        for (Room room : rooms) {
            if (room != null) {
                if (room.getPrice() >= (price - 50) && room.getPrice() <= (price + 50) && room.getPersons() == persons
                        && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
                    results[index++] = room;
                }
            }
        }
        return results;
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }

    // value1 = 50;
    // value2 = 150;
    // userValue = 100;
    //minValue = 50;
    //maxValue = 150;
}