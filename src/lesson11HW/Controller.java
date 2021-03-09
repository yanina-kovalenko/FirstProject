package lesson11HW;

public class Controller {
    API[] apis;

    public Controller(API[] apis) {
        this.apis = apis;
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {
        Room[] results = null;
        for (API api : apis) {
            if (api != null) {
                results = addAll(api.findRooms(price, persons, city, hotel), results);
            }
        }
        return results;
    }

    public Room[] check(API api1, API api2) {
        Room[] roomsApi1 = api1.getAll();
        Room[] roomsApi2 = api2.getAll();
        Room[] results = new Room[roomsApi1.length];
        int index = 0;
        for (int i = 0; i < roomsApi1.length; i++) {
            Room room = roomsApi1[i];
            for (Room room2 : roomsApi2) {
                if (room.equals(room2)) {
                    results[index++] = room;
                }
            }
        }
        return results;
    }

    public Room cheapestRoom() {
        Room cheapest = null;
        for (API api : apis) {
            if (api != null) {
                for (Room room : api.getAll()) {
                    if (cheapest == null) {
                        cheapest = room;
                    } else {
                        cheapest = room.getPrice() < cheapest.getPrice() ? room : cheapest;
                    }
                }
            }
        }
        return cheapest;
    }

    private Room[] addAll(Room[] from, Room[] to) {
        int actualSize = getNotNullObjectCount(from);
        if (to == null) {
            to = new Room[actualSize];
        }
        Room[] result = new Room[getNotNullObjectCount(to) + actualSize];
        for (int i = 0; i < result.length; i++) {
            if (i < actualSize) {
                result[i] = from[i];
            } else {
                result[i] = to[i - actualSize];
            }
        }
        return result;
    }

    private int getNotNullObjectCount(Room[] rooms) {
        int index = 0;
        for (Room room : rooms) {
            if (room != null) {
                index++;
            }
        }
        return index;
    }
}