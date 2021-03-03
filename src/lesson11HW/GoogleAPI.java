package lesson11HW;

public class GoogleAPI implements API {
    Room[] rooms;

    public GoogleAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] results = new Room[rooms.length];
        int index = 0;
        for (Room room : rooms) {
            if (room != null) {
                if (room.getPrice() == price && room.getPersons() == persons && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
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
}
