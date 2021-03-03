package lesson11HW;

public class TripAdvisorAPI implements API {
    Room[] rooms;

    public TripAdvisorAPI(Room[] rooms) {
        this.rooms = rooms;
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] results = new Room[rooms.length];
        int index = 0;
        for (Room room : rooms) {
            if (room != null) {
                if (Utils.checkIsValueInRange(room.getPersons(), persons, 1) && room.getPrice() == price && room.getCityName().equals(city) && room.getHotelName().equals(hotel)) {
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
