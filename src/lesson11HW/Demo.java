package lesson11HW;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Room[] rooms = {
                new Room(334567333, 550, 2, new Date(), "Empire", "Kyiv"),
                new Room(334567335, 500, 2, new Date(), "Empire", "Kyiv"),
                new Room(111567111, 3700, 4, new Date(), "NEMO", "Kyiv"),
                new Room(224577222, 1000, 5, new Date(), "George", "Kyiv"),
                new Room(445677844, 2400, 2, new Date(), "Bartolomeo", "Dnipro"),
                new Room(554567555, 7000, 2, new Date(), "Bratislava", "Kyiv")
        };
        Room[] rooms2 = {
                new Room(1, 560, 2, new Date(), "Empire", "Kyiv"),
                new Room(2, 600, 2, new Date(), "Empire", "Kyiv"),
                new Room(3, 3600, 4, new Date(), "NEMO", "Kyiv"),
                new Room(4, 20, 5, new Date(), "George", "Kyiv"),
                new Room(5, 2400, 2, new Date(), "Bartolomeo", "Dnipro"),
                new Room(6, 7000, 2, new Date(), "Bratislava", "Kyiv")
        };
        API gApi = new GoogleAPI(rooms);
        API bApi = new BookingComAPI(rooms2);

        API[] apis = {
                new TripAdvisorAPI(rooms), gApi, bApi
        };
        Controller controller = new Controller(apis);
        controller.check(gApi, bApi);
        System.out.println(controller.check(gApi, bApi).toString());
        controller.cheapestRoom();
        controller.requestRooms(500, 2, "Kyiv", "Empire");
        System.out.println("\n\n" + controller.cheapestRoom().toString());
    }
}